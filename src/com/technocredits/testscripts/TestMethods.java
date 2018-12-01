package com.technocredits.testscripts;

import com.technocredits.base.PredefinedMethods;
import com.technocredits.pages.RegistrationPage;

public class TestMethods {

	void initialize()
	{
		PredefinedMethods.start();
	}
	
	void teardown()
	{
		PredefinedMethods.close();
		
	}
	
	void takeScreenShot(String name, String status)
	{
		PredefinedMethods.takeScreenShot(name,status);
		
	}
	RegistrationPage goto_Registration()
	{
		//RegistrationPage registration = new RegistrationPage();
		RegistrationPage registration = RegistrationPage.getInstance();
		registration.navigateToRegistration();
		return registration;
	}
}
