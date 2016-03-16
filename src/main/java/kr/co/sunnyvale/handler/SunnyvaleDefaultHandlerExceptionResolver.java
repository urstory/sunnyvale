package kr.co.sunnyvale.handler;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.core.Ordered;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;
import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;

public class SunnyvaleDefaultHandlerExceptionResolver extends
		AbstractHandlerExceptionResolver {


	public static final String PAGE_NOT_FOUND_LOG_CATEGORY = "org.springframework.web.servlet.PageNotFound";

	protected static final Log pageNotFoundLogger = LogFactory
			.getLog(PAGE_NOT_FOUND_LOG_CATEGORY);

	private final String pageErrorView = "/error/page";

	private final String exceptionErrorView = "/error/exception";
	
	public SunnyvaleDefaultHandlerExceptionResolver() {
		setOrder(Ordered.LOWEST_PRECEDENCE);
	}

	private ModelAndView returnAfterCheckJson(Exception ex,
			HttpServletRequest request, HttpServletResponse response,
			int HttpResponseType, String viewName) throws IOException {

		String accept = request.getHeader("accept");
		if (accept.matches(".*application/json.*") == true) {
			response.sendError(HttpResponseType);
			return new ModelAndView();
		}
		ModelAndView modelAndView = new ModelAndView(viewName);
		modelAndView.addObject("exception", ex);
		return modelAndView;
	}

	@Override
	protected ModelAndView doResolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {

		try {
			if (ex instanceof NoSuchRequestHandlingMethodException) {
				return handleNoSuchRequestHandlingMethod(
						(NoSuchRequestHandlingMethodException) ex, request,
						response, handler);
			} else if (ex instanceof HttpRequestMethodNotSupportedException) {
				return handleHttpRequestMethodNotSupported(
						(HttpRequestMethodNotSupportedException) ex, request,
						response, handler);
			} else if (ex instanceof HttpMediaTypeNotSupportedException) {
				return handleHttpMediaTypeNotSupported(
						(HttpMediaTypeNotSupportedException) ex, request,
						response, handler);
			} else if (ex instanceof HttpMediaTypeNotAcceptableException) {
				return handleHttpMediaTypeNotAcceptable(
						(HttpMediaTypeNotAcceptableException) ex, request,
						response, handler);
			} else if (ex instanceof MissingServletRequestParameterException) {
				return handleMissingServletRequestParameter(
						(MissingServletRequestParameterException) ex, request,
						response, handler);
			} else if (ex instanceof ServletRequestBindingException) {
				return handleServletRequestBindingException(
						(ServletRequestBindingException) ex, request, response,
						handler);
			} else if (ex instanceof ConversionNotSupportedException) {
				return handleConversionNotSupported(
						(ConversionNotSupportedException) ex, request,
						response, handler);
			} else if (ex instanceof TypeMismatchException) {
				return handleTypeMismatch((TypeMismatchException) ex, request,
						response, handler);
			} else if (ex instanceof HttpMessageNotReadableException) {
				return handleHttpMessageNotReadable(
						(HttpMessageNotReadableException) ex, request,
						response, handler);
			} else if (ex instanceof HttpMessageNotWritableException) {
				return handleHttpMessageNotWritable(
						(HttpMessageNotWritableException) ex, request,
						response, handler);
			} else if (ex instanceof MethodArgumentNotValidException) {
				return handleMethodArgumentNotValidException(
						(MethodArgumentNotValidException) ex, request,
						response, handler);
			} else if (ex instanceof MissingServletRequestPartException) {
				return handleMissingServletRequestPartException(
						(MissingServletRequestPartException) ex, request,
						response, handler);
			} else if (ex instanceof BindException) {
				return handleBindException((BindException) ex, request,
						response, handler);
			} else {
				return handleUnknownException(ex, request, response, handler);
			}
		} catch (Exception handlerException) {
			logger.warn("Handling of [" + ex.getClass().getName()
					+ "] resulted in Exception", handlerException);
		}
		return null;
	}

	

	protected ModelAndView handleUnknownException(Exception ex,
			HttpServletRequest request, HttpServletResponse response,
			Object handler) throws IOException {

		logger.debug("unknownException");
		return returnAfterCheckJson(ex, request, response,
				HttpServletResponse.SC_INTERNAL_SERVER_ERROR,
				exceptionErrorView);
	}
	
	
	protected ModelAndView handleNoSuchRequestHandlingMethod(
			NoSuchRequestHandlingMethodException ex,
			HttpServletRequest request, HttpServletResponse response,
			Object handler) throws IOException {

		logger.debug("handleNoSuchRequestHandlingMethod");
		pageNotFoundLogger.warn(ex.getMessage());

		return returnAfterCheckJson(ex, request, response,
				HttpServletResponse.SC_NOT_FOUND, pageErrorView);
	}

	protected ModelAndView handleHttpRequestMethodNotSupported(
			HttpRequestMethodNotSupportedException ex,
			HttpServletRequest request, HttpServletResponse response,
			Object handler) throws IOException {
		logger.debug("handleHttpRequestMethodNotSupported");
		pageNotFoundLogger.warn(ex.getMessage());
		String[] supportedMethods = ex.getSupportedMethods();
		if (supportedMethods != null) {
			response.setHeader("Allow",
					StringUtils.arrayToDelimitedString(supportedMethods, ", "));
		}
		return returnAfterCheckJson(ex, request, response,
				HttpServletResponse.SC_METHOD_NOT_ALLOWED, pageErrorView);

	}

	protected ModelAndView handleHttpMediaTypeNotSupported(
			HttpMediaTypeNotSupportedException ex, HttpServletRequest request,
			HttpServletResponse response, Object handler) throws IOException {
		logger.debug("handleHttpMediaTypeNotSupported");
		response.sendError(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE);
		List<MediaType> mediaTypes = ex.getSupportedMediaTypes();
		if (!CollectionUtils.isEmpty(mediaTypes)) {
			response.setHeader("Accept", MediaType.toString(mediaTypes));
		}

		return returnAfterCheckJson(ex, request, response,
				HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE, pageErrorView);
	}

	protected ModelAndView handleHttpMediaTypeNotAcceptable(
			HttpMediaTypeNotAcceptableException ex, HttpServletRequest request,
			HttpServletResponse response, Object handler) throws IOException {
		logger.debug("handleHttpMediaTypeNotAcceptable");

		return returnAfterCheckJson(ex, request, response,
				HttpServletResponse.SC_NOT_ACCEPTABLE, pageErrorView);
	}

	protected ModelAndView handleMissingServletRequestParameter(
			MissingServletRequestParameterException ex,
			HttpServletRequest request, HttpServletResponse response,
			Object handler) throws IOException {
		logger.debug("handleMissingServletRequestParameter");
		return returnAfterCheckJson(ex, request, response,
				HttpServletResponse.SC_BAD_REQUEST, pageErrorView);

	}

	protected ModelAndView handleServletRequestBindingException(
			ServletRequestBindingException ex, HttpServletRequest request,
			HttpServletResponse response, Object handler) throws IOException {
		logger.debug("handleServletRequestBindingException");
		return returnAfterCheckJson(ex, request, response,
				HttpServletResponse.SC_BAD_REQUEST, pageErrorView);
	}

	protected ModelAndView handleConversionNotSupported(
			ConversionNotSupportedException ex, HttpServletRequest request,
			HttpServletResponse response, Object handler) throws IOException {
		logger.debug("handleConversionNotSupported");
		return returnAfterCheckJson(ex, request, response,
				HttpServletResponse.SC_INTERNAL_SERVER_ERROR,
				exceptionErrorView);
	}

	protected ModelAndView handleTypeMismatch(TypeMismatchException ex,
			HttpServletRequest request, HttpServletResponse response,
			Object handler) throws IOException {
		logger.debug("handleTypeMismatch");
		return returnAfterCheckJson(ex, request, response,
				HttpServletResponse.SC_BAD_REQUEST, pageErrorView);
	}

	protected ModelAndView handleHttpMessageNotReadable(
			HttpMessageNotReadableException ex, HttpServletRequest request,
			HttpServletResponse response, Object handler) throws IOException {
		logger.debug("handleHttpMessageNotReadable");
		return returnAfterCheckJson(ex, request, response,
				HttpServletResponse.SC_BAD_REQUEST, pageErrorView);
	}

	protected ModelAndView handleHttpMessageNotWritable(
			HttpMessageNotWritableException ex, HttpServletRequest request,
			HttpServletResponse response, Object handler) throws IOException {
		ex.printStackTrace();
		logger.debug("handleHttpMessageNotWritable");
		return returnAfterCheckJson(ex, request, response,
				HttpServletResponse.SC_INTERNAL_SERVER_ERROR,
				exceptionErrorView);
	}

	protected ModelAndView handleMethodArgumentNotValidException(
			MethodArgumentNotValidException ex, HttpServletRequest request,
			HttpServletResponse response, Object handler) throws IOException {
		logger.debug("handleMethodArgumentNotValidException");
		return returnAfterCheckJson(ex, request, response,
				HttpServletResponse.SC_BAD_REQUEST, pageErrorView);
	}

	protected ModelAndView handleMissingServletRequestPartException(
			MissingServletRequestPartException ex, HttpServletRequest request,
			HttpServletResponse response, Object handler) throws IOException {
		return returnAfterCheckJson(ex, request, response,
				HttpServletResponse.SC_BAD_REQUEST, pageErrorView);
	}

	protected ModelAndView handleBindException(BindException ex,
			HttpServletRequest request, HttpServletResponse response,
			Object handler) throws IOException {
		logger.debug("handleBindException");
		return returnAfterCheckJson(ex, request, response,
				HttpServletResponse.SC_BAD_REQUEST, pageErrorView);
	}

}
