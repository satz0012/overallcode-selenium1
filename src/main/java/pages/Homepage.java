package pages;

import base.ProjectSpecificMethods;

public class Homepage extends ProjectSpecificMethods {
	
	public Homepage Verifylogin()
	{
		String text=driver.findElementByTagName("h2").getText();
		if(text.contains("Demo"))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("test case failed");
		}
		return this;
	}
		
	public Loginpage clicklogout()
	{
		driver.findElementByClassName("decorativeSubmit").click();
		return new Loginpage();
	}

}
