package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmaillogin {
	
	public static ChromeDriver oBrowser=null;
	public static ActiTimePage oPage=null;

	public static void main(String[] args) {
		
		launch();
		navigate();
		loginpage();
		quit();
	}
	private static void launch()
	{
		try
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\JavaProgrmas\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			
			oBrowser.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void loginpage()
	{
		try
		{
			oBrowser.findElement(By.id("identifierId")).sendKeys("shivakumardoddappa39@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'identifierNext\']/div/button/span")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void quit()
	{
		try
		{
			
			oBrowser.quit();	
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}