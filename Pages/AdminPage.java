package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class AdminPage {
	public AdminPage() {    
        PageFactory.initElements(BaseClass.getDriver(), this);
    }
    
    
    
    @FindBy(xpath="//nav[@aria-label='Topbar Menu']/ul/li/a")
    public List<WebElement> AdminTopMenuBar;
    
    
    @FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    public WebElement addButton;
    
    
    @FindBy(xpath="//div[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/input")
    public WebElement addNationalityInputField;
    
    
    @FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    public WebElement saveButton;
    
    
    @FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    public WebElement alreadyExistText;
    
    
    public void clickOnAdminOption(String menuOption) {
        for (WebElement eachItem : AdminTopMenuBar) {
            if (eachItem.getText().equalsIgnoreCase(menuOption)) {
                eachItem.click();
                break;
            }
        }
    }
    
}