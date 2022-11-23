package TesCases;

import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pages.AdminPage;
import Pages.CommonPage;
import Pages.LoginPage;
import Utilities.BaseClass;
import Utilities.PropertiesFiles;

public class NationalitiesTest {
	
	LoginPage lp = new LoginPage();
	CommonPage cp = new CommonPage();
	AdminPage ap = new AdminPage();
	
	@Before
	public void beforeTest() {
		
		BaseClass.getDriver();
	}
	
	@Test
    public void AddingDuplicateNationalitiesAlreadyExists() {
		lp.loginOrangeHrm(PropertiesFiles.getProperty("usernameHRM"), PropertiesFiles.getProperty("passwordHRM"));
        cp.clickOnMenuOneMenuOption(PropertiesFiles.getProperty("admin"));
        ap.clickOnAdminOption(PropertiesFiles.getProperty("nationalities"));
        ap.addButton.click();
        ap.addNationalityInputField.sendKeys(PropertiesFiles.getProperty("nation"));
        ap.saveButton.click();
        Assert.assertEquals(ap.alreadyExistText.getText(), PropertiesFiles.getProperty("expectedAlreadyExistsText"));
    }
	

}


