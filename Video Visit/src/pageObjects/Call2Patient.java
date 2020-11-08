package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commonFunctions.BrowserSetup;

public class Call2Patient {
	
	@FindBy(xpath="//*[@id=\"menuHospital\"]/table/tbody/tr[6]/td[2]")
	public static WebElement teledoctor;
	@FindBy(xpath="//*[@id=\"p15\"]/div[5]/table/tbody/tr[1]/td[2]/div")
	public static WebElement particularpatient;
	@FindBy(xpath="//*[@id=\"more\"]/div/div[2]/div/div[2]")
	public static WebElement searchbox;
	@FindBy(xpath="//*[@id=\"ui-id-42\"]")
	public static WebElement clickpatient; ////*[@id="p15"]/div[6]/table/tbody/tr[1]/td[2]
	

}
