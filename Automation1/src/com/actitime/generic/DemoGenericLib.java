package com.actitime.generic;

import java.io.IOException;

public class DemoGenericLib {

	public static void main(String[] args) throws IOException {
FileLib1 f=new FileLib1();
String url=f.getPropetyData("url");
String un=f.getPropetyData("username");
String pw=f.getPropetyData("password");
System.out.println(url);
System.out.println(un);
System.out.println(pw);
f.setExcelData("createCustomer", 1, 3, "SBI_003");
String cn=f.getExcelData("createCustomer", 1, 3);
System.out.println(cn);
	}

}
