package November1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




public class testingAlertBoxes {
	
	WebDriver driver;

	@Before
	public void BeforeTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		
	}
	@Test 
	public void alert1() {
		
		driver.findElement(By.id("alertexamples")).click();
		String alertText = driver.switchTo().alert().getText();
		Assert.assertEquals("I am an alert box", alertText);
		driver.switchTo().alert().accept();
	
	
	

	
		
		
	}
    @Test
    public void alert2() {
        driver.findElement(By.id("confirmexample")).click();
        
        String text = driver.switchTo().alert().getText();
        Assert.assertEquals("I am a confirm alert", text);
        
        driver.switchTo().alert().accept();
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'true') and@id='cofirmreturn']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(), 'You clicked OK, confirm returned') and @id='confirmexplanation']")).isDisplayed());
        
    }

    @Test
    public void alert3() {
        String messageToBesentToAlertBox = "Hello World";

        //clicking on alert button
        driver.findElement(By.id("promptexample")).click();

        //get alert text and assert it 
        String text = driver.switchTo().alert().getText();
        Assert.assertEquals("I prompt you", text);

        driver.switchTo().alert().sendKeys("Hello World");
        driver.switchTo().alert().accept();

        Assert.assertEquals(messageToBesentToAlertBox, driver.findElement(By.xpath("//*[contains(text(),'"+messageToBesentToAlertBox+"') and @id='promtretru")));
    }
    
    @After
	public void tearDown() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
		
	}
}
	

	