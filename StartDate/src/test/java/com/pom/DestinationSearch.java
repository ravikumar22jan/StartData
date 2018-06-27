package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DestinationSearch  {
	

	@FindBy (id="txtloginName")
	private WebElement unTextBox;
	@FindBy (id="txtPassword")
	private WebElement pwTextBox;
	@FindBy (id="btnLogin")
	private WebElement logButton;
	@FindBy (id="DestinationTab")
	private WebElement destTab;
	
	
	@FindBy (id="destSearch")
	private WebElement destSearch;
	
	

	public DestinationSearch (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

public void destinationSear(String un, String pw, String dname) throws InterruptedException	
{
	
	unTextBox.sendKeys(un);
	pwTextBox.sendKeys(pw);
	logButton.click();
	destTab.click();
	Thread.sleep(5000);
	destSearch.sendKeys(dname);
	Thread.sleep(10000);
	
}
	

}


