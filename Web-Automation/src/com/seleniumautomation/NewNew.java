package com.seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewNew {
	
	public static ChromeDriver oBrowser=null;
	public static void main(String[] args) {
		launch();
		 Webpage();
		 username();
		 Pass();
	}
	public static void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\JavaProgrmas\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
	}
	public static void Webpage()
	{
		try
		{
			oBrowser.get("http://localhost:89/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void username()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void Pass()
	{
		try
		{
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("loginButton")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
		//	oBrowser.findElement(By.id("logoutLink")).click();
			//Thread.sleep(2000);
			//oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
