package com.GetCalley.Pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.GetCalley.Base.TestBase;

public class UploadCSV extends TestBase{

	public UploadCSV() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Add Numbers in Bulk']")
	WebElement bulkbutton;
	
	@FindBy(id="ContentPlaceHolder1_fileUpload")
	WebElement choosefile;
	
	@FindBy(id="btn_automation")
	WebElement buttonsubmit;
	
	@FindBy(xpath="//*[text()='Ok' and @class='confirm']")
	WebElement okbtn;
	
	@FindBy(xpath="(//button[text()='OK'])[1]")
	WebElement okbtnConfim;
	
	public void UploadFile(String filepath) throws InterruptedException
	{
		bulkbutton.click();
		choosefile.sendKeys(filepath);
		buttonsubmit.click();
		Thread.sleep(3000);
		okbtn.click();
		okbtnConfim.click();
	}
}
