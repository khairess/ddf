package com.dataprovider_newframework_pkg;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test_cases {
	
	@BeforeSuite
	public void start()
	{
	comman_operation.openURL();
	}
	
  @Test(dataProvider="login_data", dataProviderClass=data_repository.class)
  public void login(String userName, String password, String addr, String pin, String url) 
  {
	  // get login data from sheet in particular id password column, write acutal login logic here.
	  System.out.println(userName);
	  System.out.println(password);		
  }
  
  @Test(dataProvider="login_data", dataProviderClass=data_repository.class)
  public void open_article(String userName, String password, String addr, String pin, String url) 
  {
	  // get url from sheet, write acutal open url logic here.
	  System.out.println(url);
	  //comman_operation.driver.navigate().to(url);
	  		
  }
  
    
  @AfterSuite
	public void tearDown() 
  {
	  comman_operation.closebrowser();
		}
}
