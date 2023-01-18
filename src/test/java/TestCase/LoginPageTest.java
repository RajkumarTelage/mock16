package TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage login=new LoginPage();
	@BeforeMethod(alwaysRun=true)
	public void setup() throws IOException
	{
		initiaization();
		login=new LoginPage();
	}
	
	@Test(groups="smoke")
	public void VerifyTileTest(){
	String act = login.VerifyTitle();
	String exp="Swag Labs";
	Assert.assertEquals(act, exp);
	}
	
	@Test(groups="smoke")
	public void VerifyCurrentUrl()
	{
		String act = login.VerifyCurrentUrl();
		String exp="https://www.saucedemo.com/";
		Assert.assertEquals(act, exp);

	}
	
	@Test
	public void VerifyLoginInfoTest() throws IOException 
	{
		login.VerifyLoginInfo();
	}
	
	@Test
	public void  VerifyBotLogoTest()
	{
		boolean act = login.VerifyBotLogo();
		Assert.assertEquals(act, true);
		
	}
	@Test
	public void VerifyLoginLogoTest() 
	{
		boolean act = login.VerifyLoginLogo();
		Assert.assertEquals(act, true);
	}
	
	
	@AfterMethod(alwaysRun=true)
	public void CloseBrowser() 
	{
	driver.close();
	}
	
	
	
	
	
	
	
	
	
}
 