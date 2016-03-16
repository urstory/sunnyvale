package kr.co.sunnyvale.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	
	@Autowired
	private MessageSource messageSource;
	
	
	@RequestMapping( value = "/", method = RequestMethod.GET, headers = { "Accept=text/html" })
	public ModelAndView index( NativeWebRequest request ){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/index");
		return modelAndView;
	}
	
	
}