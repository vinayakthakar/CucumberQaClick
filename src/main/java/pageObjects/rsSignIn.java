package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rsSignIn {
	
	public WebDriver driver;
		
		By SignIn = By.xpath("//span[contains(text(),'Login')]");
		By UserName = By.id("user_email");
		By Password = By.id("user_password");
		By Submit = By.xpath("//input[@type='submit']");
		
		public rsSignIn(WebDriver driver) {
			// TODO Auto-generated constructor stub
			
			this.driver=driver;
		}

		public WebElement getSignIn()
		{
			return driver.findElement(SignIn);
		}
		
		public WebElement getUserName()
		{
			return driver.findElement(UserName);
		}
		
		public WebElement getPassword()
		{
			return driver.findElement(Password);
		}
		
		public WebElement getSubmit()
		{
			return driver.findElement(Submit);
		}

}
