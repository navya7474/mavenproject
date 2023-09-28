package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZohoLoginLogout {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("http://192.168.119.128:8080/crm/HomePage.do");
driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
Thread.sleep(2000);
driver.findElement(By.id("passWord")).sendKeys("123456");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@title='Sign In']")).click();
String title = driver.getTitle();
System.out.println(title);
driver.quit();
	}
}
