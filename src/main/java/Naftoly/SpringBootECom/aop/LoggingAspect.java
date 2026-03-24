package Naftoly.SpringBootECom.aop;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = Logger.getLogger(LoggingAspect.class.getName());

    // return type, class name, method name, and (parameters)
    // all all.all ..all

    // @Before("execution(* *.*(..))")
    @Before("execution(* Naftoly.SpringBootECom.service.ProductService.*(..))")
    public void logMethodCall(JoinPoint joinPoint) {
        LOGGER.info("Entering method: " + joinPoint);
    }
    
}
