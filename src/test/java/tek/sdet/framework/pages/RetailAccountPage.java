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
	
	@FindBy(id = "previousPasswordInput")
	public WebElement perviousPasswordInput;
	
	@FindBy(id = "newPasswordInput")
	public WebElement newPasswordInput;
	
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPasswordInput;
	
	@FindBy(id = "credentialsSubmitBtn")
	public WebElement credentialsSubmitBtn;
	
	@FindBy(xpath = "//div[@class='Toastify']")
	public WebElement alserPC;
	
	@FindBy(xpath = "//*[contains(text(), 'payment')]")
	public WebElement AddAPaymentMethod;
	
	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberInput;
	
	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCardInput;
	
	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonthInput;
	
	@FindBy(id = "expirationYearInput")
	public WebElement expirationYearInput;
	
	@FindBy(id = "securityCodeInput")
	public WebElement securityCodeInput;
	
	@FindBy(id = "paymentSubmitBtn")
	public WebElement paymentSubmitBtn;
	
	@FindBy(xpath = "//img[@class='w-full undefined']")
	public WebElement cardPicture;
	
	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement Edit;
	
	@FindBy(xpath = "//p[text()='Master Card']")
	public WebElement MasterCard;
	
	@FindBy(xpath = "//button[text()='remove']")
	public WebElement removeBtn;
	
	
	
	
	
	
	
	
	
	
	
	
	
}
