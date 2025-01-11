package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.Then;

public class HomePage extends ProjectSpecificMethods{
	
	@Then ("Verify the title")
	public HomePage verifyTitleHomePage() throws InterruptedException {
		Thread.sleep(5000);
		verifyTitle("Home | Salesforce");
		return this;
	}
	
}
