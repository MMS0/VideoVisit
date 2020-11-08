package commonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BrowserSetup {
	public static Properties properties;
	public static WebDriver driver;
	

	public Properties propertyload() throws IOException
	{
		FileInputStream pro=new FileInputStream("config.properties");
		properties=new Properties();
		properties.load(pro);
		return properties;
	}
	
	@BeforeTest
	public void browser() throws IOException
	{
		propertyload();
		String driverlocation=properties.getProperty("driverlocation");
		String browser=properties.getProperty("browser");
		String url=properties.getProperty("url");
		String Local_url=properties.getProperty("Local_url");
		String advanced=properties.getProperty("advanced");
		String proceed=properties.getProperty("proceed");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", driverlocation);
			driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", driverlocation);
			driver=new FirefoxDriver();	
		}
		driver.manage().window().maximize();
		driver.get(url);
		//driver.get(Local_url);
		//driver.findElement(By.xpath(advanced)).click();
		//driver.findElement(By.xpath(proceed)).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@AfterTest
	public void teardown()
	{
		//driver.close();
	}
}
