package qsp1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Navya%20Sree/Desktop/naukri.html");
		Thread.sleep(2000);
		File f=new File("./data/RESUME N.docx");
		String absolutePath=f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(absolutePath);
	}

}
