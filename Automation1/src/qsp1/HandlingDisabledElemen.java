package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingDisabledElemen {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Navya%20Sree/Desktop/disable.html");
driver.findElement(By.id("d1")).sendKeys("admin");
RemoteWebDriver r=(RemoteWebDriver) driver;
r.executeScript("document.getElementById('d2').value='manager'");
	}

}
