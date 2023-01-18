package TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import pages.CartPage;
import pages.InventoryPage;
import pages.LoginPage;

public class CartPageTest extends TestBase {
	LoginPage login;
	InventoryPage inv;
	CartPage cart;
	@BeforeMethod
	public void setup() throws IOException
	{
		initiaization();
		login=new LoginPage();
		login.VerifyLoginInfo();
		inv=new InventoryPage();
		inv.VerifyDropDown();	
		cart=new CartPage();
		
	}
	@Test
	public void verifyUrl() 
	{
		String act = cart.VerifyUrl();
		String exp="https://www.saucedemo.com/cart.html";
		Assert.assertEquals(act, exp);
	}
	@Test
	public void CartCountTest() throws InterruptedException 
	{
		String act = cart.VerifyCartCount();
		String exp="1";
		Assert.assertEquals(act, exp);
		
	}
@AfterMethod
public void CloseBrowser() {
	driver.close();
}
}
