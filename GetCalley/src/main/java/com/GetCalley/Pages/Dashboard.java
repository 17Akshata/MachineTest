package com.GetCalley.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GetCalley.Base.TestBase;

public class Dashboard extends TestBase{

	
	@FindBy(xpath="(//span[text()='Call List'])[2]")
	WebElement callList;
	
	@FindBy(xpath="(//span[text()='Add - Standard Import'])[2]")
	WebElement addStandImp;
	
	public Dashboard() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public void performAction()
	{
		callList.click();
		addStandImp.click();
	}
}
