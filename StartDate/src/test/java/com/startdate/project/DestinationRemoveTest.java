package com.startdate.project;

import org.testng.annotations.Test;


import com.pom.DestinationRemove;

public class DestinationRemoveTest  extends BaseTest
{
	
	@Test
	
public void	Destination ()
{
	
		DestinationRemove des = new DestinationRemove(driver);	
	des.linkDestination("ravikumar.d", "kumar@9900");
	des.listOfCourse();
	des.moveC();
	
	
}

}

