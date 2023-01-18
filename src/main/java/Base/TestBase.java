package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadData;

public class TestBase {
	public static WebDriver driver;
	public void initiaization() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(ReadData.ReadPropertyFile("url"));
		 //	driver.get("https://www.saucedemo.com/");
		
		
	}

}
 