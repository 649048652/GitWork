package com.test.Log4j2Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bar {
	static Logger log = LogManager.getLogger(Bar.class.getName());
	
	public boolean doIt() {
		log.traceEntry();
		log.error("Did it again!");
		return log.traceExit(false);
	} 
}
