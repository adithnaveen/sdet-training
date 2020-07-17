package com.sdet.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02Login {
	public static void main(String[] args) {
		WebDriver driver; 
		
		System.setProperty("webdriver.chrome.driver", 
			"C:\\OnlineTraining\\SDET May 2018\\drivers\\chromedriver.exe"); 
		
		driver = new ChromeDriver(); 
		
		String url = "http://naveenks.com/web/LoginForm.html"; 
		driver.get(url);
		
		driver.findElement(By.id("uname")).clear(); 
		driver.findElement(By.id("uname")).sendKeys("sample@example.com");
		
		
		driver.findElement(By.id("pwd")).clear(); 
		driver.findElement(By.id("pwd")).sendKeys("secret!234"); 
		
		driver.findElement(By.id("submitBtn")).click(); 
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.quit(); 
		
		
		
		
		
		
	}
}
