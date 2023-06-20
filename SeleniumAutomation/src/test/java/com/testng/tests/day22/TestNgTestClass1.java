package com.testng.tests.day22;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.testng.tests.day2.BaseTest;

public class TestNgTestClass1 extends BaseTest {
	@BeforeMethod
	public static void setUpForMethod() {
		System.out.println("inside @BeforeMethod setUpForMethod");
	}
	@AfterMethod
	public static void tearDownForMethod(){
		System.out.println("inside @afterMethod tearDownForMethod");
		SoftAssert assertob =new SoftAssert();
		String act ="data";
		String exp ="data1";
		
		assertob.assertEquals(exp,act);
		System.out.println("continuing with the next steps");
		String act1 ="text";
		String exp1 ="text1";
		SoftAssert assertob1 =new SoftAssert();
		 
		
		
		System.out.println("completed");
		assertob.assertAll();
		
	}
	@Test(priority=6 ,enabled =true)
	public static void  testMethod1() {
		System.out.println("Inside TestNgTestClass1 class and test method 1");
		throw  new ArithmeticException();}		
	@Test(priority=3)
	public static void  testMethod2() {
			System.out.println("inside TestNgTestClass1 class and  test method 2");}
	@Test(priority=1)	
	public static void testMethod3() {
			 System.out.println("inside TestNgTestClass1 class test method 3");
		
	
		
	}

}
