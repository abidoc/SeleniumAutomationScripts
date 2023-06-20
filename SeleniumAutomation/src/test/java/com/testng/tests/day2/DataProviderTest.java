package com.testng.tests.day2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest{
	@Test(dataProvider="data1")
	public static void calculate(Integer a,Integer b,Integer c) {
		System.out.println(a+b+c);
	}
	@DataProvider(name="data1")
	public static Object[][] getdata(){
		Integer[][] data1 =new Integer[3][3];
		data1[0][0]=1;
		data1[0][1]=1;
		data1[0][2]=1;
		data1[1][0]=2;
		data1[1][1]=2;
		data1[1][2]=2;
		data1[2][0]=3;
		data1[2][1]=3;
		data1[2][2]=3;
		return data1;
	}
	

}
