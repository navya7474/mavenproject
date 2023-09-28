package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectListPage {
@FindBy(xpath="//div[text()='Add New']")
private WebElement addNewBtn;
@FindBy(xpath="//div[text()='+ New Project']")
private WebElement newProjectOption;
@FindBy(xpath="//input[@placeholder='Enter Project Name' and @class]")
private WebElement enterProNameTbx;
@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --' and @class='emptySelection']")
private WebElement selectCustToProDD;
@FindBy(xpath="//div[@class='searchItemList']/div[text()='HDFC_001' and @class='itemRow cpItemRow selected']")
private WebElement hdfc_001Tx;
@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
private WebElement enterProDescTbx;
@FindBy(xpath="//div[text()='Create Project']")
private WebElement createProBtn;
@FindBy(xpath="//div[text()='HDFC Bank']")
private WebElement actualProName;
public ProjectListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getAddNewBtn() {
	return addNewBtn;
}
public WebElement getNewProjectOption() {
	return newProjectOption;
}
public WebElement getEnterProNameTbx() {
	return enterProNameTbx;
}
public WebElement getSelectCustToProDD() {
	return selectCustToProDD;
}
public WebElement getHdfc_001Tx() {
	return hdfc_001Tx;
}
public WebElement getEnterProDescTbx() {
	return enterProDescTbx;
}
public WebElement getCreateProBtn() {
	return createProBtn;
}
public WebElement getActualProName() {
	return actualProName;
}

}
