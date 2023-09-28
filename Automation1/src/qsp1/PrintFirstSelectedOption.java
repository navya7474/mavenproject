package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintFirstSelectedOption {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Navya%20Sree/Desktop/Hotel.html");
		WebElement slvListbox=driver.findElement(By.id("slv"));
		Select s=new Select(slvListbox);
		WebElement fsOption=s.getFirstSelectedOption();
		String text=fsOption.getText();
		System.out.println(text);
	}

}
