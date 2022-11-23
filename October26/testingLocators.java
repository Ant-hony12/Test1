package October26;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testingLocators {
	
	
	// class level variable 
	WebDriver driver;
	
	@Before //<----- Anotation - it will run this method *Before* a test method
	
	public void setUp() {
		
		WebDriverManager.chromedriver().setup(); //<------ Boni Garcia set up -- Chrome Browser
		
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/");
		driver.manage().window().maximize();
	}   
	
	@Test
	public void test1(){ 
		//Sign up
		driver.findElement(By.id("enterimg")).click();
		//First name
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Ant");
		//Last name
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Jimbo");
		//Address 
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("1234 Anthill Rd. FairJiz VA, 23333");
		//Email
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("AntHill@gmail.com");
		//Phone number
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("571-123-2345");
		//Gender
		driver.findElement(By.name("radiooptions")).click();
		//Hobbies
		driver.findElement(By.id("checkbox2")).click();
 	
		//Language

	
		
//		driver.findElement(By.id("msdd")).click();
//		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/label")).click();
		
		
		
		
		
		
		//Skills
		WebElement skills = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[1]"));
		Select sel = new Select(skills);
		sel.selectByVisibleText("Java");
		
		WebElement firstEle = sel.getFirstSelectedOption();
		System.out.println("First element ="+ firstEle.getText());
		
		List<WebElement> ListOptions = sel.getOptions();
		for(WebElement webElement : ListOptions) {
			System.out.println("options = "+webElement.getText());
		}
		
		WebElement county = driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[11]"));
		Select sele = new Select(county);
		sele.selectByVisibleText("United States of America");
		
		
		
		
	}  
	
	
	

}
