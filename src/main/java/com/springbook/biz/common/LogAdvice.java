package com.springbook.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect  // Aspect = Pointcut+Advice
public class LogAdvice {
	
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	public void allPointcut() {} // 포인트 컷(핵심)
	
	@Before("allPointcut()")
	public void printLog() {  //어드바이스(횡단)
		System.out.println("[공통 로그] 비즈니스 로직 수행 전 동작");
	}  
}
