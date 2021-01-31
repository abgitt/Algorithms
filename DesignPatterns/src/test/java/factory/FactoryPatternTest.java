package factory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DrvierManagerFactory.DriverFactory;
import DrvierManagerFactory.DriverManager;

public class FactoryPatternTest 
{
	DriverManager driverMgr;
	WebDriver driver;
	@BeforeTest
	public void method()
	{
		driverMgr = DriverFactory.getDriver("Chrome");
	}
	@BeforeMethod
	public void befmethod()
	{
		driver = driverMgr.getDriver();
	}
	@Test
	public void testMeth()
	{
		driver.get("https://www.google.com");
	}
	@AfterMethod
	public void quitDriver()
	{
		driverMgr.quitDriver();
	}
}
