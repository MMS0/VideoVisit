package MainMethod;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RecaptchaSignin {
  static WebDriver driver;
  String url="https://www.75health.com/";//https://192.168.43.211:8443/
  String driverlocation="driver/chromedriver.exe";
  String driverlocation2="driver/geckodriver.exe";
  public void browser(String browser)
  {
	  if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", driverlocation);
			driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", driverlocation2);
			driver=new FirefoxDriver();	
		}
	  driver.manage().window().maximize();
	  driver.get(url);
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }
	public static void main(String args[]) throws InterruptedException
	{
	RecaptchaSignin run=new RecaptchaSignin()	;
	run.browser("firefox");
	//driver.findElement(By.xpath("/html/body/div/div[2]/button[3]")).click();
	//driver.findElement(By.xpath("/html/body/div/div[3]/p[2]/a")).click();
	
	driver.findElement(By.linkText("Sign In")).click();
	driver.findElement(By.xpath("//*[@id='userLoginId']")).sendKeys("h");
	driver.findElement(By.xpath("//*[@id=\"currentPassword\"]")).sendKeys("h");
	driver.findElement(By.xpath("//*[@id=\"sign_In\"]/div")).click();
	Thread.sleep(3000);
	String ActualTitle=driver.getTitle();
	String ExpectedTitle="Home";
	System.out.println("Actual Title is:"+ActualTitle);
	System.out.println("Expected Title is:"+ExpectedTitle);
	//Assert.assertEquals(ActualTitle, ExpectedTitle);
	//System.out.println("Recaptcha Passed");
	if (ExpectedTitle.equals(ActualTitle))
	{
		System.out.println("No Recaptcha Error");
	}
	else	{	System.out.println("Recaptcha error occurs");	}
	
	driver.close();
	
	}
	
}
