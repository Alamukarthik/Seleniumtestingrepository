package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.buisnessutils.BaseUtil;
import com.buisnessutils.UtilLoginPage;
import com.configutils.Config;
import com.pagerepository.LoginPage;

public class LoginTest extends BaseUtil{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseUtil.OpenBrowser();
		UtilLoginPage.login();
		driver.close();
		driver.quit();
		System.out.println("done");
		
       }

}
