package com.pom;

import org.openqa.selenium.WebDriver;

import com.utils.ReadPropertiesFiles;
import com.utils.WebElement;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AdminPOM extends WebElement {

	ReadPropertiesFiles adminprop;
	// Records Found
	final static String filename = "Admin.properties";
	final static String path = System.getProperty("user.dir") + pathSeparator + "src" + pathSeparator + "main"
			+ pathSeparator + "resources" + pathSeparator + filename;

	public AdminPOM(ThreadLocal<WebDriver> driver) {
		this.driver = driver;
		adminprop = new ReadPropertiesFiles(path);

	}

	public boolean VerifyRecords(String value) {
		try {
			if (verifyTextWithcontains(adminprop.getValue(LB_RECORDS), value))
				if (getNumberOfRecords(adminprop.getValue(LB_NUMBEROFRECORDS), value)) {
					System.out.println(noOfRecords.get());
					return true;
				}
			return false;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

}
