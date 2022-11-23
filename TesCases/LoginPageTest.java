package TesCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.CommonPage;
import Pages.DashboardPage;
import Pages.LoginPage;
import Utilities.BaseClass;
import Utilities.PropertiesFiles;

public class LoginPageTest {
	
	LoginPage lp = new LoginPage();
	DashboardPage dp = new DashboardPage();
	CommonPage cp = new CommonPage();
	
	@BeforeClass
	public void beforeTest() {
		BaseClass.getDriver();
	}

	@Test(priority=1)
	public void loginWithValidUsernameValidPassword() {
		
//	Driver.getDriver().findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("Admin");
//	Driver.getDriver().findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("admin123");
//	Driver.getDriver().findElement(By.xpath("//*[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
	
		lp.usernameInputField.sendKeys(PropertiesFiles.getProperty("usernameHRM"));
		lp.passwordInputField.sendKeys(PropertiesFiles.getProperty("passwordHRM"));
		lp.loginButton.click();
		
		Assert.assertEquals(dp.dashboardText.getText(), PropertiesFiles.getProperty("expectedDashboardText"));
		cp.userDropDownArrow.click();
		cp.choosingMenuItem(PropertiesFiles.getProperty("LogoutText"));
		
		
	}
	
	
	@Test(priority=3)
	public void loginWithValidUsernameInvalidPassword() {
		lp.usernameInputField.sendKeys(PropertiesFiles.getProperty("usernameHRM"));
		lp.passwordInputField.sendKeys(PropertiesFiles.getProperty("invalidPasswordHRM"));
		lp.loginButton.click();
		Assert.assertEquals(lp.invalidCredentialsText.getText(), PropertiesFiles.getProperty("invalidCredentialsText"));
		
		
	}
	
	@Test(priority=2)
	public void loginWithemptyUsernameEmptyPassword() {
		lp.loginButton.click();
		Assert.assertEquals(lp.userRequiredText.getText(), PropertiesFiles.getProperty("requiredText"));
		Assert.assertEquals(lp.passwordRequiredText.getText(), PropertiesFiles.getProperty("requiredText"));
	}
	
	
	@Test(priority=4)
	public void forgotPasswordLinkFunction() {
		
		lp.forgotYourPasswordLink.click();
		lp.resetPasswordUsernameField.sendKeys(PropertiesFiles.getProperty("usernameHRM"));
		lp.resetPasswordButton.click();
		Assert.assertEquals(lp.resetPasswordWindowText1.getText(), PropertiesFiles.getProperty("forgotPasswordText1"));
		
	}
	
	
	

}


