package com.folders.ObjRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.olobby.genericUtility.WebDriverUtility;

public class Location extends WebDriverUtility{
	@FindBy(xpath = "//app-foldermod//div[text()=' Rana ']")private WebElement locationHeader;
	@FindBy(xpath = "//div//ul//li[@data-item-id='80']")private WebElement viewgrp;
	@FindBy(xpath = "")private WebElement locationClick;
	@FindBy(xpath = "//li[@id='dx-e7727b60-8b38-0304-94d3-a5b8dc5fb427']//span[@class='clickablenode folder_icon ng-star-inserted']//*[name()='svg']//*[name()='path' and contains(@d,'M459,102H2')]")private WebElement folderView;
	@FindBy(xpath = "//app-root//div//span[@title='f1']/../..//ul[@class='list-unstyled pull-right tools_list']//img[@src='assets/images/delete(new).svg']")private WebElement folderDelete;
	@FindBy(xpath = "//app-notification-modal//button[text()='Yes']")private WebElement folderDeleteYes;
	@FindBy(xpath = "//app-notification-modal//button[text()='No']")private WebElement folderDeleteNo;
	@FindBy(xpath = "//div[@id='filefoldertabpane']//tbody/tr[@id='file_5_7']//img[@src='assets/images/filetype/xlsx.svg']")private WebElement fileDeleteRightclick;
	@FindBy(xpath = "//div[@id='fileactionmenu']//li[normalize-space()='Delete File']")private WebElement deleteFile;
	@FindBy(xpath = "//table[@role='presentation']//input[@data-name-row='f1']")private WebElement checkbox;
	@FindBy(xpath = "//div[@class='heighlightitem dx-template-wrapper dx-item-content dx-treeview-item-content']//span[@class='ng-star-inserted']//span[1]//*[name()='svg']")private WebElement groupHeader;
	
	public Location(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	public WebElement getLocationHeader() {
		return locationHeader;
	}
	public WebElement getGroupHeader() {
		return groupHeader;
	}
	public WebElement getLocationClick() {
		return locationClick;
	}
	public WebElement getFolderView() {
		return folderView;
	}
	public WebElement getFolderDelete() {
		return folderDelete;
	}
	public WebElement getFolderDeleteYes() {
		return folderDeleteYes;
	}
	public WebElement getFolderDeleteNo() {
		return folderDeleteNo;
	}
	public WebElement getFileDeleteRightclick() {
		return fileDeleteRightclick;
	}
	public WebElement getDeleteFile() {
		return deleteFile;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebElement getViewgrp() {
		return viewgrp;
	}
	
}

