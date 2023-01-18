package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import utility.ReadData;

public class CheckoutPage extends TestBase {
@FindBy(xpath="//input[@id=\"first-name\"]")private WebElement FirstName;
@FindBy(xpath="//input[@id=\"last-name\"]")private WebElement LastName;
@FindBy(xpath="//input[@id=\"postal-code\"]")private WebElement PostalCode;
@FindBy(xpath="//input[@id=\"continue\"]")private WebElement Continue;

public CheckoutPage() 
{	PageFactory.initElements(driver, this);
	}
	public String VerifyUrl() 
	{
		return driver.getCurrentUrl();
		
	}
	public void VerifyCheckoutInfo() throws IOException
	{
		FirstName.sendKeys(ReadData.Readexcel(0, 0));
		LastName.sendKeys(ReadData.Readexcel(0, 1));
		PostalCode.sendKeys(ReadData.Readexcel(0, 2));
		Continue.click();

		
	}
}
