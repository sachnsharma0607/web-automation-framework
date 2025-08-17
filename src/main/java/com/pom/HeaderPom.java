package com.pom;

import java.io.File;

import org.openqa.selenium.WebDriver;

import com.utils.ReadPropertiesFiles;
import com.utils.WebElement;

public class HeaderPom extends WebElement{
	ReadPropertiesFiles headerprop;
	
	final static String filename="Header.properties";
	final static String path=System.getProperty("user.dir")+pathSeparator+"src"+pathSeparator+"main"+pathSeparator+"resources"+pathSeparator+filename;
	
		
	public HeaderPom(ThreadLocal<WebDriver> driver) {
		this.driver=driver;
		headerprop=new ReadPropertiesFiles(path);
		
	}

	public boolean verifyhomePage(String value)
	{
		try {
			if(verifyText(headerprop.getValue(lbl_Dashboard), value))
				return true;
			return false;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean verifyadmin(String value)
	{
		try {
			if(verifyText(headerprop.getValue(LB_ADMIN), value))
				return true;
			return false;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

}
