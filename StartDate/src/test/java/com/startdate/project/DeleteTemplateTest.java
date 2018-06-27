package com.startdate.project;

import org.testng.annotations.Test;

import com.pom.DeleteTemplate;

public class DeleteTemplateTest extends BaseTest

{

@Test

public void testDelTemp() throws InterruptedException
{
	DeleteTemplate del= new DeleteTemplate(driver);
	del.tempDel("ravikumar.d", "kumar@9900");
	del.deleteConfirm(driver);
			
			
	
}

	
	
}
