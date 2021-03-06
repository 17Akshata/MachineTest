package com.GetCalley.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GetCalley.Base.TestBase;

public class SignUp extends TestBase {

	public SignUp() throws IOException {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="txtName")
	WebElement name;
	
	@FindBy(id="txtEmail")
	WebElement email;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="txt_mobile")
	WebElement mobileNo;
	
	@FindBy(id="inputcaptcha")
	WebElement captcha;
	
	@FindBy(id="checkbox-signup")
	WebElement checkbox;
	
	@FindBy(id="btnSignUp")
	WebElement signupButton;
	
public void UserSignUp(String username,String emailid,String pass,String mobileNum) throws InterruptedException
{
	
	name.sendKeys(username);
	email.sendKeys(emailid);
	password.sendKeys(pass);
	mobileNo.sendKeys(String.valueOf(mobileNum));
	Thread.sleep(10000);
	checkbox.click();
	signupButton.click();
	
}
	
}
