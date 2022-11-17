package com.Gigleji.testCase;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeGroups;

public class Baseclass {
    
	public String baseurl="https://app.gigleji.com/";
	public String Email="ishratunissa150@gmail.com";
	public String password="def99cba";
	public static WebDriver driver;
	
	
@BeforeGroups
    public void setup()
    {
	System.setProperty("webdriver.chrome.driver","\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
    }
@AfterClass
public void tearDown()
{
	driver.quit();
    }
}
