package stepDefinations;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.accessMenus;
import pageObjects.addToCart;
import pageObjects.rsNavigateMenus;
import resources.initBrowser;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;


@Parameters({"WebDriver driver", "String[] item"})
@RunWith(Cucumber.class)
public class stepDefination2 extends initBrowser{
	
	public static final String[] item = null;
	public static WebDriver driver;
	

	/*@Given("^Initialize the browser$")
    public void initialize_the_browser() throws Throwable {
		
		driver = initializeBrowser();
        
    }*/

	
	@When("^add the product in cart and place the order$")
	
    public void add_the_product_in_cart_and_place_the_order() throws Throwable, IOException, InterruptedException {
    	
		accessMenus am = new accessMenus(driver);
		am.gethome().click();
		
		rsNavigateMenus cr=new rsNavigateMenus(driver);
		cr.getPracticeProjects().click();
    	
  // driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();    
   
//	driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[2]/nav[1]/div[2]/ul[1]/li[4]/a[1]")).click();
				
		
		addToCart ac = new addToCart();
		ac.cartSelection(driver, item);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
        
    }

    @Then("^Order should be placed successfully$")
    public void order_should_be_placed_successfully() throws Throwable {
    	
    	System.out.println("Order successfully placed");
        
    }

 /*   @And("^access the url$")
    public void access_the_url() throws Throwable {
        
    	driver.get(prop.getProperty("url"));
    	
    }

    @And("^close the browser$")
    public void close_the_browser() throws Throwable {
    	
    	driver.close();
    }
   */     
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	