package TestCases01_50;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myAccountLoginTask01 {
	
	WebDriver driver;
	
	@Before
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@After
	public void closeBrowser() {
		if(driver != null){
			driver.quit();
			driver=null;
		}		
	}
	@Test
	/*
	1) Open the browser
	2) Enter the URL “http://practice.automationtesting.in/”
	3) Click on My Account Menu
	4) Enter registered username in username textbox
	5) Enter password in password textbox
	6) Click on login button
	7) User must successfully login to the web page
	*/
	public void login() {
		
		//My Account
		driver.findElement(By.id("menu-item-50")).click();
		//Username
		driver.findElement(By.id("username")).sendKeys("agj.15191@gmail.com");
		//Password
		driver.findElement(By.id("password")).sendKeys("Lincoln15191..!");
		//login
		driver.findElement(By.name("login")).click();
		//logout if login was successful
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/nav/ul/li[6]/a")).click();

		
	}

}
