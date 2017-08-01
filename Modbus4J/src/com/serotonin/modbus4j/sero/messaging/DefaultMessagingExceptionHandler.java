package com.serotonin.modbus4j.sero.messaging;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DefaultMessagingExceptionHandler implements MessagingExceptionHandler {
	Log log =LogFactory.getLog(DefaultMessagingExceptionHandler.class.getName());
    public void receivedException(Exception e) {
    	log.debug(e.getMessage());
//        e.printStackTrace();
    }
}
