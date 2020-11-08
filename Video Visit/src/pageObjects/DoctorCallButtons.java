package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DoctorCallButtons {
	@FindBy(xpath="//*[@id=\"audio-btn\"]")
	public static WebElement mic;
	@FindBy(xpath="//*[@id=\"video-btn\"]")
	public static WebElement camera;
	@FindBy(xpath="//*[@id=\"AlertMessage\"]/div[2]/div[2]/span[2]/span")
	public static WebElement hangup;

}
