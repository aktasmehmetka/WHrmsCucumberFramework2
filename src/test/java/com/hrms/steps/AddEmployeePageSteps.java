package com.hrms.steps;

import org.junit.Assert;

import com.hrms.pages.AddEmployePageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmployeePageSteps extends CommonMethods{

	AddEmployePageElements addEmp=new AddEmployePageElements();
	
	@Given("I am logged into HRMS")
	public void i_am_logged_into_HRMS() {
		LoginPageElements login=new LoginPageElements();
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	}

	@Given("I navigated to Add Employee Page")
	public void i_navigated_to_Add_Employee_Page() throws InterruptedException {
		click(addEmp.pim);
		Thread.sleep(2000);
		click(addEmp.addEmpl);
		
	}

	@When("I add {string}, {string} and {string}")
	public void i_add_and(String string, String string2, String string3) {
		sendText(addEmp.firstName, string);
		sendText(addEmp.middleName, string2);
		sendText(addEmp.lastName, string3);	
	}

	@When("I click Save")
	public void i_click_Save() {
		click(addEmp.btnSave);
	}

	@Then("I see Employee with {string}, {string} and {string} is displayed")
	public void i_see_Employee_with_and_is_displayed(String string, String string2, String string3) {
		
		String actual=addEmp.pDetails.getText();
		String expected=string+" "+string2+" "+string3;
		
		Assert.assertEquals(expected, actual);
	}

}
