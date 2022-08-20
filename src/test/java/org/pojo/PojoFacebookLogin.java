package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.UtilityClass;

public class PojoFacebookLogin extends UtilityClass{
	
	public PojoFacebookLogin() {
		
		PageFactory.initElements(driver, this);
		}

	@FindBy(xpath="//input[@id='email']")
	private WebElement user;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbtn;

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public void setLoginbtn(WebElement loginbtn) {
		this.loginbtn = loginbtn;
	}

	public void setUser(WebElement user) {
		this.user = user;
	}

	public void setPass(WebElement pass) {
		this.pass = pass;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}
	
	
	

}
