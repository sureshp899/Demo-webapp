	package commonfunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class baseclass {
    public String appURL;
	public  WebDriver driver;
	public  Properties prop;
	public  Properties objrepository;
	
	@BeforeClass
	public void setUP() throws IOException {
		prop= new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\narendra.ragipindi\\eclipse-workspace\\DemoWebShop\\src\\main\\java\\commonfunctions\\data.properties");
		prop.load(fis);

		objrepository= new Properties();
		FileInputStream ofis=new FileInputStream("C:\\Users\\narendra.ragipindi\\eclipse-workspace\\DemoWebShop\\src\\main\\java\\com\\objectRepository\\objectRepository.properties");
		objrepository.load(ofis);
		
		this.initializeDriver();
	}
	
public void initializeDriver() throws IOException
{
	
	
String browserName=prop.getProperty("browser");
 appURL = prop.getProperty("appURL");


if(browserName.equals("chrome"))
{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\narendra.ragipindi\\Downloads\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	
	driver= new ChromeDriver();
		
	driver.get(appURL);
}
else if (browserName.equals("firefox"))
{
	 driver= new FirefoxDriver();
	 driver.get(appURL);
}
else if (browserName.equals("IE"))
{
	// IE Code
	}

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



}


	
}
