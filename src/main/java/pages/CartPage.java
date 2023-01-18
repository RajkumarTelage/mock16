package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CartPage extends TestBase {
@FindBy(xpath="//button[@id=\"remove-test.allthethings()-t-shirt-(red)\"]")private WebElement TShirt;
@FindBy(xpath="//span[@class=\"shopping_cart_badge\"]")	private WebElement Cart;
@FindBy(xpath="//button[@id=\"checkout\"]")private WebElement Checkout;
	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}

	public String VerifyUrl() 
	{
		return driver.getCurrentUrl();
	}
	public String VerifyCartCount() throws InterruptedException {
		Thread.sleep(4000);
		TShirt.click();
		Thread.sleep(4000);
		Checkout.click();
		return Cart.getText();
		

	}
	

}
