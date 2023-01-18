package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CheckoutPage2 extends TestBase {
@FindBy(xpath="//button[@id=\"finish\"]")private WebElement Finish;
	
public CheckoutPage2() 
{PageFactory.initElements(driver, this);
	}

public String verifyCurrentUrl() 
	{
		return driver.getCurrentUrl();
		
	}
public void VerifyFinish() 
{Finish.click();


	}
	
}
