package com.GetCalley.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.GetCalley.Pages.AddCallList;

public class AddCallListTest 
{

	@Test
	public void callListDisplay() throws IOException
	{
		AddCallList list=new AddCallList();
		list.addcallList("ak1y2");
	}
}
