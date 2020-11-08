package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.BrowserSetup;
import pageObjects.Call2Patient;
import pageObjects.DoctorCallButtons;
import pageObjects.SignIn;

public class DisableMic_CallPatient extends BrowserSetup {
	public void signin() {
		PageFactory.initElements(driver,SignIn.class);
		SignIn.signinpage.click();
		SignIn.id.clear();
		SignIn.id.sendKeys(properties.getProperty("Doctor_id"));
		SignIn.password.clear();
		SignIn.password.sendKeys(properties.getProperty("Doctor_password"));
		SignIn.signinenter.click();
	}
	public void callpatient() {
		PageFactory.initElements(driver, Call2Patient.class);
		Call2Patient.teledoctor.click();
		Call2Patient.particularpatient.click();//Patient p15@g.com
	}
	public void micoff()
	{
		PageFactory.initElements(driver, DoctorCallButtons.class);
		DoctorCallButtons.mic.click();
	}
	
	@Test
	public void CallPatient() throws InterruptedException
	{
		signin();
		callpatient();
		micoff();
		Thread.sleep(5000);
	}

}
