package com.startdate.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Login {
	@FindBy (id="txtloginName")
	private WebElement unTextBox;
	@FindBy (id="txtPassword")
	private WebElement pwTextBox;
	@FindBy (id="btnLogin")
	private WebElement logButton;
	

	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void login(String un, String pw) throws InterruptedException
	{
		unTextBox.sendKeys(un);
		pwTextBox.sendKeys(pw);
		logButton.click();
		Thread.sleep(10000);
		
	}
	
	

	
}