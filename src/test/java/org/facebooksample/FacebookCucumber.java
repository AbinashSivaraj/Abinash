package org.facebooksample;

import org.pojo.PojoFacebookLogin;
import org.utility.UtilityClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookCucumber extends UtilityClass {
	
	PojoFacebookLogin l;
	
	
	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
		launchChrome();
	    
	}

	@When("To launch the facebook url")
	public void to_launch_the_facebook_url() {
		launchurl("https://www.facebook.com/");
	    
	}

	@When("To pass valide user name in email field")
	public void to_pass_valide_user_name_in_email_field() {
		l= new PojoFacebookLogin();
		passText("abc@gmail.com", l.getUser());
		
	    
	}

	@When("To pass invalide password in password field")
	public void to_pass_invalide_password_in_password_field() {
		l= new PojoFacebookLogin();
		passText("12345", l.getPass());
	   
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		l= new PojoFacebookLogin();
		clickWebEelment(l.getLoginbtn());
	    
	}

	@Then("To close or quit the browser")
	public void to_close_or_quit_the_browser() {
	    driver.close();
	}


}
