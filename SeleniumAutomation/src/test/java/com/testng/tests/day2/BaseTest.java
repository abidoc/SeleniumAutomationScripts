package com.testng.tests.day2;

import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest 
{
	@BeforeSuite
	public static void setUpSuite() {
		System.out.println("inside beforeSuite BaseTest class setUpSuite");
	}
	
	@AfterSuite
	public static void tearDownSuite() {
		System.out.println("inside afterSuite BaseTest class tearDownSuite");
	}
	@BeforeTest
	public static void setUpTest() {
		System.out.println("inside BeforeTest BaseTest class setUpTest");
		
	}

	@AfterTest
    public static void tearDownTest() {
	System.out.println("inside AfterTest BaseTest class tearDownTest");
	}
	@BeforeClass
	public static void setUpClass() {
		System.out.println("inside BeforeClass BaseTest class setUpClass");
		
	}
	@AfterClass
	public static void tearDownClass() {
		System.out.println("inside AfterClass BaseTest class tearDownClass");
		
	}
	public static void log() {
		Logger.log =LogManager.getLogger(LoggingTest.class);
	}
	
	
	
	
}


