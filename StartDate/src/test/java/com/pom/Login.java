package com.pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Login {
	@FindBy (id="txtloginName")
	private WebElement unTextBox;
	@FindBy (id="txtPassword")
	private WebElement pwTextBox;
	@FindBy (id="btnLogin")
	private WebElement logButton;
	
	@FindBy (xpath="//span [text()='ravikumar.d']")
	private WebElement logout;
	@FindBy (id="logout")
	private WebElement logButtonclick;

	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void login(String un, String pw) throws InterruptedException
	{
		unTextBox.sendKeys(un);
		pwTextBox.sendKeys(pw);
		logButton.click();
		//logout.click();
		//logButtonclick.click();
		Thread.sleep(300);
		
		
		
	}
	
	public void logout(WebDriver driver)
	{
		
		Actions actions = new Actions(driver);
		actions.moveToElement(logout).build().perform();
		
		logButtonclick.click();
	}
	
	

	
}