package base;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.Exce;




public class ProjectSpecificMethods {
	public static ChromeDriver driver;// static if we use the keyword means the chrome driver object, it will be used in all the pages linked with this class
	public String excelFileName;
	@BeforeMethod
	public void login()
	{
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
}
	@AfterMethod
	public void logout()
	{
		driver.close();	
	}

	@DataProvider
	public String[][] getdata() throws IOException
	{
	//String[][] data=new String[2][3];
	//data[0][0]="testleaf";
	//data[0][1]="sam";
	//data[0][2]="kuran";
	//
	//data[1][0]="testleaf";
	//data[1][1]="ram";
	//data[1][2]="kumar";

		//data[1][2]="kumar";
		Exce data = new Exce();//getting the excel data
		return data.exce(excelFileName);
		
	}
	

}
