package com.dataprovider;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider="getData")
	public void test1(ITestContext context, String value) {
		System.out.println(context.getAttribute("name"));
		System.out.println(value);
		context.setAttribute("name", value);
	}
	
	@DataProvider
	public Object[][] getData() {
		return new Object[][] {
			{"Amuthan"},
			{"Sakthivel"}
		};
	}

}
