package qsp1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alphabeticorder {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Navya%20Sree/Desktop/Hotel.html");
		WebElement mtrListbox=driver.findElement(By.id("mtr"));
		Select s=new Select(mtrListbox);
		List<WebElement> allOptions=s.getOptions();
		ArrayList<String> al=new ArrayList<>();
		for(int i=0;i<allOptions.size();i++)
		{
			String text = allOptions.get(i).getText();
			al.add(text);
		}
		Collections.sort(al);
		for(int i=0;i<al.size();i++)
		{
			String option=al.get(i);
			System.out.println(option);
		}
		driver.quit();
	}

}
