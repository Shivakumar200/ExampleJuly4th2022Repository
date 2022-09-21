package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class idcocatrs 
{	
	public static ChromeDriver oBrowser=null;
	
	public static void main(String[] args) {
		
		 launchBrowser();
		 navigate();
		 logpage();
		 closeapp();		
	}
	private static void launchBrowser()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\JavaProgrmas\\Web-Automation\\Library\\drivers\\chromedriver.exe"); 
		oBrowser=new ChromeDriver();
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:89/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logpage()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			//This is also write ---- search.sendKeys("admin");
			//oBrowser.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("admin");
			Thread.sleep(500);
			
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(500);
			
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(500);    
			
			oBrowser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']/div[1]")).click();
			Thread.sleep(500);
			
			oBrowser.findElement(By.id("sortByCustomerNameLink")).click();
			}catch(Exception e)
		
		{
			e.printStackTrace();
		}
		}
	private static void closeapp()
	{
		try
		{
			oBrowser.quit();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}