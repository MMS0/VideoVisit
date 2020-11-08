package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.BrowserSetup;
import pageObjects.SignIn;

public class RecaptchaLogin extends BrowserSetup {

	@Test(invocationCount=5)
	public void recaptcha() throws InterruptedException
	{
		PageFactory.initElements(driver, SignIn.class);
		SignIn.signinpage.click();
		SignIn.id.sendKeys(properties.getProperty("Doctor_id"));
		SignIn.password.sendKeys(properties.getProperty("Doctor_password"));
		SignIn.signinenter.click();
		Thread.sleep(2000);
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Home";
		System.out.println("Actual Title is:"+ActualTitle);
		System.out.println("Expected Title is:"+ExpectedTitle);
		if (ExpectedTitle.equals(ActualTitle))
		{
			System.out.println("No Recaptcha Error");
		}
		else	{	System.out.println("Recaptcha error occurs");	}
		Thread.sleep(1000);
		driver.close();
		
	}
	
}
