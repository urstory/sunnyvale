package kr.co.sunnyvale.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

/**
 * 
 * @author urstory
 * 
 *         JoinPoint : 어떤 위치에 Advice를 적용할 것인가? Advice : 횡적관심사 - 메소드에 적용할 내용
 *         PointCut : 어떤 Advice가 어떤 JoinPoint에 적용될 것인가? Aspect는 위의 3가지를 하나의 클래스가
 *         구현.
 * 
 *         Aspect는 JoinPoint:
 * @Before (메소드가 시작할때)
 * @After (메소드가 종료될때)
 * @AfterThrowing (Exception이 발생할때)
 * @Around (Before + After)
 * 
 *         execution(public * kr.co.sunnyvale.yacamp.service.UserService.*(..))
 *         Advice 는 위의 Annotation이 적용될 메소드에 구현된 내용.
 * 
 *         cf) Controller에서는 Aspect가 사용되기 어려울 수 있음 ( 참고:
 *         http://whiteship.tistory.com/1124 )
 * 
 */
@Component
@Aspect
public class AllControllerAspect {
	
	@Autowired
	private MessageSource messageSource;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Around("execution(public * kr.co.sunnyvale.controller.web..*(..))")
	public Object methodArround(ProceedingJoinPoint joinPoint) throws Throwable {
		Object result = null;
		logger.debug("Proceed Start");
		result = joinPoint.proceed();
		logger.debug("Proceed End");
		return result;

	}

}
