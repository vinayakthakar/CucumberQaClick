package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class accessMenus{
	
	public WebDriver driver;
	
		
		
		By home=By.xpath("//a[contains(text(),'Home')]");
		By courses=By.xpath("//header/div[2]/div[1]/nav[1]/ul[1]/li[2]/a[1]");
		By videos=By.xpath("//a[contains(text(),'Videos')]");
		By interviewGuide=By.xpath("//header/div[2]/div[1]/nav[1]/ul[1]/li[4]/a[1]");
		By Practice=By.xpath("//a[contains(text(),'Practice')]");
		By Blog=By.xpath("//a[contains(text(),'Blog')]");
		By About=By.xpath("//a[contains(text(),'About')]");
		By Contact=By.xpath("//a[contains(text(),'Contact')]");
		
		
	
	
	public accessMenus(WebDriver driver) {
			// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
		}

	public WebElement gethome()
	{
		return driver.findElement(home);
	}
	
	public WebElement getcourses()
	{
		return driver.findElement(courses);
	}
	
	public WebElement getvideos()
	{
		return driver.findElement(videos);
	}
	
	public WebElement getinterviewGuide()
	{
		return driver.findElement(interviewGuide);
	}
	
	public WebElement getPractice()
	{
		return driver.findElement(Practice);
	}
	
	public WebElement getBlog()
	{
		return driver.findElement(Blog);
	}
	
	public WebElement getAbout()
	{
		return driver.findElement(About);
	}
	
	public WebElement getContact()
	{
		return driver.findElement(Contact);
	}

}
