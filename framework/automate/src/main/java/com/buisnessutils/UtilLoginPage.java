package com.buisnessutils;

import com.configutils.Config;
import com.pagerepository.LoginPage;

public class UtilLoginPage extends BaseUtil{
public static void login() {
	LoginPage.clickSignInlink();
	Loginpage.enterUserName(Config.get("email"));
	Loginpage.clickOnContinue();
}
}
