
package tests;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseClass extends DemoHtmlReports 
{  
	static AppiumDriver<MobileElement>driver;


	@BeforeTest
	public void setup() throws MalformedURLException
	{
		try {
			DesiredCapabilities caps=new DesiredCapabilities();

			caps.setCapability("automationName", "uiautomator1");
			caps.setCapability("deviceName", "Galaxy J5 Prime");
			caps.setCapability("udid", "192.168.0.199:5555");
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "8.0.0");
			caps.setCapability("appPackage", "com.sec.android.app.popupcalculator");
			caps.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
			URL url=new URL(" http://127.0.0.1:4723/wd/hub");
			driver=new AppiumDriver<MobileElement>(url,caps);
			System.out.println("Application started");




		}catch(Exception exp)
		{
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}

	}


}
