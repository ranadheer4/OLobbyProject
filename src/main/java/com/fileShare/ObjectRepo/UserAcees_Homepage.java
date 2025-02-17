package com.fileShare.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class UserAcees_Homepage extends WebDriverUtility {
	@FindBy(xpath = "//div[@id='FILESHARE']//a[@id='userlist']")private WebElement userList;
	@FindBy(xpath = "//div[@id='FILESHARE']//a[@id='userbygrp']")private WebElement userByGroup;
	@FindBy(xpath = "//div[@id='FILESHARE']//a[text()='Add external User']")private WebElement addExternalUser;
	@FindBy(xpath = "//div[@id='FILESHARE']//label[normalize-space()='All']")private WebElement all;
	@FindBy(xpath = "//div[@id='FILESHARE']//label[normalize-space()='Internal']")private WebElement internal;
	@FindBy(xpath = "//div[@id='FILESHARE']//label[normalize-space()='External']")private WebElement external;
	@FindBy(xpath = "//div[@id='FILESHARE']//img[@src='assets/images/delete(new).svg']")private WebElement delete;
	@FindBy(xpath = "")private WebElement reInvite;
	@FindBy(xpath = "")private WebElement edit;
	@FindBy(xpath = "//tbody[@role='presentation']//td[@aria-colindex='2' and text()='Vdanvale']/../td//div[@role='checkbox']")private WebElement checkBox;
	@FindBy(xpath = "//app-notification-modal//button[text()='Delete']")private WebElement deleteNotify;
	@FindBy(xpath = "//div//td[@aria-colindex='1']//span[text()='14-06-2023']/../../../../following-sibling::td//button")private WebElement addUser;
	@FindBy(xpath = "//app-create-user-group//button[text()=' Delete ']")private WebElement deleteUser;
	@FindBy(xpath = "//table[@role='presentation']//input[@data-name-row='14-06-2023']")private WebElement checkbox;

	
	public UserAcees_Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserList() {
		return userList;
	}

	public WebElement getUserByGroup() {
		return userByGroup;
	}

	public WebElement getAddExternalUser() {
		return addExternalUser;
	}

	public WebElement getAll() {
		return all;
	}

	public WebElement getInternal() {
		return internal;
	}

	public WebElement getExternal() {
		return external;
	}

	public WebElement getDelete() {
		return delete;
	}

	public WebElement getReInvite() {
		return reInvite;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getdeleteNotify() {
		return deleteNotify;
	}

	public WebElement getAddUser() {
		return addUser;
	}

	public WebElement getDeleteNotify() {
		return deleteNotify;
	}

	public WebElement getDeleteUser() {
		return deleteUser;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}
	
	
}
