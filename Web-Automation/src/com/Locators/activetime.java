package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class activetime {
	
	public static ChromeDriver oBrowser=null;
	
	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		loginpage();
		logout();
		quite();
	}
	public static void launchBrowser()
	{
			System.setProperty("webdriver.chrome.driver", "C:\\JavaProgrmas\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
	}
	public static void navigate()
	{
		try 
		{
			oBrowser.get("http://localhost:89/login.do");
			Thread.sleep(500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void loginpage()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
		
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logout()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void quite()
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