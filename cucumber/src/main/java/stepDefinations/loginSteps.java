package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;

public class loginSteps {
	static WebDriver driver;
  @Given("^User is on Login Page$")
  public void given() throws Throwable {
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	
  }

  @When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
  public void user_enters_and(String Username, String Password)throws Throwable {
	  System.out.println(Password);
	  System.out.println(Username);
  }

  @And("^User click on signin Button$")
  public void and() throws Throwable {
	  System.out.println("login2");
  }

  @Then("^Message displayed Login Successfully$")
  public void but() throws Throwable {
	  System.out.println("login3");
  }
@Before
public void beforeclass() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kitc20002\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
}
@After
public void Afterclass() throws Throwable {
	  System.out.println("After");
}
  
}
