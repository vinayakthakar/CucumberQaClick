package pageObjects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class validatePracticeProject2 {

	public WebDriver driver;

	public WebDriver windowSwitch(WebDriver driver) throws InterruptedException

	{
		driver.findElement(By.id("openwindow")).click();

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		String parentWindowId = it.next();

		String childWindow = it.next();

		driver.switchTo().window(childWindow);

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(text(),'Courses')]")).click();

		driver.switchTo().window(parentWindowId);

		return driver;

	}

	public WebDriver tabSwitch(WebDriver driver) throws InterruptedException

	{
		driver.findElement(By.id("opentab")).click();

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		String parentWindowId = it.next();

		String childWindow = it.next();

		driver.switchTo().window(childWindow);

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(text(),'Courses')]")).click();

		driver.switchTo().window(parentWindowId);

		return driver;

	}

	public WebDriver validateAlertMessage(WebDriver driver)

	{

		String name = "Vinyak Thakar";
		String expectedAlertMessage = "Hello Vinyak Thakar, share this practice page and share your knowledge";

		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();

		String actualAlertMessage = driver.switchTo().alert().getText();

		if (actualAlertMessage.equalsIgnoreCase(expectedAlertMessage)) {
			System.out.println("Alert Message Correctly Displayed");
			driver.switchTo().alert().accept();
		}

		return driver;

	}

	public WebDriver validateConfirmMessage(WebDriver driver) throws InterruptedException {

		String name = "Vinyak Thakar";
		String expectedConfirmMessage = "Hello Vinyak Thakar, Are you sure you want to confirm?";

		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("confirmbtn")).click();

		String actualConfirmMessage = driver.switchTo().alert().getText();

		if (actualConfirmMessage.equalsIgnoreCase(expectedConfirmMessage)) {
			System.out.println("Confirmation Message Displayed correctly but Rejected");
			Thread.sleep(5000);
			driver.switchTo().alert().dismiss();

			System.out.println("Confirmation Cancelled");
		}

		return driver;

	}

	public WebDriver checkBox(WebDriver driver) throws InterruptedException {

		driver.findElement(By.id("checkBoxOption3")).click();

		return driver;

	}

	public WebDriver staticDropdown(WebDriver driver) throws InterruptedException {
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));

		s.selectByIndex(2);

		return driver;

	}

	public WebDriver suggestiveDropdown(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("autocomplete")).sendKeys("in");
		Thread.sleep(5000);

		List<WebElement> options = driver.findElements(By.cssSelector("li[class^='ui-menu-item']"));

		for (WebElement option : options) {

			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}

		}
		return driver;

	}

	public WebDriver selectRedioButton(WebDriver driver) {
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		return driver;

	}
	
	public WebDriver tableContents(WebDriver driver) throws FileNotFoundException
	{
		printStream();
		
		int totalPrice = 0, priceSum=0;
		
		WebElement table = driver.findElement(By.xpath("//table[@class='table-display']"));
		
		int rowCount = table.findElements(By.xpath("//*[@class='table-display']/tbody/tr")).size();
		
		//int columnCount = table.findElements(By.xpath("//*[@class='table-display']/tbody/tr/th")).size();
		
		for(int i=0; i<rowCount-1; i++)
		{
			String priceValue=table.findElements(By.xpath("//*[@class='table-display']/tbody/tr/td[3]")).get(i).getText();
			priceSum=Integer.parseInt(priceValue);
			totalPrice=totalPrice+priceSum;
			
			System.out.println(table.findElements(By.xpath("//*[@class='table-display']/tbody/tr")).get(i).getText());
					
		}
		System.out.println("Sum of all the values from Price coloumn = "+totalPrice);
		
		
		return driver;
	}
	
	public void printStream() throws FileNotFoundException
	{
		// Creating a File object that represents the disk file. 
        PrintStream o = new PrintStream(new File("PP2.txt")); 
  
        // clear the previously saved data of the file
        o.flush();
  
        // Assign o to output stream 
        System.setOut(o); 
	}
	
	public WebDriver elementDisplayed(WebDriver driver)
	{
		driver.findElement(By.id("displayed-text")).sendKeys("Fuga Tuga");
		
		driver.findElement(By.id("show-textbox")).click();
		
		if(driver.findElement(By.id("displayed-text")).isDisplayed())
				{
					System.out.println("Text Displayed correctly");
				}
		else
		{
			System.out.println("Text not displayed");
		}
		return driver;
		}
	
	public void tableFixedHeaders(WebDriver driver, String name) throws FileNotFoundException 
	{
		printStream();
		
		int totalAmount = 0, amountSum=0, expectedAmount=0;
		
		WebElement table = driver.findElement(By.xpath("//*[@class='tableFixHead']"));
		
		int rowCount = table.findElements(By.xpath("//*[@class='tableFixHead']/table/tbody/tr")).size();
		
		//int columnCount = table.findElements(By.xpath("//*[@class='tableFixHead']/tbody/tr/th")).size();
		
		for(int i=0; i<rowCount; i++)
		{
			String amountValue=table.findElements(By.xpath("//*[@class='tableFixHead']/table/tbody/tr/td[4]")).get(i).getText();
			amountSum=Integer.parseInt(amountValue);
			totalAmount=totalAmount+amountSum;
			
			System.out.println(table.findElements(By.xpath("//*[@class='tableFixHead']/table/tbody/tr")).get(i).getText());
					
		}
		System.out.println("Sum of all the values from Amount coloumn = "+totalAmount);
		String[] expectedValue = table.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(": ");
		
		String trimedName = expectedValue[1].trim();
		expectedAmount=Integer.parseInt(trimedName);
		System.out.println(" Total Amount Collected : " + trimedName);
		
		if(expectedAmount == totalAmount)
		{
			System.out.println("Sum of all the Amounts matches with collected amount");
		}
		else
		{
			System.out.println("Amount not matching");
		}
		
		return;
		
		
	}
	
	public void validateMouseAction(WebDriver driver)
	{
		Actions mouse=new Actions(driver);
		mouse.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
		
		mouse.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Top')]"))).click().build().perform();
		
		return;
	}
	
	public void validateFrameSwitch(WebDriver driver)
	{
		driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
		
		driver.switchTo().frame(0);	
		driver.findElement(By.xpath("/html/body/app-root/div/header/div[2]/div/div/div[2]/nav/div[2]/ul/li[7]/a")).click();
				
		return;
	}
}


