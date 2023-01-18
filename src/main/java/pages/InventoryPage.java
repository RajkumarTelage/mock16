package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;
import utility.UtilityMethod;

public class InventoryPage extends TestBase {
	

@FindBy(xpath="//a[@href=\"https://twitter.com/saucelabs\"]")private WebElement Twitter;
@FindBy(xpath="//a[text()=\"Facebook\"]")private WebElement Facebook;
@FindBy(xpath="//a[text()='LinkedIn']")private WebElement LinkedIn;
@FindBy(xpath="//select[@class=\"product_sort_container\"]")private WebElement DropDown;
@FindBy(xpath="//button[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]\r\n" + 
		"")private WebElement TShirtRed;
@FindBy(xpath="//button[@id=\"add-to-cart-sauce-labs-onesie\"]")private WebElement SauceLabs;
@FindBy(xpath="//span[@class=\"shopping_cart_badge\"]")	private WebElement Count;	

public InventoryPage() 
		{
			PageFactory.initElements(driver, this);
		}
		
			public String VerifyCurrentUrl() 
		{	
			return driver.getCurrentUrl();
		}
	
			public String VerifyTitle() 
		{	

				return driver.getTitle();
		}
			public boolean VerifyTwitter() 
			{
				return Twitter.isDisplayed();
			}
			public boolean VerifyFacebook() 
			{
				return Facebook.isDisplayed();
			}
			public boolean VerifyLinkedIn()
			{
				return LinkedIn.isDisplayed();
			}
			public String VerifyDropDown() 
			{
				UtilityMethod.SelectClass(DropDown, "Name (Z to A)");
				TShirtRed.click();
				SauceLabs.click();
				Count.click();
				return Count.getText();
				
				
			}
			
	}


