package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Stepdefinition {
WebDriver driver;
	@Given("User must be on homepage by clicking on url {string}")
	public void user_must_be_on_homepage_by_clicking_on_url(String string) {
	   System.setProperty("webdrive.chrome.driver","chromedriver.exe" );
	   driver=new ChromeDriver();
	   driver.get(string);
	}

	@When("user clicks on signup button")
	public void user_clicks_on_signup_button() {
	   driver.findElement(By.id("signin2")).click();
	}

	@Then("Signup dialogue box should be displayed")
	public void signup_dialogue_box_should_be_displayed() {
	boolean actual=  driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-header")).isDisplayed();
	Assert.assertEquals(true, actual);
	
	}
	
}
