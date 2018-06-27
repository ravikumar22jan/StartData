package com.startdate.project;

import com.pom.Login;

import org.testng.annotations.Test;



public class ValidLoginTest extends BaseTest

{
	
	@Test
	public void testValidLogin() throws InterruptedException
	{
		
		//enter valid username , password & click login
	Login l= new Login(driver);
		l.login("ravikumar.d", "kumar@9900");
		//click logout
	l.logout(driver);
		
	}

}