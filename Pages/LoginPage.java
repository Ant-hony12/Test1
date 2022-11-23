package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;
import Utilities.PropertiesFiles;

public class LoginPage {

	public LoginPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
		
	}

	
	@FindBy(xpath = "//*[@name='username']")
	public WebElement usernameInputField;
	
	@FindBy(xpath = "//*[@name='password']")
	public WebElement passwordInputField;
	
	@FindBy(xpath = "//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	public WebElement loginButton;
	
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	public WebElement invalidCredentialsText;
	
	@FindBy(xpath="(//*[@class='oxd-input-group oxd-input-field-bottom-space']//span[1])[1]")
	public WebElement userRequiredText;
	
	@FindBy(xpath="(//*[@class='oxd-input-group oxd-input-field-bottom-space']//span[1])[2]")
	public WebElement passwordRequiredText;
	
	@FindBy(xpath="//*[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	public WebElement forgotYourPasswordLink;
	
	
	//passwordPage
	
	@FindBy(name="username")
	public WebElement resetPasswordUsernameField;
	
	
	@FindBy(xpath="//*[@class='oxd-button oxd-button--large oxd-button--secondary orangehrm-forgot-password-button orangehrm-forgot-password-button--reset']")
	public WebElement resetPasswordButton;
	
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
	public WebElement resetPasswordWindowText1;
		
	
	public void loginOrangeHrm(String username, String password) {
		        usernameInputField.sendKeys(username);
		        passwordInputField.sendKeys(password);
		        loginButton.click();
		    }
		
	}



	
	



