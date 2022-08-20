package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.UtilityClass;

public class PojoSearch extends UtilityClass {

	public PojoSearch() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotel;
	
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement room;
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement roomno;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement datein;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement dateout;

	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adult;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement child;
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement submit;
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return submit;
	}
	







}





