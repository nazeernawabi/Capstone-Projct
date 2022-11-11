package tek.sdet.framework.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "nameInput")
	public WebElement nameInput;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumberInput;
	
	@FindBy(id = "personalUpdateBtn")
	public WebElement updateButton;
	
	@FindBy(xpath="//div[@class='Toastify__toast-body']")
	public WebElement alert;
	
	
	
	
	
}
