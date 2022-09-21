package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amezon {
	
		public static ChromeDriver oBrowser=null;
	public static void main(String[] args) {
		launch();
		navigate();
		dahboard();
		quit();
	}
	public static void launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\JavaProgrmas\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
	}
	public static void navigate()
	{
		try
		{
			oBrowser.get("https://www.amazon.in/");
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void dahboard()
	{
		try
		{
			oBrowser.findElement(By.id("twotabsearchtextbox")).sendKeys("camera");
			Thread.sleep(2000);
			
			oBrowser.findElement(By.id("nav-search-submit-button")).click();
			
			oBrowser.findElement(By.id("nav-logo-sprites")).click();
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
