package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoDragAndDrop {

	public static void main(String[] args) {
WebDriver driver=new FirefoxDriver();
driver.get("https://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag/g-drop/index.html");
WebElement src = driver.findElement(By.xpath("//h1[text()='Block1']"));
WebElement target = driver.findElement(By.xpath("//h1[text()='Block4']"));
Actions a=new Actions(driver);
a.dragAndDrop(src, target).perform();
	}

}
