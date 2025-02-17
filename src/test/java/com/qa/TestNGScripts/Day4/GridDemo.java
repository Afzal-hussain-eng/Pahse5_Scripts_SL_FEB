package com.qa.TestNGScripts.Day4;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GridDemo {
	
	public static WebDriver driver;

@BeforeClass
public static void gridDemo() throws MalformedURLException, InterruptedException
{
	DesiredCapabilities cap = new DesiredCapabilities();
	
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WINDOWS);
	
	ChromeOptions options = new ChromeOptions();
	options.merge(cap);
	
	String hubURL= "http://192.168.1.14:4545/wd/hub";
	
	// RemoteWebDriver()
	
	driver = new RemoteWebDriver(new URL("http://192.168.43.118:4545/wd/hub"),options);
}
	
	@Test
	public void seleniumtest() throws InterruptedException
	{
	driver.get("https://www.selenium.dev/downloads/");
	
	Thread.sleep(3000);
	
	System.out.println(driver.getTitle());
	
}

}


