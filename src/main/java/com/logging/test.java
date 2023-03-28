package com.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class test {

    private static final Logger logger = LogManager.getLogger(test.class);

    public static void main(String[] args) {
    	
    	 logger.debug("Debug log message");
         logger.info("Info log message");
         logger.error("Error log message");
         logger.warn("Warn log message");
         logger.fatal("Fatal log message");
         logger.trace("Trace log message");

         logger.debug("{}", () -> getNumber());
    }
    static int getNumber() {
        return 5;
    }
}