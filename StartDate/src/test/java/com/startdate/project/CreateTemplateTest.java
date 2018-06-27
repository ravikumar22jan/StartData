package com.startdate.project;



import com.pom.CreateTemplate;
import com.pom.Login;

import org.testng.annotations.Test;



public class CreateTemplateTest extends BaseTest

{
	
	@Test
	

	public void testTempCreation() throws InterruptedException
	{
	 CreateTemplate c= new CreateTemplate (driver);
	   
	 
	 c.cTemp("ravikumar.d", "kumar@9900");
	 
	 c.temp("julytest", "jt");
	 
	 c.selectblock();
	 c.scroller(driver);
	 c.selectblockone();
	    
}
}