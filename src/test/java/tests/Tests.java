/*
 Appium Mobile App Calculator Automation Project
         Tested By:  Sakib Sarkar
 */
package tests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.MobileElement;

public class Tests extends BaseClass
{
	@Test
	public void Addition() 
	{
		ExtentTest test = extent.createTest("Addition","Add multiple value");
		test.log(Status.INFO,"Test Started");
		
		MobileElement zero=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_00"));
		MobileElement one=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_01"));
		MobileElement two=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_02"));
		MobileElement three=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_03"));
		MobileElement four=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_04"));
		MobileElement five=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_05"));
		MobileElement six=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_06"));
		MobileElement seven=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_07"));
		MobileElement eight=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_08"));
		MobileElement nine=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_09"));

		//--------------Button Logical Expression----------------//
		MobileElement plus=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_add"));
		MobileElement subtraction=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_sub"));
		MobileElement multiply=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_mul"));
		MobileElement division=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_div"));

		//-----------------Button Function --------------------//
		MobileElement equals=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_equal"));
		MobileElement delete=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_backspace"));
		
		five.click();
		plus.click();
		three.click();
		plus.click();
		two.click();
		plus.click();
		three.click();
		equals.click();

		test.log(Status.INFO,"Completed");

	}
	@Test
	public void Subtraction()
	{
		ExtentTest test = extent.createTest("Subtraction","Subtraction value");
		test.log(Status.INFO,"Test Started");
		
		MobileElement zero=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_00"));
		MobileElement one=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_01"));
		MobileElement two=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_02"));
		MobileElement three=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_03"));
		MobileElement four=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_04"));
		MobileElement five=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_05"));
		MobileElement six=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_06"));
		MobileElement seven=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_07"));
		MobileElement eight=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_08"));
		MobileElement nine=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_09"));

		//--------------Button Logical Expression----------------//
		MobileElement plus=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_add"));
		MobileElement subtraction=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_sub"));
		MobileElement multiply=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_mul"));
		MobileElement division=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_div"));

		//-----------------Button Function --------------------//
		MobileElement equals=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_equal"));
		MobileElement delete=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_backspace"));

		

		five.click();
		plus.click();
		three.click();
		plus.click();
		three.click();
		subtraction.click();
		three.click();
		equals.click();

		test.log(Status.INFO,"Completed");
	}

	@Test
	public void Multiplication()
	{
		ExtentTest test = extent.createTest("Multiplication","Multiply more value");
		test.log(Status.INFO,"Test Started");
		
		MobileElement zero=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_00"));
		MobileElement one=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_01"));
		MobileElement two=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_02"));
		MobileElement three=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_03"));
		MobileElement four=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_04"));
		MobileElement five=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_05"));
		MobileElement six=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_06"));
		MobileElement seven=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_07"));
		MobileElement eight=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_08"));
		MobileElement nine=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_09"));

		//--------------Button Logical Expression----------------//
		MobileElement plus=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_add"));
		MobileElement subtraction=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_sub"));
		MobileElement multiply=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_mul"));
		MobileElement division=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_div"));

		//-----------------Button Function --------------------//
		MobileElement equals=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_equal"));
		MobileElement delete=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_backspace"));

		five.click();
		subtraction.click();
		three.click();
		subtraction.click();
		three.click();
		plus.click();
		three.click();
		equals.click();

		test.log(Status.INFO,"Completed");

	}
	
	

	@Test
	public void Division()
	{
		ExtentTest test = extent.createTest("Division","Divide value");
		test.log(Status.INFO,"Test Started");
		
		MobileElement zero=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_00"));
		MobileElement one=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_01"));
		MobileElement two=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_02"));
		MobileElement three=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_03"));
		MobileElement four=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_04"));
		MobileElement five=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_05"));
		MobileElement six=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_06"));
		MobileElement seven=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_07"));
		MobileElement eight=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_08"));
		MobileElement nine=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_09"));

		//--------------Button Logical Expression----------------//
		MobileElement plus=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_add"));
		MobileElement subtraction=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_sub"));
		MobileElement multiply=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_mul"));
		MobileElement division=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_div"));

		//-----------------Button Function --------------------//
		MobileElement equals=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_equal"));
		MobileElement delete=driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_backspace"));

		five.click();
		division.click();
		five.click();
		subtraction.click();
		three.click();
		plus.click();
		three.click();
		equals.click();

		test.log(Status.INFO,"Completed");

	}

	@AfterTest
	public void TearDown()
	{
		driver.close();
		driver.quit();
	}
}
