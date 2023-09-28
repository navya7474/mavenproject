package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib2;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.ProjectListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class ProjectMod extends BaseClass {
@Test
public void testCreateProject() throws EncryptedDocumentException, IOException, InterruptedException {
	Reporter.log("CreateProject", true);
	FileLib2 f=new FileLib2();
	String projectName=f.getExcelData("CreateProject", 1, 2);
	String projectDesc=f.getExcelData("CreateProject", 1, 3);
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.setTasksTab();
	ProjectListPage p=new ProjectListPage(driver);
	p.getAddNewBtn().click();
	p.getNewProjectOption().click();
	p.getEnterProNameTbx().sendKeys(projectName);
	p.getSelectCustToProDD().click();
	p.getHdfc_001Tx().click();
	p.getEnterProDescTbx().sendKeys(projectDesc);
	p.getCreateProBtn().click();
	Thread.sleep(5000);
	String actualProjectText = p.getActualProName().getText();
	Assert.assertEquals(actualProjectText, projectName);
			}
}
