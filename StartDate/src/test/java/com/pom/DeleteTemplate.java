package com.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteTemplate {
	

	@FindBy (id="txtloginName")
	private WebElement unTextBox;
	@FindBy (id="txtPassword")
	private WebElement pwTextBox;
	@FindBy (id="btnLogin")
	private WebElement logButton;
	@FindBy (xpath="//p[text()='sas']")
	private WebElement selectTemp;
	
	@FindBy (id="deleteTemplate")
	private WebElement clickondelete;
	
	public DeleteTemplate (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void tempDel (String un, String pw)
	{
		unTextBox.sendKeys(un);
		pwTextBox.sendKeys(pw);
		logButton.click();
		selectTemp.click();
		clickondelete.click();
				
	}
	
	public void deleteConfirm(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(8000);
		Alert alert=driver.switchTo().alert();
		Thread.sleep(8000);
		String text=alert.getText();
		
		System.out.print(text);
		
		alert.dismiss();
	}

}
