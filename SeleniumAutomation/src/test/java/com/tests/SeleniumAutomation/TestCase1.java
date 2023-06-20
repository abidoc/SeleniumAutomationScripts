package com.tests.SeleniumAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TestCase1 extends BaseTests {

	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub
	//TC -2	:

		launchBrowser("Chrome");
		gotoUrl("https://login.salesforce.com/");
		WebElement username = driver.findElement(By.id("username"));
		enterText(username, "Shamabi@teckarch.com");
		WebElement password = driver.findElement(By.id("password"));
		enterText(password, "Shams786");
		WebElement login =driver.findElement(By.id("Login"));
		clickElement(login, "Login Button");
		//closeBrowser();
	
	//TC-1:
		
		launchBrowser("Chrome");
		gotoUrl("https://login.salesforce.com/");
		WebElement username1 =driver.findElement(By.id("username"));
		enterText(username1,"Shamabi@teckarch.com");
		WebElement password1= driver.findElement(By.id("password"));
		enterText(password1,"");
		WebElement login1 =driver.findElement(By.id("Login"));
		clickElement(login1,"Login Button");
		WebElement errormessage= driver.findElement(By.id("error"));
		boolean em = errormessage.isDisplayed();
		if (em==true) {
			System.out.println(errormessage.getText() + "error message is displayed");
		}
		else {
			System.out.println(errormessage.getText() + "error message is not displayed");
		}

		
		
		
	
	//TC3

			launchBrowser("Chrome");
			gotoUrl("https://login.salesforce.com/");
			WebElement username2 =driver.findElement(By.id("username"));
			enterText(username2,"Shamabi@teckarch.com");
			WebElement password2= driver.findElement(By.id("password"));
			enterText(password2,"Shams786");
			By Checkbox =By.cssSelector("input[type='checkbox']");
			WebElement checkbox =driver.findElement(Checkbox);
			checkbox.click();
			System.out.println("Check Box is clicked");
			WebElement login2 =driver.findElement(By.id("Login"));
			clickElement(login2,"Login Button");
			System.out.println("Login Button is clicked");
			WebElement ddarrow =driver.findElement(By.id("userNav-arrow"));
			ddarrow.click();
			System.out.println("User Name Nav arrow is clicked");
			WebElement LO =driver.findElement(By.xpath("//a[@href=\"/secur/logout.jsp\"]"));
			LO.click();	
			System.out.println("Logout menu is clicked");
			String UNvalue	= username2.getText();
			System.out.println(UNvalue);
			if (UNvalue == "Shamabi@teckarch.com") {
				
				System.out.println(UNvalue +"is displayed");}
			else {
					System.out.println(" username is not displayed");
				}
			
			
			
			
			
			
	//TC4		
		    launchBrowser("Chrome");
			gotoUrl("https://login.salesforce.com/");
			WebElement username3 =driver.findElement(By.id("username"));
			enterText(username3,"Shamabi@teckarch.com");
			By fpw=By.id("forgot_password_link");
			WebElement FPW =driver.findElement(fpw);
			FPW.click();
			By un =By.id("un");
			WebElement UN=driver.findElement(un);
			enterText(username3,"Shamabi@teckarch.com");
			WebElement login3=driver.findElement(By.id("Login"));
			clickElement(login3,"LoginButton");
			
	//TC 4B
			
			launchBrowser("Chrome");
			gotoUrl("https://login.salesforce.com/");
			WebElement username4 =driver.findElement(By.id("username"));
			enterText(username4 ,String.valueOf(123));
			WebElement password4 =driver.findElement(By.id("password"));
			enterText(password4, String.valueOf(21131));
			WebElement login4 =driver.findElement(By.id("Login"));
			clickElement(login4,"LoginButton");
			String act ="Please check your password and username";
			WebElement errormessage1 =driver.findElement(By.id("error"));
			String exp= errormessage.getText();
			System.out.println("errormessage is displayed");
			Assert.assertEquals(act, exp);
		
		//TC 5
		launchBrowser("Chrome");
		gotoUrl("https://login.salesforce.com/");
		WebElement username5 = driver.findElement(By.id("username"));
		enterText(username5, "Shamabi@teckarch.com");
		WebElement password5 = driver.findElement(By.id("password"));
		enterText(password5, "Shams786");
		WebElement login5 =driver.findElement(By.id("Login"));
		clickElement(login, "Login Button");
		WebElement UMD =driver.findElement(By.id("userNavButton"));
		UMD.click();
		List<WebElement> UsrMenuItems = (driver.findElements(By.id("userNav-menuItems")));
		String[] Exp = {"My Profile" ,"My Settings", "Developer Console", "Switch to Lightning Experience", "Logout"};
		for(WebElement e:UsrMenuItems) {
			System.out.println(e.getText());
			 String act1 = e.getText();
			 System.out.println(act);
		
		
		
			
			
	}
	
	}	

}


	


