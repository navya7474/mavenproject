package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeabcdInT1AndT2 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Navya%20Sree/Desktop/Page1.html");
driver.findElement(By.id("t1")).sendKeys("a");
driver.switchTo().frame("f1");
driver.findElement(By.id("t2")).sendKeys("b");
driver.switchTo().defaultContent();
driver.findElement(By.id("t1")).sendKeys("c");
WebElement e = driver.findElement(By.xpath("//iframe"));
driver.switchTo().frame(e);
driver.findElement(By.id("t2")).sendKeys("d");
	}

}
