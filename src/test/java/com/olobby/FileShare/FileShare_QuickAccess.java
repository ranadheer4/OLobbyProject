package com.olobby.FileShare;

import org.testng.annotations.Test;

import com.fileShare.ObjectRepo.QS_RequestFile;
import com.fileShare.ObjectRepo.file_Share;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class FileShare_QuickAccess extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
	}
   @Test(
      groups = {"SmokeTest"}
   )
   public void requestFiles() throws InterruptedException {
	   HomePage hp = new HomePage(driver);
	   Thread.sleep(3000);
	   hp.getFileShare().click();
	   Thread.sleep(5000);
	   file_Share fs = new file_Share(driver);
	   
	   fs.getQuickShare().click();
	   Thread.sleep(5000);
	   QS_RequestFile qs = new QS_RequestFile(driver);
	   qs.getRequestFiles().click();
	   Thread.sleep(3000);
	   
	   qs.getName().sendKeys(eLib.readDataFromExcel("RequestFile", 1, 0));
	   
	   qs.getMail().sendKeys(eLib.readDataFromExcel("RequestFile", 1, 1));
	   qs.getAdd().click();
	   
	   qs.getPin().sendKeys(eLib.readDataFromExcel("RequestFile", 1, 3));
	   qs.getSubject().sendKeys(eLib.readDataFromExcel("RequestFile", 1, 4));
	   qs.getSendRequest().click();
	   
}
}