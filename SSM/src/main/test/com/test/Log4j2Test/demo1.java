package com.test.Log4j2Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class demo1 {
	
	private static  Logger log = LogManager.getLogger(demo1.class);
	
	@Test
	public void demo() {
		log.trace("Entering application.");
		Bar bar = new Bar(); 
		if(!bar.doIt()) {
			log.error("Didn't do it");
		}
		log.trace("Exiting application.");
	}
}
