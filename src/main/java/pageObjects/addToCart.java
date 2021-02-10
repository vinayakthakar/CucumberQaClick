package pageObjects;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addToCart {

	public WebDriver driver;
	
	
	public void cartSelection(WebDriver driver, String[] item) throws InterruptedException
	{

	String pageTitle = driver.findElement(By.xpath("//h2[contains(text(),'Join now to Practice')]")).getText();
	
	if(pageTitle.equalsIgnoreCase("Join now to Practice"))
	{
		driver.findElement(By.id("name")).sendKeys("vinayak Thakar");
		driver.findElement(By.id("email")).sendKeys("vinayak.thakar@gmail.com");
		driver.findElement(By.id("form-submit")).click();
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Automation Practise - 1')]")).click();
		
	}
	else
	{
		driver.findElement(By.xpath("//a[contains(text(),'Automation Practise - 1')]")).click();
	}
	
	String [] items = {"Cucumber", "Mushroom", "Carrot", "Potato"};
	
	int j=0;
	
	List<WebElement> allProduct = driver.findElements(By.cssSelector("h4.product-name"));
	
	for(int i=0; i<allProduct.size(); i++)
	{
		String[] name = allProduct.get(i).getText().split("-");
		
		String trimedName = name[0].trim();
		
		List<String> itemsNeeded = Arrays.asList(items);
		
		if(itemsNeeded.contains(trimedName))
		{
			j++;
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		}
		
		if(j==items.length)
		{
			break;
		}
	}
	
	return;
}

	
}

