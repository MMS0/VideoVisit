package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignIn {
	@FindBy(how=How.LINK_TEXT,using="Sign In") 
	public static WebElement signinpage;
	@FindBy(xpath="//*[@id='userLoginId']")
	public static WebElement id;
	@FindBy (xpath="//*[@id=\"currentPassword\"]")
	public static WebElement password;
	@FindBy(xpath="//*[@id=\"sign_In\"]/div")
	public static WebElement signinenter;	
	
}
