package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.leaftaps.pages.LoginPage;

public class TC001_VerifyLogin extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues() {
		excelFileName = "Login";
		testcaseName = "TC001_VerifyLogin";
		testDescription ="Verify Login functionality with TestNG";
		category = "Sanity";
		authors = "geethaMohan";
	}

	@Test(dataProvider="fetchData")
	public void runLogin(String un, String pass) throws InterruptedException {
		LoginPage login = new LoginPage();
		login.enterUsername(un).enterPassword(pass).clickOnLogin().verifyTitleHomePage();
		
	}

}
