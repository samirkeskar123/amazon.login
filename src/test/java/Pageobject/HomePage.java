package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePage {

	WebDriver driver;
	
	//Page Factory
	
	
	@FindBy(id = "nav-link-accountList") 
	 private WebElement SigninButton;
	
	
	//creating a constructor for Homepage
	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		

	@When("^she clicks sign in button$")
	public void she_clicks_sign_in_button() throws Throwable {
		SigninButton.click();

	}
	

	@Then("^she should be login to the application$")
	public void she_should_be_login_to_the_application() throws Throwable {
		     String text = SigninButton.getText();
		     System.out.println(text);
	}
}
