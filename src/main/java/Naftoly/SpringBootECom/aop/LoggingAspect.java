package Naftoly.SpringBootECom.aop;

import java.util.logging.Logger;

public class LoggingAspect {

    private static final Logger LOGGER = Logger.getLogger(LoggingAspect.class.getName());

    public void logMethodCall(String methodName) {
        LOGGER.info("Entering method: " + methodName);
    }
    
}
