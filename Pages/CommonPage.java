package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class CommonPage {
	
	public CommonPage() {
		
		        PageFactory.initElements(BaseClass.getDriver(), this);
		    }

		    @FindBy(xpath = "//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
		    public WebElement userDropDownArrow;

		    @FindBy(xpath = "//*[@class='oxd-dropdown-menu']/li/a")
		    public List<WebElement> dropDownMenu;

		    @FindBy(xpath = "//ul[@class='oxd-main-menu']/li/a")
		    public List<WebElement> mainMenu;

		    
		    
		    
		    
		    public void clickOnMenuOneMenuOption(String menuOption) {
		        for (WebElement eachItem : mainMenu) {
		            if (eachItem.getText().equalsIgnoreCase(menuOption)) {
		                eachItem.click();
		                break;
		            }
		        }
		    }

		    public void choosingMenuItem(String menuItem) {
		        for (WebElement eachMenuItem : dropDownMenu) {
		            if (eachMenuItem.getText().equalsIgnoreCase(menuItem)) {
		                eachMenuItem.click();
		            }
		        }
		    }
		    
}
