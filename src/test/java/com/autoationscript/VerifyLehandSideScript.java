package com.autoationscript;

import static org.testng.Assert.assertTrue;


import org.testng.annotations.Test;

import com.pom.AdminPOM;
import com.pom.LeftHandSidePOM;
import com.utils.ExtendsReportsUtils;

public class VerifyLehandSideScript extends BaseClass{
	
	@Test
	public void clicknLethandSide_Arrow()
	{
		LeftHandSidePOM lefthandside=new LeftHandSidePOM(driver);
		AdminPOM admin=new AdminPOM(driver);
		userableToLogin();
		assertTrue(lefthandside.verifyArroInExpandMode());
	//	ExtendsReportsUtils.pass("");
		assertTrue(lefthandside.clickOnAdmin());
		assertTrue(lefthandside.verifyadmin("Admin"));
		assertTrue(admin.VerifyRecords("Found"));
		//assertTrue(admin.VerifyRecords(""));
		
	}
	
	
}
