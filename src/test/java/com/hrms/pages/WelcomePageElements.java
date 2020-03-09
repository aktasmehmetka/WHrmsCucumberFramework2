package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrms.utils.CommonMethods;

public class WelcomePageElements extends CommonMethods{

	@FindBy(xpath="//a[text()='Welcome Admin']")
	public WebElement welcome;
	
	@FindBy(xpath="//div[@id='welcome-menu']/ul")
	public List<WebElement> wlmenu;
	
	@FindBy(xpath="//div[@id='welcome-menu']/ul/li[3]")
	public WebElement logout;
	
	@FindBy(xpath="//div[@id='branding']/a/img")
	public WebElement logo;
	
	
}
