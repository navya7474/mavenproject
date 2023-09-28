package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestNG {
	@Test
	public void demo() {
		Reporter.log("welcome to testng", true);
	}

}
