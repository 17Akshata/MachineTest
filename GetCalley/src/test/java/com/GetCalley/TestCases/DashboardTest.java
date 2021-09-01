package com.GetCalley.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.GetCalley.Pages.Dashboard;

public class DashboardTest {

	@Test
	public void dashboardOpen() throws IOException {
		Dashboard dash=new Dashboard();
		dash.performAction();
		
	}
}
