package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.LoginPage;

public class BaseClass {
public static WebDriver driver;
@BeforeTest
public void openBrowser(){
	Reporter.log("openBrowser", true);
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
}
@BeforeMethod
public void login() throws IOException {
	Reporter.log("login", true);
	FileLib2 f=new FileLib2();
	String url=f.getPropertyData("url");
	String un=f.getPropertyData("username");
	String pw=f.getPropertyData("password");
	driver.get(url);
	LoginPage l=new LoginPage(driver);
	l.setlogin(un, pw);
}
@AfterMethod
public void logout() {
	Reporter.log("logout", true);
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.setLogout();
}
@AfterTest
public void closeBrowser(){
	Reporter.log("closeBrowser", true);
	driver.close();
}
}
