package com.startdate.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Scrollbar {

public static void main(String[] args) {

WebDriver webDriver = new FirefoxDriver();

webDriver.get("http://www.flipkart.com/&#8221;");

webDriver.manage().window().maximize();

EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(webDriver);
eventFiringWebDriver.executeScript("scroll(0,4000)");

webDriver.findElements(By.xpath("//*[@id=’fk-mainfooter-id’]/div/div[3]/div[2]/div[4]/div[2]/a[1]"));

}

}