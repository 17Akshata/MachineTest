package com.GetCalley.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public 	static WebDriver driver;
	public	static Properties prop;
	public TestBase() throws IOException
	{
		
		try {
			prop=new Properties();
			//FileInputStream fis=new FileInputStream("C:\\Users\\aksha\\OneDrive\\Desktop\\GetCalley\\GetCalley\\src\\main\\java\\com\\GetCalley\\config\\configuration.properties");
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\Files\\configuration.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void initiatlization()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(options);


		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		driver.get(prop.getProperty("Url"));

	}

}
