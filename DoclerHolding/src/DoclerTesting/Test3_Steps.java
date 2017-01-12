package DoclerTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 

public class Test11_Steps {
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
	
	@Then ("Text is displayed$") 
	public void text_is_displayed() throws Throwable {
		WebElement text = driver.findElement(By.className("lead"));	
		
		if(text.getText() = "This site is dedicated to perform some exercises and demonstrate automated web testing.")
		{
			System.out.println ("Text is present")
	    }
		else
		{
	    	System.out.println ("Text is not present")
	    }
	}

}

