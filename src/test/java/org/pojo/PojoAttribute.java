package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.UtilityClass;

public class PojoAttribute extends UtilityClass{
	
	public PojoAttribute() {

	PageFactory.initElements(driver, this);
	
	}
	@FindBy(name="order_no")
	private WebElement order;
	public WebElement getOrder() {
		return order;
	}
	
	}


