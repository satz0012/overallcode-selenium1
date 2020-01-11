package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.Loginpage;

public class Tc001 extends ProjectSpecificMethods {
	@BeforeClass
	public void setDate()
	{
		excelFileName ="login";
	
	}
	@Test(dataProvider="getdata")
	public void loginlogout(String username, String password)
	{
		new Loginpage()
		.enterusername(username)
		.enterpassword(password)
		.clicklogin()
		.Verifylogin()
		.clicklogout();
		
		
	}
	

}
