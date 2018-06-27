package com.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DestinationCourse {
	

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
	@FindBy (id="unselected-course")
	private WebElement selectCourse;
	@FindBy (xpath="//input[@value='Move Right >>']")
	private WebElement moveRight;
	
	@FindBy (id="btnPublish")
	private WebElement savePublish;
	
	//@FindBy (xpath= "//*[@id='OverlayBlock']/button/text())[1]")
	
	@FindBy (xpath= "(//button[@class='close-overlay'])[1]")
	
	private WebElement clickonOK;
	

	public DestinationCourse (WebDriver driver)
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
	course.selectByVisibleText("UFT01");
}

public void moveC() throws InterruptedException
{
	moveRight.click();
	savePublish.click();
	
	Thread.sleep(10000);
	clickonOK.click();
	
	Thread.sleep(10000);
	
	
}

//public void confirmationMessage(WebDriver driver ) throws InterruptedException
//{
//	Thread.sleep(8000);
//	Alert alert=driver.switchTo().alert();
//	Thread.sleep(8000);
//	String text=alert.getText();
//	
//	System.out.print(text);
//	
//	alert.accept();	
//	
//}
}


