package com.technocredits.pages;

import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.technocredits.base.PredefinedMethods;
import com.technocredits.constant.ConstantPath;
import com.technocredits.util.FileOperation;

public class RegistrationPage extends PredefinedMethods {
	private static RegistrationPage registrationPage = null;
	private Properties prop;
	
	private RegistrationPage(){
		prop = FileOperation.LoadFile(ConstantPath.registrationProperties);
	}
	
	
	public static RegistrationPage getInstance()
	{
		if(registrationPage == null)
			registrationPage = new RegistrationPage();
		return registrationPage;
	}
	
	public void login() {
		login("mkanani","mkanani1234");
	}
	
	public void login(String uname, String pwd)
	{
		enterUserName(uname);
		enterPassword(pwd);
		clickLoginButton();
	}
	
	private void enterUserName(String uname) {
		//setText(prop.getProperty("uname"),"xpath", uname);
		driver.findElement(By.xpath(prop.getProperty("uname"))).sendKeys(uname);
		System.out.println("Username entered");

	}
	
	private void enterPassword(String password) {
		driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(password);
		System.out.println("Password entered");

	}

	private void clickLoginButton() {
		//click(prop.getProperty("loginbutton"), "xpath");
		driver.findElement(By.xpath(prop.getProperty("loginbutton"))).click();
		System.out.println("Login button clicked");
	}

	public void navigateToRegistration() {
		driver.findElement(By.linkText("Registration")).click();
		System.out.println("Clicked on Registration link");

	}

	public String acceptLoginPageAlert() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		alert.accept();
		return text;
	}

	public void signup() {

	}

	public void forgotPwd() {

	}
}
