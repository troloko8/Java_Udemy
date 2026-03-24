package Naftoly.SpringBootECom.aop;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class PreformanceMonitorAspect {

    private static final Logger LOGGER = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* Naftoly.SpringBootECom.service.ProductService.getProductById(..)) || execution(* Naftoly.SpringBootECom.service.ProductService.getAllProducts(..))")
    public Object monitorTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object result = joinPoint.proceed();

        long endTime = System.currentTimeMillis();

        long duration = endTime - startTime;

        LOGGER.info("Method executed in " + duration * 0.001 + " seconds: " + joinPoint);

        return result;
    }
}
