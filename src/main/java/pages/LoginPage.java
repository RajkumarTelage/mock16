package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import utility.ReadData;

public class LoginPage extends TestBase {

	@FindBy(xpath="//input[@id=\"user-name\"]")private WebElement UserName;
	@FindBy(xpath="//input[@id=\"password\"]")private WebElement Password;
	@FindBy(xpath="//input[@id=\"login-button\"]")private WebElement Login;
	@FindBy(xpath="//div[@class=\"login_logo\"]")private WebElement LoginLogo; 
	@FindBy(xpath="//div[@class=\"bot_column\"]")private WebElement BotLogo;
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public String VerifyTitle() 
	{
		return driver.getTitle();
	}
	public boolean VerifyLoginLogo() 
	{	return LoginLogo.isDisplayed();
		
	}
	public boolean VerifyBotLogo()
	{
		return BotLogo.isDisplayed();
	}
	public String VerifyCurrentUrl() 
	{
		return driver.getCurrentUrl();
	}
	public void VerifyLoginInfo() throws IOException 
	{
		UserName.sendKeys(ReadData.ReadPropertyFile("username"));
		Password.sendKeys(ReadData.ReadPropertyFile("password"));
		Login.click();
	}
	
}
