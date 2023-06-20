package com.tests.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class GooglePageTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		By searchBox =By.name("q");
		WebElement searchBoxElement =driver.findElement(searchBox);
		searchBoxElement.clear();
		searchBoxElement.sendKeys("selenium");
		//By searchButton =By.name("btnk");
		////WebElement button =driver.findElement(searchButton);
		//button.click();
		Thread.sleep(4000);
		
		//By searchButton1 =By.className("gNO89b");
		//WebElement button1 =driver.findElement(searchButton1);
		//button1.click();
		
		By about = By.partialLinkText("Ab");
		WebElement aboutElement =driver.findElement(about);
		aboutElement.click();
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
