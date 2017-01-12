package DoclerTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 

public class Test12_Steps {
	public static WebDriver driver;
	@Given ("Application is opened$")
	public void application_is_opened() throws Throwable {
		driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://uitest.duodecadits.com/");
	}
	
	@When ("User Navigate to Form Page$") 
	public void user_navigate_to_form_page() throws Throwable {
		driver.clickButton("form");	
	}
	
	@And ("Input name is Madalin$") 
	public void input_name_is_madalin() throws Throwable {
		WebElement inputField = driver.findElement(By.id("hello-input"));
		inputField.sendKeys("Madalin");
	}
	
	@And ("Go! button is pressed$") 
	public void go!_button_is_pressed() throws Throwable {
		driver.clickButton("hello-submit");
	}
	
	@Then ("Text displayed Hello Madalin$") 
	public void text_displayed_hello_madalin() throws Throwable {
		WebElement formSubmit = driver.findElement(By.id("hello-text"));
		if (formSubmit.getText() = "Hello Madalin!")
			System.out.println("BINGO!");
		}	
}

