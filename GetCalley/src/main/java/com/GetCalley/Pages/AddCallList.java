package com.GetCalley.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GetCalley.Base.TestBase;

public class AddCallList extends TestBase{

	public AddCallList() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="ContentPlaceHolder1_listname")
	WebElement listname;
	
	@FindBy(id="ContentPlaceHolder1_bnt_submit")
	WebElement proceddtolocadClick;
	
	
	public void addcallList(String calllist)
	{
		listname.sendKeys(calllist);
		proceddtolocadClick.click();
		
	}
}
