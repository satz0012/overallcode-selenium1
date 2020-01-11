package pages;

import base.ProjectSpecificMethods;

public class Loginpage extends ProjectSpecificMethods {
	public Loginpage enterusername(String data)
	{
		driver.findElementById("username").sendKeys(data);
		return this;
	}
	
	
public Loginpage enterpassword(String data)
{
	driver.findElementById("password").sendKeys(data);
	return this;
	
}

public Homepage clicklogin()
{
	driver.findElementByClassName("decorativeSubmit").click();
	Homepage hmj=new Homepage();
	return hmj;
	
}

}


