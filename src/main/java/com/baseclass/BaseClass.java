package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver browserlaunch(String s) {
		
        WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
		
	}
	
	public static void urllaunch(String url) {
		
		driver.get(url);
		
	}
	
	public static void maximize() {
		
		driver.manage().window().maximize();
		
	}
	
	public static void sendvalues(WebElement element,String value) {
		
		element.sendKeys(value);
		
	}
	
	public static void clickelement(WebElement element) {
		
		element.click();
	
	}
	
	public static void selectvalues(WebElement element,String value) {
		
		Select s = new Select(element);
		s.selectByValue(value);
		
    }
	
	public static void clearvalues(WebElement element) {
		
		element.clear();
		
	}
	
	

}

