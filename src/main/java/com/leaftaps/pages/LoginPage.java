package com.leaftaps.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethods{
	
	@Given ("Enter the username as {string}")
	public LoginPage enterUsername(String uname) {
		clearAndType(locateElement("username"),uname);
		reportStep("Username entered is successful", "pass");
		return this;
	}
	
	@And ("Enter the password as {string}")
	public LoginPage enterPassword(String pwd) {
		type(locateElement(Locators.NAME,"pw"), pwd);
		reportStep("Password entered is successful", "pass");
		return this;
	}
	
	@When ("Click on login button")
	public HomePage clickOnLogin() {
		click(locateElement(Locators.XPATH,"//input[@id='Logi']"));
		reportStep("Login is successful", "pass");
		return new HomePage();
		
	}
	
}
