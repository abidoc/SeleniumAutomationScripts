package com.logging;

import java.util.logging.LogManager;

import org.testng.annotations.Test;

public class LoggingTest {

	@Test
	public static void login() {
		LogManager.getLogger(LoggingTest.class);
	log.info("browser has been launched");
	log.warn("printing warning messages");
	log.debug("printing debug messages");
	log.error("printing error");
	log.fatal("printing fatal messages");
	log.info("completed");
		


	}
}