package com.GetCalley.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.GetCalley.Base.TestBase;
import com.GetCalley.Pages.UploadCSV;

public class UploadCSVTest extends TestBase{

	public UploadCSVTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void uploadFile() throws IOException, InterruptedException
	{
		UploadCSV csv=new UploadCSV();
		csv.UploadFile(prop.getProperty("filepath"));
				
	}
	
}
