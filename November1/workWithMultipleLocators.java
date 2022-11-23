package November1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class workWithMultipleLocators {
	
	WebDriver driver;

	String userName = "Admin";
	String passWord = "admin123";

	@Before
	public void openBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void addingMissingNationality() throws InterruptedException {
		// entering username and password
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(passWord);
		// click Login button
		driver.findElement(
				By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
				.click();

		clickSideBarOption("Admin");
	      driver.findElement(By.xpath("//header[@class='oxd-topbar']//li[5]")).click(); 
	      
	      
		
	}
	
	
	
	public void clickSideBarOption(String option) {
		List<WebElement> sideBarMenu = driver
				.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li"));

		for (WebElement eachItemInAList : sideBarMenu) {
			

			if (eachItemInAList.getText().equalsIgnoreCase(option)) {
				eachItemInAList.click();
			}
		}
	}
	
	
	public void userAdminTopBarOption(String option) {
		
		
		List<WebElement> userAdminTopBarMenu = driver
				.findElements(By.xpath("//header[@class='oxd-topbar']//li"));

		for (WebElement eachItemInAList : userAdminTopBarMenu) {
			System.out.println(eachItemInAList.getText());

			if (eachItemInAList.getText().equalsIgnoreCase(option)) {
				eachItemInAList.click();
			break;
			}
		}
		
	}
	

}