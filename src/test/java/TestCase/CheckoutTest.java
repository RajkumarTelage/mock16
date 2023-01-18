package TestCase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import pages.CartPage;
import pages.CheckoutPage;
import pages.InventoryPage;
import pages.LoginPage;

public class CheckoutTest extends TestBase {
	LoginPage login;
	InventoryPage inv;
	CartPage cart;
	CheckoutPage check;
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		
		initiaization();
		login=new LoginPage();
		login.VerifyLoginInfo();
		inv=new InventoryPage();
		inv.VerifyDropDown();
		 cart=new CartPage();
		 cart.VerifyCartCount();
		 check=new CheckoutPage();
		}
	@Test
	public void VerifyUrlTest() 
	{
		check.VerifyUrl();
		
	}
	@Test
	public void VerifyCheckoutInfoTest() throws IOException
	{
		check.VerifyCheckoutInfo();
	}
	
	@AfterMethod
	public void CloseBrowser() {
		driver.close();
	}
}
