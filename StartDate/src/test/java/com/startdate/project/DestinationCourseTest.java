package com.startdate.project;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.pom.DestinationCourse;

public class DestinationCourseTest extends BaseTest
{
	
	@Test
	
public void	Destination () throws InterruptedException
{
	
	DestinationCourse des = new DestinationCourse(driver);	
	des.linkDestination("ravikumar.d", "kumar@9900");
	des.listOfCourse();
	des.moveC();
	//des.confirmationMessage(driver);
	
	
}

}
