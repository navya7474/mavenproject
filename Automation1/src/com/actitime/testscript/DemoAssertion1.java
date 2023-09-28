package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DemoAssertion1 {
	public void verifyTitle(){
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String eTitle="Soogle";
	String aTitle=driver.getTitle();
	Assert.assertEquals(aTitle, eTitle);
	driver.quit();
}
}