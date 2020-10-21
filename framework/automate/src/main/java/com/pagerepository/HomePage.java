package com.pagerepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.buisnessutils.BaseUtil;


public class HomePage extends BaseUtil {
	Static webElement LinkLogin=driver.findElement(By.LinkText("Log In"));
	
	public static void clickSignInLink() {
		linkLogin.click();
		
	}
}
