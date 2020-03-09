package com.hrms.steps;

import org.junit.Assert;

import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps extends CommonMethods{

	LoginPageElements login=new LoginPageElements();
	
	@Given("I open bowser and navigated to the HRMS")
	public void i_open_bowser_and_navigated_to_the_HRMS() {		
	}

	@When("I enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password() {
//	 sendText(login.username, "Admin");
//	 sendText(login.password, "Syntax@123");
	 login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
	   click(login.loginBtn);
	}

	@Then("I successfully logged in")
	public void i_successfully_logged_in() {
	  System.out.println("I am successfulle logged in");
	}

	@Then("I close browser")
	public void i_close_browser() {	   
	}
	
	@When("I see syntax logo")
	public void i_see_syntax_logo() {
		boolean logo=login.logo.isDisplayed();
		System.out.println(logo);
	}

	@When("I enter invalid username valid passowrd")
	public void i_enter_invalid_username_valid_passowrd() {
		sendText(login.username, "Ali");
		sendText(login.password, "Syntax@123");
	}

	@Then("I see error message")
	public void i_see_error_message() {
		String actual=login.spanMessage.getText();
		String expected="Invalid credentials";
		Assert.assertEquals(expected, actual);
	}

}
