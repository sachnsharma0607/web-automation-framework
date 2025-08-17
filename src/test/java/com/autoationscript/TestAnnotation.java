package com.autoationscript;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestAnnotation {
	//@Test(dataProvider ="DTest")
	public void test(String a, String b)
	{
		System.out.println(a+".."+b);
	}
	
	//@DataProvider(name = "DTest")
	public Object[][] test1()
	{
		String[][] data= {{"admin","123"},{"Ankita","Ankita123"}};
		
		return data;
		
	}

}
