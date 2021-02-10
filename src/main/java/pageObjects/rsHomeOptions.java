package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rsHomeOptions {
	
	public WebDriver driver;
	
	// Register on https://www.rahulshettyacademy.com from home page.
	By Register = By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]");
	
	By UserName = By.id("user_name");
	By UserEmail = By.id("user_email");
	By Password = By.id("user_password");
	By confirmPwd = By.id("user_password_confirmation");
	By Instructions = By.id("user_unsubscribe_from_marketing_emails");
	By Terms = By.id("user_agreed_to_terms");
	By SignUp = By.cssSelector("#new_user > center > input");
	
	
	// Register on https://www.rahulshettyacademy.com from home page.
	
	By LogIn = By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[2]/a[1]");
	
	By loginEmail = By.id("user_email");
	By loginPassword = By.id("user_password");
	By loginSubmit = By.cssSelector("input[type='submit']");
	
	

	public rsHomeOptions(WebDriver driver)  {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}



	public WebElement getRegister()
	{
		return driver.findElement(Register);
	}
	
	public WebElement getUserName()
	{
		return driver.findElement(UserName);
	}
	
	public WebElement getUserEmail()
	{
		return driver.findElement(UserEmail);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(Password);
	}
	
	public WebElement getconfirmPwd()
	{
		return driver.findElement(confirmPwd);
	}
	
	public WebElement getInstructions()
	{
		return driver.findElement(Instructions);
	}
	
	public WebElement getTerms()
	{
		return driver.findElement(Terms);
	}
	
	public WebElement getSignUp()
	{
		return driver.findElement(SignUp);
	}
	
	public WebElement getLogIn()
	{
		return driver.findElement(LogIn);
	}
	
	public WebElement getloginEmail()
	{
		return driver.findElement(loginEmail);
	}
	
	public WebElement getloginPassword()
	{
		return driver.findElement(loginPassword);
	}
	
	public WebElement getloginSubmit()
	{
		return driver.findElement(loginSubmit);
	}

}
