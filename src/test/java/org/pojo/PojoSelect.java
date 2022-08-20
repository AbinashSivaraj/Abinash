package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.UtilityClass;

public class PojoSelect extends UtilityClass{
	
	public PojoSelect() {
	
		PageFactory.initElements(driver, this);
		
		}
	
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement radio;
	
	@FindBy(xpath="//input[@name='continue']")
	private WebElement cont;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getCont() {
		return cont;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


