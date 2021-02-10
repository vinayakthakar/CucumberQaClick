package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rsNavigateMenus{
	
	public WebDriver driver;
	
		
		
		By home=By.xpath("//a[contains(text(),'Home')]");
		By courses=By.xpath("//a[contains(text(),'Courses')]");
		By Mentorship=By.xpath("//a[contains(text(),'Mentorship')]");
		By PracticeProjects=By.xpath("//a[contains(text(),'Practice Projects')]");
		By Consulting=By.xpath("//a[contains(text(),'Consulting')]");
		By Learningpath=By.xpath("//a[contains(text(),'Learning path')]");
		By Lifetimeaccess=By.xpath("//a[contains(text(),'Lifetime access')]");
		By Articles=By.xpath("//a[contains(text(),'Articles')]");
		By About=By.linkText("About ");
		
		
	
	
	public rsNavigateMenus(WebDriver driver) {
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
	
	public WebElement getMentorship()
	{
		return driver.findElement(Mentorship);
	}
	
	public WebElement getPracticeProjects()
	{
		return driver.findElement(PracticeProjects);
	}
	
	public WebElement getConsulting()
	{
		return driver.findElement(Consulting);
	}
	
	public WebElement getLearningpath()
	{
		return driver.findElement(Learningpath);
	}
	
	public WebElement getLifetimeaccess()
	{
		return driver.findElement(Lifetimeaccess);
	}
	
	public WebElement getArticles()
	{
		return driver.findElement(Articles);
	}
	
	public WebElement getAbout()
	{
		return driver.findElement(About);
	}

}
