package TestCases01_50;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myAccountRegistrationTask04 {

	WebDriver driver;
	
	@Before
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		
	}
	@Test
	/*
	1) Open the browser
	2) Enter the URL “http://practice.automationtesting.in/”
	3) Click on My Account Menu
	
	4) Enter valid Email Address in Email-Address textbox
	5) Enter empty password in password textbox
	6) Click on Register button
	7) Registration must fail with a warning message(ie please enter an account password)
	*/
	public void emptyEmail() {
		
		//My Account
		driver.findElement(By.id("menu-item-50")).click();
		//Register - email
		driver.findElement(By.id("reg_email")).sendKeys("anthony@gmil.com");
		//Register - password
		driver.findElement(By.id("reg_password")).sendKeys("         ");
		//Register 
		driver.findElement(By.name("register")).click();
		
	}

}
