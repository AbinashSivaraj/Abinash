package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.UtilityClass;

public class PojoBook extends UtilityClass {
	
	public PojoBook() {
	
		PageFactory.initElements(driver, this);
		}

	@FindBy(xpath="//input[@id='first_name']")
	private WebElement first;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement last;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement add;

	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement cc;
	
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement cctype;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement month;
	
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement year;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvv;
	
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement book;

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCc() {
		return cc;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}
	
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


