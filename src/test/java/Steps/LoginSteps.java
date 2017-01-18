package Steps;

import Pageobject.HomePage;
import Pageobject.SignInPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps  extends DriverFactory{
	
	@Given("^the user is on Home page$")
	public void the_user_is_on_Home_page() throws Throwable {
	  	driver.get("https://www.amazon.com/");
	  	Thread.sleep(3000);
		driver.manage().window().maximize();
	   
	}

	@When("^she clicks sign in button$")
	public void she_clicks_sign_in_button() throws Throwable {
		Thread.sleep(3000);
	   new HomePage(driver).she_clicks_sign_in_button();
	   
	}

	@Then("^she is navigated to sign in page$")
	public void she_is_navigated_to_sign_in_page() throws Throwable {
		Thread.sleep(3000);
		new SignInPage(driver).she_is_navigated_to_sign_in_page();
	    
	}

	@Then("^she provides her email as ([^\"]*)$")
	public void she_provides_her_email_as_samir_keskar_hotmail_com(String email) throws Throwable {
	    new SignInPage(driver).she_provides_her_email_as_samir_keskar_hotmail_com(email);
	}
	
	@Then("^she provides her password as ([^\"]*)$")
	public void she_provides_her_password_as_decision(String password) throws Throwable {
	    new SignInPage(driver).she_provides_her_password_as_decision(password);
	}

	@Then("^she clicks Sign in button$")
	public void she_clicks_Sign_in_button() throws Throwable {
	    new SignInPage(driver).she_clicks_Sign_in_button();
	}

	@Then("^she should be login to the application$")
	public void she_should_be_login_to_the_application() throws Throwable {
		Thread.sleep(3000);
		new HomePage(driver).she_should_be_login_to_the_application();
	}



	
}
