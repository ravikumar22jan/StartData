package com.startdate.project;

import org.testng.annotations.Test;


import com.pom.DestinationSearch;

public class DestinationSearchTest  extends BaseTest
{
	
	@Test
	
public void	DestinationS () throws InterruptedException
{
	
	DestinationSearch des = new DestinationSearch(driver);	
	des.destinationSear("ravikumar.d", "kumar@9900","Perth");
	
	
	
}

}