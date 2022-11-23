package TestCases01_50;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class homePageTask01 {

	WebDriver driver;

	@Before
	public void BeforeTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//	}
//	
//	@After
//	public void tearDown() {
//		if(driver != null) {
//			driver.quit();
//			driver = null; 
//		}
	}

	@Test
	/*
	1) Open the browser
	2) Enter the URL “http://practice.automationtesting.in/”
	3) Click on Shop Menu
	4) Now click on Home menu button
	5) Test whether the Home page has Three Sliders only
	6) The Home page must contains only three sliders
	*/
	public void SearchSong() {

		List<WebElement> tapSelector = driver.findElements(By.xpath("//*[@id='main-nav']/li/a"));

		for (WebElement tap : tapSelector) {
			if (tap.getText().equalsIgnoreCase("Shop")) {
				tap.click();
				break;
			}
		}

		WebElement homePage = driver.findElement(By.id("site-logo"));

		homePage.click();

		List<WebElement> threeSlider = driver.findElements(By.xpath("//*[@id='n2-ss-6']/div/div/div/div"));

		int expectSize = 3;

		 Assert.assertEquals(threeSlider.size(), expectSize);

	}

	//side 1
	//*[@id="n2-ss-6"]/div[1]/div/div/div[1]/div[1]/img
	//slide 2
	//*[@id="n2-ss-6"]/div[1]/div/div/div[2]/div[1]/img
	//slide 3
	//*[@id="n2-ss-6"]/div[1]/div/div/div[3]/div[1]/img


}
