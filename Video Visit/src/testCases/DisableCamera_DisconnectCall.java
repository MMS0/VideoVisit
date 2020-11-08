package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.BrowserSetup;
import pageObjects.Call2Patient;
import pageObjects.DoctorCallButtons;
import pageObjects.SignIn;

public class DisableCamera_DisconnectCall extends BrowserSetup {
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
		Call2Patient.particularpatient.click();
	}
	public void cameraoff()
	{
		PageFactory.initElements(driver, DoctorCallButtons.class);
		DoctorCallButtons.camera.click();
	}
	public void disconnectcall()
	{
		PageFactory.initElements(driver, DoctorCallButtons.class);
		DoctorCallButtons.hangup.click();
	}
	
	@Test
	public void CallPatient() throws InterruptedException
	{
		signin();
		callpatient();
		cameraoff();
		disconnectcall();
		Thread.sleep(5000);
	}

}
