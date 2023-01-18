package TestCase;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import pages.CartPage;
import pages.CheckoutPage;
import pages.CheckoutPage2;
import pages.InventoryPage;
import pages.LoginPage;

public class Checkout2Test extends TestBase{

	LoginPage login;
	InventoryPage inv;
	CartPage cart;
	CheckoutPage check;
	CheckoutPage2 check1;
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
		check.VerifyCheckoutInfo();
		check1=new CheckoutPage2();
	}

		@Test
		public void verifyCurrentUrlTest() 
		{
			String act = check1.verifyCurrentUrl();
			String exp="https://www.saucedemo.com/checkout-step-two.html";
		}
		@Test
		public void VerifyFinish()
		{
			check1.VerifyFinish();
		}	
		
	
	
	
}
