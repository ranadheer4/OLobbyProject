package com.fileShare.ObjectRepo;

import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mysql.cj.jdbc.Driver;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.WebDriverUtility;

public class QS_RequestFile extends BaseClass {
	
	
	@FindBy(xpath = "//app-quickshare-file//a[@id='Request-tab']")private WebElement requestFiles;
	@FindBy(xpath = "//app-request-files//input[@id='requesteeName']")private WebElement name;
	@FindBy(xpath = "//app-request-files//input[@id='requesteeEmail']")private WebElement mail;
	@FindBy(xpath = "//app-request-files//button[text()=' Add ']")private WebElement add;

	@FindBy(xpath = "//app-request-files//input[@id='requesteePin']")private WebElement pin;

	@FindBy(xpath = "//app-request-files//input[@id='requesteeSubject']")private WebElement subject;

	@FindBy(xpath = "//app-request-files//span[text()='Send Request']")private WebElement sendRequest;

	public QS_RequestFile(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getRequestFiles() {
		return requestFiles;
	}
	
	public WebElement getName() {
		return name;
	}
	
	public WebElement getMail() {
		return mail;
	}
	public WebElement getAdd() {
		return add;
	}
	public WebElement getPin() {
		return pin;
	}
	public WebElement getSubject() {
		return subject;
	}
	public WebElement getSendRequest() {
		return sendRequest;
	}
	
}
