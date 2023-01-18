package TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import pages.InventoryPage;
import pages.LoginPage;

public class InventoyPageTest extends TestBase{
	LoginPage login;//=new LoginPage();
	InventoryPage inv;//=new InventoryPage();
	@BeforeMethod(alwaysRun=true)
	public void setup() throws IOException 
	{
		initiaization();
		login=new LoginPage();
		login.VerifyLoginInfo();
		inv=new InventoryPage();
	}
	
	@Test(groups="smoke")
	public void VerifyCurrentTitleTest() 
	{
		String act = inv.VerifyCurrentUrl();
		String exp="https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(act, exp);
	}
	@Test 
	public void VerifyTitleTest() 
	{
		String act = inv.VerifyTitle();
		String exp="Swag Labs";
		Assert.assertEquals(act, exp);
	}
	
	@Test
	public void VerifyTwitterTest() 
	{
		boolean act = inv.VerifyTwitter();
		Assert.assertEquals(act, true);
	}
	@Test
	public void VerifyFacebookTest() 
	{
		boolean act = inv.VerifyFacebook();
		Assert.assertEquals(act, true);
	}
	@Test
	public void VerifyLinkedInTest() 
	{
		boolean act = inv.VerifyLinkedIn();
		Assert.assertEquals(act, true);
	}
	
	@Test
	public void VerifyCountTest() {
		String act = inv.VerifyDropDown();
		String exp="2";
		Assert.assertEquals(act, exp);
	}
	
	
	
	
	
	@AfterMethod(alwaysRun=true)
	public void CloseBrowser() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
}
