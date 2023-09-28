package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoPrintAllOptions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Navya%20Sree/Desktop/Hotel.html");
		WebElement mtrListbox=driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		String text=s.getWrappedElement().getText();
		System.out.println(text);
		driver.quit();
	}

}
