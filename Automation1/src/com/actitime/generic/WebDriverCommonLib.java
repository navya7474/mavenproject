package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {
public void waitForLoad(WebDriver driver) {
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
}
public void waitForElement(WebDriver driver,WebElement element) {
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOf(element));
}
public void CustomWaitForElement(WebElement element) {
	int i=0;
	while(i<100)
	{
		try {
			element.isDisplayed();
			break;
		}
		catch(Exception e) {
			i++;
		}
	}}
	public void selectoption(WebElement element,int i) {
		Select s=new Select(element);
		s.selectByIndex(i);
	}
	public void selectoption(WebElement element,String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	
}

