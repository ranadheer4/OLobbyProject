package com.olobby.FileShare;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.fileShare.ObjectRepo.Clients;
import com.fileShare.ObjectRepo.file_Share;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;

public class Sample extends BaseClass {
	static {
		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
	}
   @Test(
      groups = {"SmokeTest"}
   )
   public void clients() throws InterruptedException {
	   HomePage hp = new HomePage(driver);
	   Thread.sleep(3000);
	   hp.getFileShare().click();
	   Thread.sleep(8000);
	   file_Share fs = new file_Share(driver);
	   Thread.sleep(8000);
	   fs.getClients().click();
	   Clients c = new Clients(driver);
	   Thread.sleep(6000);
	   c.getClientByGroup().click();
	   Thread.sleep(6000);
	   List<WebElement>all_cd_cols=driver.findElements(By.xpath("//table[@class='dx-treelist-table dx-treelist-table-fixed']/tbody/tr/td[3]//div[@class='ng-star-inserted']//span"));
	   System.out.println(all_cd_cols.size());
	   Thread.sleep(4000);
	   int i=0;
	   for (WebElement cd_col:all_cd_cols)
	   {
	   i++;
	   if (cd_col.getText().equalsIgnoreCase("07/14/23 03:32 PM")) {
	   
	   List<WebElement>allData=driver.findElements(By.xpath("//preceding::td[@role='gridcell']//following-sibling::td[4]//button"));
	   //List<WebElement>allData=driver.findElements(By.xpath("//td//div//button"));

	     for(int j=0;j<=allData.size();j++) {
	      if (i==j-1) { 
	     allData.get(i).click();
	     }
	     }}}
   }}
	  
//	   List<WebElement>rows=driver.findElements(By.xpath("//table[@class='dx-treelist-table dx-treelist-table-fixed']/tbody/tr"));
//	   int allrows=rows.size();
//	   System.out.println(allrows);
//	   for(int i=0;i<allrows;i++) {
//		   List<WebElement>cols=driver.findElements(By.xpath("//table[@class='dx-treelist-table dx-treelist-table-fixed']/tbody/tr/td[3]"));
//		   for (WebElement cell : cols) {
//		   
//		   if(cell.getText().equalsIgnoreCase("05/23/23 04:41 PM")) {
//			 WebElement mc = cols.get(4).findElement(By.tagName("td"));
//			 mc.click();
//		   }
//		   
//	   }
	   