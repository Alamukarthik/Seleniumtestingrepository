package com.buisnessutils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.configutils.Config;

public class BaseUtil {
	static WebDriver driver=null;
	public static void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\framework\\automate\\Drivers\\chromedriver.exe");
	       driver=new ChromeDriver();
		   driver.get(Config.get("url"));
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      
		 
	}

}
