package com.olobby.Settings;

import org.testng.annotations.Test;

import com.TaskManagement.ObjRepo.InlineEdit;
import com.folders.ObjRepo.Location;
import com.olobby.ObjectRepo.HomePage;
import com.olobby.genericUtility.BaseClass;
import com.olobby.genericUtility.IConstants;
import com.settings.ObjRepo.Settings_RolesPage;
import com.settings.ObjRepo.Settings_SideBar;
import com.settings.ObjRepo.Settings_UsersPage;

public class Users_Location_Roles extends BaseClass{
	static {
		System.setProperty(IConstants.chromeKey,IConstants.chromeValue);
	}
   @Test(
      groups = {"SmokeTest"}
      
   )
   public void roles_users() throws InterruptedException {
	   HomePage hp = new HomePage(driver);
	   
	   hp.settingusers(driver);
	   Settings_UsersPage surl = new Settings_UsersPage(driver);
	   Thread.sleep(6000);
	   //delete user and restore user
	   surl.getThreeDotsAction().click();
	   Thread.sleep(6000);
	   surl.getDelete().click();
	   Location l = new Location(driver);
	   Thread.sleep(6000);
	   l.getFolderDeleteYes().click();
	   Thread.sleep(5000);
	   InlineEdit ie = new InlineEdit(driver);
//	   Thread.sleep(5000);
	   
	   //delete roles and restore roles
//	   Settings_RolesPage su = new Settings_RolesPage(driver);
//	   Thread.sleep(2000);
//	   su.getThreeDotsAction().click();
//	   su.getDelete().click();
	   
//	   l.getFolderDeleteYes().click();
	   Thread.sleep(6000);
	   hp.getTrash().click();
	   Thread.sleep(6000);
	   surl.getCheckbox().click();
	   Thread.sleep(6000);
	   ie.getRestoreButton().click();
	   Thread.sleep(6000);
	   ie.getRestorePopup().click();	   
}

}