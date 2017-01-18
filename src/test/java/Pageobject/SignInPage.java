package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class SignInPage {

WebDriver driver;

//Page Factory
@FindBy(id = "ap_email")
private WebElement SignIn;

@FindBy(id = "ap_password")
private WebElement Password;

@FindBy(id = "signInSubmit") 
private WebElement Submit;




//Creating a Constructor for SignInPage
public SignInPage(WebDriver driver) {
	super();
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
	

@Then("^she is navigated to sign in page$")
public void she_is_navigated_to_sign_in_page() throws Throwable {
     SignIn.click();
}


@Then("^she provides her email as samir keskar hotmail com$")
public void she_provides_her_email_as_samir_keskar_hotmail_com(String email) throws Throwable {
    SignIn.sendKeys(email);
	
}

@Then("^she provides her password as decision$")
public void she_provides_her_password_as_decision(String password) throws Throwable {
   Password.sendKeys(password);
}

@Then("^she clicks Sign in button$")
public void she_clicks_Sign_in_button() throws Throwable {
   Submit.click();
}

}
