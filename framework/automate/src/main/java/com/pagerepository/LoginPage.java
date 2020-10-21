package com.pagerepository;

import org.openqa.selenium.WebElement;

import com.buisnessutils.BaseUtil;

public class LoginPage extends BaseUtil{
	static WebElement LinkLogin=driver.findelement(By.Linktext("Log In"));
	
public static void clickSignInLink() {
	LinkLogin.click();
}
public static void enterUserName(string UserName) {
	txtUserName.sendKeys("user name");
}
public static void clickOnContinue() {
	btnContinue.click();
}

}
