package TestCases01_50;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myAccountLoginTask06 {
	
	WebDriver driver;
	
	@Before
	public void opneBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	/*
	1) Open the browser
	2) Enter the URL “http://practice.automationtesting.in/”
	3) Click on My Account Menu
	
	4) Enter the password field with some characters.
	5) The password field should display the characters in asterisks
	 or bullets such that the password is not visible on the screen
	 */
	public void task() {
		//My Account
		driver.findElement(By.id("menu-item-50")).click();
		//PasswordEmpty
		driver.findElement(By.id("reg_password")).sendKeys("Char");
		
	}

}
