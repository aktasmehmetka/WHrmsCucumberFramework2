package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrms.utils.CommonMethods;

public class AddEmployePageElements extends CommonMethods{

	@FindBy(id="menu_pim_viewPimModule")
	public WebElement pim;
	
	@FindBy(id="menu_pim_addEmployee")
	public WebElement addEmpl;
	
	@FindBy(id="firstName")
	public WebElement firstName;
	
	@FindBy(id="middleName")
	public WebElement middleName;
	
	@FindBy(id="lastName")
	public WebElement lastName;
	
	@FindBy(id="employeeId")
	public WebElement employeeId;
	
	@FindBy(id="chkLogin")
	public WebElement chkLogin;
	
	@FindBy(id="user_name")
	public WebElement user_name;
	
	@FindBy(id="user_password")
	public WebElement user_password;
	
	@FindBy(id="re_password")
	public WebElement re_password;
	
	@FindBy(xpath="//div[@id='profile-pic']/h1")
	public WebElement pDetails;
	
	@FindBy(id="btnSave")
	public WebElement btnSave;
}
