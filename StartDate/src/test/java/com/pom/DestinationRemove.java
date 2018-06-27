package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DestinationRemove {
	

	@FindBy (id="txtloginName")
	private WebElement unTextBox;
	@FindBy (id="txtPassword")
	private WebElement pwTextBox;
	@FindBy (id="btnLogin")
	private WebElement logButton;
	@FindBy (id="DestinationTab")
	private WebElement destTab;
	
	@FindBy (xpath="//a[text()='Dubai (AE-DXB)']")
	private WebElement selectDest;
	@FindBy (id="selected-course")
	private WebElement selectCourse;
	@FindBy (xpath="//input[@value='<< Move Left']")
	private WebElement moveLeft;
	
	@FindBy (id="btnPublish")
	private WebElement savePublish;
	

	public DestinationRemove (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

public void linkDestination(String un, String pw)	
{
	
	unTextBox.sendKeys(un);
	pwTextBox.sendKeys(pw);
	logButton.click();
	destTab.click();
	selectDest.click();
	selectCourse.click();
	
}
	

public void listOfCourse()

{
	Select course= new Select(selectCourse);
	course.selectByVisibleText("SE01E");
}

public void moveC()
{
	moveLeft.click();
	savePublish.click();
}
}
