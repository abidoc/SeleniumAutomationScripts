package com.tests.SeleniumAutomation;

import org.openqa.selenium.remote.session.ChromeFilter;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FireBasein {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expectedTitle ="Selenium";
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://qa-tekarch.firebaseapp.com/");
	String actualTitle = driver.getTitle();
	
	if(expectedTitle.equals(actualTitle)) {
		System.out.println("Title is matched");
	}
		else {
		System.out.println("Title is not matched ");}
	
	}
	 Thread.sleep(4000);
	
	 By username=By.id("email_field");
	 WebElement usernameElement = driver.findElement(username);
	 usernameElement.clear();
	 usernameElement.sendKeys("admin123@gmail.com");
	 
	 By password =By.id("password_field");
	 WebElement passwordElement =driver.findElement(password);
	 passwordElement.sendKeys("admin123");
	 
	By login =By.tagName("button");
	WebElement loginElement =driver.findElement(login);
	loginElement.click();
	driver.close();
	
	Actions action= new Actions(driver)
	action. 		
			
	
	
	
	
	 
	 
	
	
}
