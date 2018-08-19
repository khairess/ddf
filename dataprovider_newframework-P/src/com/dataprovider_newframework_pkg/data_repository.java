package com.dataprovider_newframework_pkg;

//import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class data_repository {
  

  @DataProvider(name="login_data")
  public static Object[][] loginsheet() {
	  String path = System.getProperty("user.dir")+"\\src\\com\\dataprovider_newframework_pkg";
	  Object[][] arrayObject = excel_utility.getExcelData(path+"\\login2.xls","Sheet1");
		return arrayObject;
  }
}
