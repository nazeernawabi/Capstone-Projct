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
}
