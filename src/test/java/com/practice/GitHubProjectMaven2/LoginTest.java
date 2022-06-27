package com.practice.GitHubProjectMaven2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	public static WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Seleniun_web_drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	}
	@Test
	public void doLogin() throws InterruptedException
	{
	System.out.println("Executing Login Test");
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	System.out.println("ënteting username");
	
	driver.findElement(By.name("email")).sendKeys("vwaghere04@gmail.com");
	
	System.out.println("entering passward");
	driver.findElement(By.name("pass")).sendKeys("abcd");
	
	System.out.println("clicking to login button");
	driver.findElement(By.name("login")).click();	
	
	
	}
	@AfterTest
	public void QuitDriver()
	{
	if (driver!=null)
	driver.close();
	}



}
