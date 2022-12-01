package tek.sdet.framework.pages;



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
	
	@FindBy(xpath="//img[@alt='Kasa Outdoor Smart Plug']")
	public WebElement kasaPlug;
	
	
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
	
	
	
	
}
