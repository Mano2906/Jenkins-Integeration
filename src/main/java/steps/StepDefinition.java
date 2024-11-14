package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
	
	@Given("user opens the browser and enters the URL")
	public void user_opens_the_browser_and_enters_the_url() {
			driver = new ChromeDriver();
			driver.get("https://en-gb.facebook.com/login/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("user enters invalid username and password")
	public void user_enters_invalid_username_and_password() {
	    driver.findElement(By.id("email")).sendKeys("testing123@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("test@123");
	}

	@When("click on login button")
	public void click_on_login_button() {
	    driver.findElement(By.id("loginbutton")).click();
	}

	@Then("proper error message should be displayed")
	public void proper_error_message_should_be_displayed() {
	    System.out.println("error message should be displayed : ");
//	    Assert.assertTrue(true);
	}

}