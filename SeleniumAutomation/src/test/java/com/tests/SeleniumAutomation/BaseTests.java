package com.tests.SeleniumAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {
	public static WebDriver driver =null;

	public static void launchBrowser(String browserName) {
		 switch(browserName){
		 case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
			driver.manage().window().maximize();
			break;
			 	
		 case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			driver.manage().window().maximize();
		 	break;
		 }
		 	System.out.println("Browser is opened");
	}
	
	/*public static void enterText(WebElement element, String data, String objectname) {
			if(element.isDisplayed()) {
				clearElement(element,objectname);
				element.sendKeys (data);
				System.out.println("pass: " +objectname +"is entered into username field "); 
			}
				else {
					System.out.println("Fail: " + objectname +  " is not displayed");
					
				}
			}*/
	public static void enterText(WebElement element, String data) {
		if(element.isDisplayed()) {
			clearElement(element);
			element.sendKeys(data);
			System.out.println("pass: "+ data+ "is entered into username field "); 
		}
			else {
				System.out.println("Fail: " + data +  " is not displayed");
				
			}
		}
	
	public static void clearElement(WebElement element) {
		// TODO Auto-generated method stub
		element.clear();
	}
	
	public static void clickElement(WebElement element, String objectname) {
			if (element.isDisplayed()) {
				element.click();
				System.out.println("pass:"+ objectname + "element is clicked");
			}
				else {
					System.out.println("fail:"+ objectname +"is not displayed");
				}
			}
	
	public static void gotoUrl(String url){
		driver.get(url);
		System.out.println("url is entered");
		
	}
	public static void closeBrowser() {
		driver.close();
		System.out.println("browser is closed");
	}
	
	public static  String getPageTitle(){
		 return driver.getTitle();
	}	 
	
	public static void refreshPage(){
		driver.navigate().refresh();
	}
	
	public static String getTextFromElement(WebElement element, String name) {
		 if (element.isDisplayed()) {
			 return  element.getText();
		 }
		 else {
			 System.out.println("name" +"element is not displayed");
			 return null;}
			 
		 }
		
		 
	public static Alert switchtoAlert(){
		Alert alert = driver.switchTo().alert();
		System.out.println("Switched to alert");
		return alert;
		
	}
	
	public static  void AcceptAlert(Alert alert) {
		System.out.println("alert accepted");
		alert.accept();
	}
		
	public static String getAlertText() { 	
		 	System.out.println("extracting text");
		 	return getAlertText();
		 	
	}
	
	public static void dismissAlert() {
		Alert alert =switchtoAlert();
		alert.dismiss();
		System.out.println("alert dismissed");
	}
	
		
	
	/*public static void extractingElements{
	List<WebElement>aboutElement = driver.findElement(about);
	System.out.println(aboutElement.getAttribute());
	about.click;
	}*/

}

