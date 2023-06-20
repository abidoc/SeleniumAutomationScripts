package com.tests.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase2 {

	public static void main(String[] args)  throws InterruptedException{
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	
	WebElement username =driver.findElement(By.id("usernamegroup"));
	username.clear();
	username.sendKeys("Shamabi@teckarch.com");
	Thread.sleep(4000);
	
	
	WebElement password =driver.findElement(By.id("password"));
	password.sendKeys( "Shams786");
	
	WebElement login =driver.findElement(By.id("Login"));
	login.click();

	}
}