package qsp1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnlyDuplicate {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Navya%20Sree/Desktop/Hotel.html");
		WebElement mtr=driver.findElement(By.id("mtr"));
		Select s=new Select(mtr);
		Set<String> set=new TreeSet();
		List<String> al=new ArrayList<String>();
		List<WebElement>allOptions=s.getOptions();
		for(int i=0;i<allOptions.size();i++)
		{
			WebElement ele=allOptions.get(i);
			String text=ele.getText();
			if(!set.add(text))
			{
				al.add(text);
			}
			}
		System.out.println(al);
		driver.quit();
	}

}
