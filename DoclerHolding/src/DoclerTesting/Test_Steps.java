package DoclerTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 

public class Test1_Steps {
	public static WebDriver driver;
	@Given ("Application is opened$")
	public void application_is_opened() throws Throwable {
		driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://uitest.duodecadits.com/");
	}
	
	@When ("User Navigate to Home Page$") 
	public void user_navigate_to_home_page() throws Throwable {
		driver.clickButton("home");
	}
	
	@When ("User Navigate to Form Page$") 
	public void user_navigate_to_form_page() throws Throwable {
		driver.clickButton("form");	
	}
	
	@When ("User Navigate to UITesting Page$") 
	public void user_navigate_to_uitesting_page() throws Throwable {
		driver.clickButton("site");	
	}
	
	@Then ("Title displayed UI Testing Site$") 
	public void title_displayed_UI_Testing_Site() throws Throwable {

		List<WebElement> titles = driver.findElements(By.className("nav navbar-nav"));
		for ( WebElement title : titles) {
			if (title.getText() = "UI Testing Site") System.out.println ("Title is correct");
		}
		}	
}

