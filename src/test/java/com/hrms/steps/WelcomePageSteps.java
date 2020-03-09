package com.hrms.steps;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.hrms.pages.WelcomePageElements;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WelcomePageSteps extends CommonMethods {

	WelcomePageElements wl = new WelcomePageElements();


	@Given("I check logo is display")
	public void i_check_logo_is_display() {
		boolean logo = wl.logo.isDisplayed();
		System.out.println(logo);
	}

	@Given("I verify to the welcom is display")
	public void i_verify_to_the_welcom_is_display() {
		String welcome=wl.welcome.getText();
		System.out.println(welcome);
	}

	@Given("I click on welcom option")
	public void i_click_on_welcom_option() {
		jsClick(wl.welcome);
	}

	@When("I verify is display other options are clickeble")
	public void i_verify_is_display_other_options_are_clickeble() {
		List<WebElement> list=wl.wlmenu;
		for(WebElement element:list) {
			System.out.println(element.getText());
		}
	}

	@Then("I click on Logout")
	public void i_click_on_Logout() {
		click(wl.logout);
	}
}
