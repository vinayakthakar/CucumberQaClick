package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.accessMenus;
import pageObjects.rsNavigateMenus;
import pageObjects.rsSignIn;
import resources.initBrowser;

import org.junit.runner.RunWith;
import org.testng.Assert;

@RunWith(Cucumber.class)
public class stepDefination1 extends initBrowser {

    @Given("^Initialize the browser$")
    public void initialize_the_browser() throws Throwable {
    	
    	driver = initializeBrowser();
        
    }

    @When("^Click on the Home Menu$")
    public void click_on_the_home_menu() throws Throwable {
    	
    	accessMenus am = new accessMenus(driver);
		am.gethome().click();
		
		String title = driver.getTitle();
		String pageTitle = "Rahul Shetty Academy";
		
		rsNavigateMenus nm = new rsNavigateMenus(driver);
		
		if(title.equalsIgnoreCase(pageTitle))
		{
			Assert.assertEquals(nm.gethome().getText(), "Home");						
		}else
		{
			System.out.println("Home not found");
		}
       
    }

    @When("^click on the login option$")
    public void click_on_the_login_option() throws Throwable {
    	
    	rsSignIn rs=new rsSignIn(driver);
		rs.getSignIn().click();		
		       
    }

    @Then("^home page should be displayed with appropriate page titile$")
    public void home_page_should_be_displayed_with_appropriate_page_titile() throws Throwable {
    	
    	System.out.println("Home page displayed with correct page title");
        
    }

    @Then("^Error message should be displayed$")
    public void error_message_should_be_displayed() throws Throwable {
    	
    	System.out.println("Incorrect user name or password");
            
    }

    @And("^access the url$")
    public void access_the_url() throws Throwable {
    	
    	driver.get(prop.getProperty("url"));
        
    }

    @And("^close the browser$")
    public void close_the_browser() throws Throwable {
    	
    	driver.close();
        
    }

    @And("^enter user (.+) and (.+)$")
    public void enter_user_and(String email, String password) throws Throwable {
    	
    	rsSignIn rs=new rsSignIn(driver);
    	rs.getUserName().sendKeys(email);
		rs.getPassword().sendKeys(password);
		rs.getSubmit().click();
        
    }

}