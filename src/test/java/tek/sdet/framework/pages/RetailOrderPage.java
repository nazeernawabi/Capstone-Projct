package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {

	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//img[@class='order__item-img']")
	public WebElement firstorderItem;
	
	@FindBy(id = "cancelBtn")
	public WebElement cancelBtn;
	
	@FindBy(id = "reasonInput")
	public WebElement cancellaionReason;
	
	@FindBy(xpath = "//button[@class='order__cancel-submit']")
	public WebElement cancelOrderBtn;
	
	@FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
	public WebElement yourOderCancelled;
	
	@FindBy(id = "returnBtn")
	public WebElement returnBtn;
	
	@FindBy(id = "dropOffInput")
	public WebElement dropOffLocation;
	
	@FindBy(id = "orderSubmitBtn")
	public WebElement returnOderBtn;
	
	@FindBy(xpath = "//p[text()='Return was successfull']")
	public WebElement returnWasSuccessfull;
	
	@FindBy(id = "reviewBtn")
	public WebElement reviewBtn;
	
	@FindBy(id = "headlineInput")
	public WebElement headlineInput;
	
	@FindBy(id = "descriptionInput")
	public WebElement descriptionInput;
	
	@FindBy(id = "reviewSubmitBtn")
	public WebElement reviewSubmitBtn;
	
	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement reviewAddedSuccessfully;
	
}
