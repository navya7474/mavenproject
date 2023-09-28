package qsp1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildBrowser {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
driver.findElement(By.linkText("actiTIME Inc.")).click();
Set<String> allWid=driver.getWindowHandles();
Iterator<String> i=allWid.iterator();
String parentWid=i.next();
String childWid=i.next();
driver.switchTo().window(childWid);
driver.close();
driver.switchTo().window(parentWid);
driver.close();
	}

}
