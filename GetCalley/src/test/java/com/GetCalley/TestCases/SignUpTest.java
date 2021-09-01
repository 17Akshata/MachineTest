package com.GetCalley.TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.GetCalley.Base.TestBase;
import com.GetCalley.Pages.SignUp;

public class SignUpTest extends TestBase{
	
	public SignUpTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeTest
	public void OpenBrowser()
	{
		TestBase.initiatlization();
	}
	
	@Test
	public void signUpUser() throws IOException, InterruptedException
	
	{
		
		SignUp upS=new SignUp();
		upS.UserSignUp(prop.getProperty("name"),prop.getProperty("email"),prop.getProperty("Password"),prop.getProperty("Phoneno"));

	}

}