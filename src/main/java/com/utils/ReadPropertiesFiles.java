package com.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertiesFiles {
	Properties prop=new Properties();
	String path="";
	public ReadPropertiesFiles(String path) {
		try {
		this.path=path;
		System.out.println(path);
		prop.load(new FileInputStream(path));
		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getValue(String key)
	{
		return (String) prop.get(key);
		
	}
}
