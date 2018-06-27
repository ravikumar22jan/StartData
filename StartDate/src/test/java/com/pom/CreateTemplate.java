package com.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateTemplate  extends BasePage  {

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

		@FindBy (id="createTemplate")
		private WebElement clickonplus;
		
		//@FindBy (id="dx_8d5c8431-46b5-850a-c71a-3e51b1215e82_TemplateDetails.TemplateName")
		//@FindBy (xpath="(//div[@class='dx-texteditor-container'])[1]")
		@FindBy (xpath ="(//div[@class='dx-texteditor-container'])[1]//input")
		
		private WebElement tempname;

		@FindBy (xpath="(//div[@class='dx-texteditor-container'])[2]//input")
		private WebElement tagname;
		@FindBy (xpath="//div [text()='Fixed']")
		private WebElement Fixed;
		
		@FindBy (xpath="//div [@class='dx-dropdowneditor-icon']")
		private WebElement intros;
		
		@FindBy (xpath="//div[text()='Intro']")
		private WebElement intro;
		
		@FindBy (xpath="(//div[@class='dx-dropdowneditor-icon'])[2]")
		private WebElement introCal;
		
		//@FindBy (xpath="//div[text()='1729']/../..//span[text()='21']")
		
		@FindBy (xpath="//div[text()='1733']/../..//td[@data-value='2017/8/14']")
		private WebElement introdate;
		
		@FindBy (xpath="//span[text()='Add']")
		private WebElement addintro;
		
		@FindBy (xpath="(//div [@class='dx-dropdowneditor-icon']) [4]")
		private WebElement terms;
		
		@FindBy (xpath="//div[text()='Term']")
		private WebElement term;
		
		@FindBy (xpath="(//div[@class='dx-dropdowneditor-icon'])[5]")
		private WebElement termstartdateclick;
		
		@FindBy (xpath="//div[text()='1733']/../..//td[@data-value='2017/8/15']")
		private WebElement termstartdate;
		
		@FindBy (xpath="(//div[@class='dx-dropdowneditor-icon'])[6]")
		private WebElement termenddateclick;
		
		@FindBy (xpath="//i[@class='dx-icon dx-icon-chevronright']")
		private WebElement termenddateclicknextmonth;
		
		@FindBy (xpath="//div[text()='1737']/../..//td[@data-value='2017/9/15']")
		private WebElement termenddate;
		
		@FindBy (xpath="(//span[text()='Add'])[2]")
		private WebElement addTerm;
		
		//Add Break
		
		@FindBy (xpath="(//div [@class='dx-dropdowneditor-icon']) [7]")
		private WebElement breaks;
		
		@FindBy (xpath="//div[text()='Break']")
		private WebElement Break;
		
		@FindBy (xpath="(//div[@class='dx-dropdowneditor-icon'])[8]")
		private WebElement breakstartdateclick;
		
		//@FindBy (xpath="//i[@class='dx-icon dx-icon-chevronright']")
		//private WebElement breakstartdateclicknextmonth;
		
		@FindBy (xpath="//div[text()='1737']/../..//td[@data-value='2017/9/16']")
		private WebElement breakstartdate;
		
		@FindBy (xpath="(//div[@class='dx-dropdowneditor-icon'])[9]")
		private WebElement breakenddateclick;
		
		//@FindBy (xpath="//i[@class='dx-icon dx-icon-chevronright']")
		//private WebElement breakenddateclicknextmonth;
		
		@FindBy (xpath="//div[text()='1738']/../..//td[@data-value='2017/9/20']")
		private WebElement breakenddate;
		
		@FindBy (xpath="(//span[text()='Add'])[3]")
		private WebElement addbreak;
		
		//Add departure
		@FindBy (xpath="(//div [@class='dx-dropdowneditor-icon']) [10]")
		private WebElement Departures;
		
		@FindBy (xpath="//div[text()='Departure']")
		private WebElement Departure;
		
		@FindBy (xpath="(//div[@class='dx-dropdowneditor-icon'])[11]")
		private WebElement Departurestartdateclick;
		
		
		
		@FindBy (xpath="//div[text()='1738']/../..//td[@data-value='2017/9/21']")
		private WebElement Departurestartdate;
		
		
		

		@FindBy (xpath="(//div [@class='dx-dropdowneditor-icon']) [13]")
		private WebElement intakeMonth;
		
		@FindBy (xpath="//div[text()='August(08)']")
		private WebElement intakeMonthchoose;
;
		
		@FindBy (xpath="(//div [@class='dx-dropdowneditor-icon']) [14]")
		private WebElement lastChangeDateClick;
		
		@FindBy (xpath="//div[text()='1735']/../..//td[@data-value='2017/8/28']")
		private WebElement lastChangeDateChoose;
		
		@FindBy (xpath="//a[text()='Save']")
		private WebElement saveTemp;
		
		@FindBy (xpath= "(//button[@class='close-overlay'])[1]")
		
		private WebElement clickonOK;
		
		//Link Screen

		@FindBy (xpath="(//div [@class='dx-dropdowneditor-icon'])[15]")
		private WebElement IntakeTypeDropdown;
		
		@FindBy (xpath="//div[text()='Extra Extended Year']")
		private WebElement IntakeTypeChoose;
		
		@FindBy (xpath="(//div[@class='dx-texteditor-container dx-tag-container dx-native-click'])[1]")
		private WebElement LinkProgramDropdown;
		
		@FindBy (xpath="(//div[@class='dx-item-content dx-list-item-content'])[1]")
		private WebElement LinkProgramDropdownSelect;
		
		
	
		@FindBy (xpath="(//div[@class='dx-texteditor-container dx-tag-container dx-native-click'])[2]")
		private WebElement LinkDestinationDropdown;
		
		@FindBy (xpath="(//div[@class='dx-item-content dx-list-item-content'])[1]")
		private WebElement LinkDestinationDropdownSelect;
		
		public CreateTemplate (WebDriver driver)
		{
			super(driver);
			PageFactory.initElements(driver, this);
		}
		
		public void cTemp (String un, String pw) throws InterruptedException
		{
			
			unTextBox.sendKeys(un);
			pwTextBox.sendKeys(pw);
			logButton.click();
			Thread.sleep(100);
			
			
			clickonplus.click();
			//Thread.sleep(100);
			
			
		}

		
		public void temp(String temp, String tag) throws InterruptedException
		{
			

			tempname.sendKeys(temp);
			
			Thread.sleep(100);
			tagname.sendKeys(tag);
			
			
			
			Fixed.click();
			
			
			intros.click();
			
			//save.click();
			
			
		
			
		}
		
		public void selectblock() throws InterruptedException
		{
			
			//Add Intro
			
			waitForElementVisible(intro);
			intro.click();
			
			waitForElementVisible(introCal);
			introCal.click();
			
			
			waitForElementVisible(introdate);
			introdate.click();
			
			waitForElementVisible(addintro);
			addintro.click();
			//Add Term
			
			waitForElementVisible(terms);
			terms.click();
			
			waitForElementVisible(term);
			term.click();
			
			waitForElementVisible(termstartdateclick);
			termstartdateclick.click();
			waitForElementVisible(termstartdate);
			termstartdate.click();
			
			
			waitForElementVisible(termenddateclick);
			termenddateclick.click();
			waitForElementVisible(termenddateclicknextmonth);
			
			termenddateclicknextmonth.click();
			waitForElementVisible(termenddate);
			termenddate.click();
			
			waitForElementVisible(addTerm);
			addTerm.click();
			
		}
		
		
		public void scroller(WebDriver driver) throws InterruptedException
		{
			EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
			eventFiringWebDriver.executeScript("scroll(0,2000)");
		}
			
			//Add break
			public void selectblockone() throws InterruptedException
			{
			
				
				waitForElementVisible(breaks);	
			breaks.click();
			
			waitForElementVisible(Break);	
			Break.click();
			
			waitForElementVisible(breakstartdateclick);
			breakstartdateclick.click();
			
			waitForElementVisible(breakstartdate);
			breakstartdate.click();
			
			waitForElementVisible(breakenddateclick);
			breakenddateclick.click();
		
			waitForElementVisible(breakenddate);
			breakenddate.click();
		
			waitForElementVisible(addbreak);
			addbreak.click();
			
			//Add Departure
			
			waitForElementVisible(Departures);
			
			Departures.click();
			waitForElementVisible(Departure);
			
			Departure.click();
			waitForElementVisible(Departurestartdateclick);
			Departurestartdateclick.click();
		
			waitForElementVisible(Departurestartdate);
			Departurestartdate.click();
			
			//waitForElementVisible(intakeMonth);
			
			//intakeMonth.click();
			
			//waitForElementVisible(intakeMonthchoose);
			//intakeMonthchoose.click();
			
			waitForElementVisible(lastChangeDateClick);
			
			lastChangeDateClick.click();
			
			waitForElementVisible(lastChangeDateChoose);
			lastChangeDateChoose.click();
			
			
			waitForElementVisible(saveTemp);
			saveTemp.click();
			
			waitForElementVisible(clickonOK);
			clickonOK.click();
			//LinkScreen
			
			waitForElementVisible(IntakeTypeDropdown);
			IntakeTypeDropdown.click();
	
			waitForElementVisible(IntakeTypeChoose);
			
			IntakeTypeChoose.click();
			
			
			waitForElementVisible(LinkProgramDropdown);
			LinkProgramDropdown.click();
			
			waitForElementVisible(LinkProgramDropdownSelect);
			LinkProgramDropdownSelect.click();
			
			
			waitForElementVisible(LinkDestinationDropdown);
			LinkDestinationDropdown.click();
			
			waitForElementVisible(LinkDestinationDropdownSelect);
			LinkDestinationDropdownSelect.click();
			
			
			
		
		}
		
		
			
		}
		


