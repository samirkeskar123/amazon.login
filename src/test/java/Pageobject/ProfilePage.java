package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProfilePage {

	WebDriver driver;
	
	//Page Factory
	@FindBy(className = "welcome-msg")
	private WebElement yourprofile;
	
	@FindBy(linkText = "Hi, samir")
	private WebElement login;
	
	@FindBy(className= "welcome-msg")
	private WebElement welcomemsg;
	
	@FindBy(id = "nav-your-amazon")
	private WebElement myamazon;
	
	
	
	public ProfilePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@Given("^user is logged in$")
	public void user_is_logged_in() throws Throwable {
	  String namelogin= login.getText(); 
     System.out.println(namelogin);
	
	}

	
	@When("^user clicks user profile link$")
	public void user_clicks_user_profile_link() throws Throwable {
		myamazon.click();
		Thread.sleep(3000);
	}

	@Then("^user is navigated to user profile page$")
	public void user_is_navigated_to_user_profile_page() throws Throwable {
		Thread.sleep(3000);
		yourprofile.click();
		Thread.sleep(3000);
		String welcomename = welcomemsg.getText();
		System.out.println(welcomename);
		
	
	}


	
}
