package com.olobby.FolderAccess;

import org.testng.annotations.Test;

import com.folders.ObjRepo.Homepage;
import com.folders.ObjRepo.Location;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

import FolderAccess.Users_To_Group;

public class FolderAces_2 extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
	}
   @Test(
      groups = {"SmokeTest"}
   )
   public void export() throws InterruptedException {
	   HomePage hp = new HomePage(driver);
	   hp.getFolder().click();
	   Users_To_Group ug = new Users_To_Group(driver);
	   Thread.sleep(8000);
	   ug.getFoldersPage().click();
	   Thread.sleep(7000);
	   Location l = new Location(driver);
	   
	   l.getLocationHeader().click();	   
	   Thread.sleep(5000);
	   l.getViewgrp().click();
	   Thread.sleep(6000);
	   Homepage hmp = new Homepage(driver);
	   hmp.getCheckbox().click();
	   Thread.sleep(6000);
	   hmp.getOlExport().click();
	   Thread.sleep(5000);
	   hmp.getCheckbox2().click();
//	   Thread.sleep(6000);
//	   hmp.getEmail().click();
//	   Thread.sleep(6000);
//	   hmp.getToEmail().sendKeys(eLib.readDataFromExcel("folderAceess_mail", 1, 0));	   
//	   hmp.clickEnter(driver);
//	   Thread.sleep(6000);
//	   hmp.getSendEmail().click();
	   
   
//	   hmp.getLock().click();
//	  
//	   hmp.getUnLock().click();
//	   
//	   hmp.getCollapse().click();
//	   Thread.sleep(6000);
//	   hmp.getExpand().click();
//	   Thread.sleep(5000);
//	   hmp.getIncrease().click();
//	   Thread.sleep(6000);
//	   hmp.getIncrease().click();
//	   
//	   hmp.getIncrease().click();
//	   
//	   hmp.getDecrease().click();
//	   
//	   hmp.getDecrease().click();
//	   
//	   hmp.getDecrease().click();
//	   
//	   hmp.getExit().click();
//	   Thread.sleep(6000);
//	   hmp.getRefresh().click();
   }
}
   