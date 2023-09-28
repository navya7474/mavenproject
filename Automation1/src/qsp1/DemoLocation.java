package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocation {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///D:/java/java%20basics/demo.html");
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		Thread.sleep(20000);
		driver.findElement(By.id("d1")).click();
		driver.navigate().back();
	}

}
