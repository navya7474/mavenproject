package qsp1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iphonePriceNameAndInflipkart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max"+Keys.ENTER);
		List<WebElement> mobileNames=driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]"));
		List<WebElement> mobilePrice=driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14 Pro Max')]/../../div[2]/div[1]/div[1]/div[1]"));
		for(int i=0;i<mobileNames.size();i++)
		{
			String Names=mobileNames.get(i).getText();
			String Price=mobilePrice.get(i).getText();
			System.out.println(Names+"==>"+Price);
			}
		driver.quit();
	}

}
