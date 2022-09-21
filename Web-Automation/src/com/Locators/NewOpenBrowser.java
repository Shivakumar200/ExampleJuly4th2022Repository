package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewOpenBrowser {
	
	
	public static ChromeDriver oBrowser=null;

	public static void main(String[] args) {
		
		launch();
		navigate();
		Open();
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
				oBrowser.get("https://www.google.com/");
				oBrowser.manage().window().maximize();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public static void Open()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'gb\']/div/div[1]/div/div[1]/a")).click();
				
				oBrowser.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
				
				oBrowser.findElement(By.id("identifierId")).sendKeys("shivakumardoddappa39@gmail.com");
				
				oBrowser.findElement(By.xpath("//*[@id=\'identifierNext\']/div/button/span")).click();
				
				oBrowser.quit();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
}
