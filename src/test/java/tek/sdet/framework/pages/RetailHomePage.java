package tek.sdet.framework.pages;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	
	public RetailHomePage () {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//span[text()='All']")
	public WebElement AllBtn;
	
	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electronics;
	
	@FindBy(xpath = "//span[text()='Computers']")
	public WebElement computers;
	
	@FindBy(xpath = "//span[text()='Smart Home']")
	public WebElement smartHome;
	
	@FindBy(xpath = "//span[text()='Sports']")
	public WebElement sports;
	
	@FindBy(xpath = "//span[text()='Automative']")
	public WebElement automative;
	
	@FindBy(xpath = "//span[text()='Video Games']")
	public WebElement electVideoGames;
	
	@FindBy(xpath = "//span[text()='TV & Video']")
	public WebElement electTVVideo;
	
	@FindBy(xpath = "//span[text()='Accessories']")
	public WebElement compAccessories;
	
	@FindBy(xpath = "//span[text()='Networking']")
	public WebElement compNetworking;
	
	@FindBy(xpath = "//span[text()='Smart Home Lightning']")
	public WebElement smartHomeLightning;
	
	@FindBy(xpath = "//span[text()='Plugs and Outlets']")
	public WebElement smartHomePlugsOutlets;
	
	@FindBy(xpath = "//span[text()='Athletic Clothing']")
	public WebElement sportsAthleticClothing;
	
	@FindBy(xpath = "//span[text()='Exercise & Fitness']")
	public WebElement sportsExerciseFitness;
	
	@FindBy(xpath = "//span[text()='Automative Parts & Accessories']")
	public WebElement automotiveParts;
	
	@FindBy(xpath = "//span[text()='MotorCycle & Powersports']")
	public WebElement automativeMotorCyclePower;
	
	@FindBy(id="searchInput")
	public WebElement searchInput;
	
	@FindBy(id="searchBtn")
	public WebElement searchBtn;
	
	@FindBy(xpath="//p[@class='products__name']")
	public WebElement productName;
	
	
	@FindBy(xpath="//select[@class='product__select']")
	public WebElement productSelectBtn;
	
	@FindBy(xpath="//img[@alt='Kasa Outdoor Smart Plug']")
	public WebElement kasaQty;
	
	@FindBy(xpath="//button[@id='addToCartBtn']/child::*")
	public WebElement addToCartBtn;
	
	@FindBy(id="cartQuantity")
	public WebElement cartQty; 
	
	@FindBy(id="search")
	public WebElement searchCatagory;
	
	@FindBy(xpath = "//p[text()='Cart ']")
	public WebElement cartBtn;
	@FindBy(id="proceedBtn")
	public WebElement proceedCheckOutBtn;
	
	@FindBy(id="addAddressBtn")
	public WebElement CheckOutAddressBtn;
	
	@FindBy(id="placeOrderBtn")
	public WebElement placeOrderBtn;
	
	@FindBy(xpath="//div[text()='Order Placed Successfully']")
	public WebElement oderPlacedSuccessfullyMessage;
	
	@FindBy(id = "countryDropdown")
	public WebElement countryDropdown;
	
	@FindBy(id = "fullNameInput")
	public WebElement fullNameInput;
	
	@FindBy(id = "streetInput")
	public WebElement streetInput;
	
	@FindBy(id = "apartmentInput")
	public WebElement apartmentInput;
	
	@FindBy(id = "cityInput")
	public WebElement cityInput;
	
	@FindBy(name = "state")
	public WebElement stateInput;
	
	@FindBy(id = "zipCodeInput")
	public WebElement zipCodeInput;
	
	@FindBy(id ="phoneNumberInput")
	public WebElement adddresspPhoneNumberInput;
	
	@FindBy(id = "addPaymentBtn")
	public WebElement addCreditCardCheckoutBtn;
	
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
	
	@FindBy(xpath = "//div[@class='sidebar_content-item']/span")
	public List<WebElement> sidebar;
	@FindBy(xpath = "//p[text()='Order Placed, Thanks']")
	public WebElement orderPlacedThanks;
	
	@FindBy(id = "addAddressBtn")
	public WebElement addAddressBtn;
	
	@FindBy(id = "orderLink")
	public WebElement orderSectionBtn;
	
	
	
}
