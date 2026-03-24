package Naftoly.SpringBootECom.aop;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class ValidationAspect {

    private static final Logger LOGGER = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* Naftoly.SpringBootECom.service.ProductService.getProductById(..)) && args(id)")
    public Object monitorTime(ProceedingJoinPoint joinPoint , int id) throws Throwable {
        // Validate the id parameter
        if (id < 0) {
            LOGGER.warning("Invalid product ID: :" + id);

            id = -id; // Convert to positive for demonstration purposes
        }

        Object result = joinPoint.proceed(new Object[]{id});

        return result;
    }
}
