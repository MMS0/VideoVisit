package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.BrowserSetup;
import pageObjects.SignIn;

public class PatientLogin extends BrowserSetup {
	@Test
	public void Patient_Login()
	{
		PageFactory.initElements(driver , SignIn.class);
		SignIn.signinpage.click();
		SignIn.id.clear();
		SignIn.id.sendKeys(properties.getProperty("Patient_id"));
		SignIn.password.clear();
		SignIn.password.sendKeys(properties.getProperty("Patient_password"));
		SignIn.signinenter.click();
	}

}
