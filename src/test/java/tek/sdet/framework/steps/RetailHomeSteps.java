package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailHomeSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();

	
	//Scenario: Verify shop by Department sidebar
	
	
	@When("User click on All section")
	public void userClickOnAllSection() {

		click(factory.homePage().AllBtn);
		logger.info("user clicked on All section button");
	}

	@Then("Below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<List<String>> list = dataTable.asLists(String.class);
		Assert.assertEquals(list.get(0).get(0), getElementText(factory.homePage().electronics));
		Assert.assertEquals(list.get(0).get(1), getElementText(factory.homePage().computers));
		Assert.assertEquals(list.get(0).get(2), getElementText(factory.homePage().smartHome));
		Assert.assertEquals(list.get(0).get(3), getElementText(factory.homePage().sports));
		Assert.assertEquals(list.get(0).get(4), getElementText(factory.homePage().automative));
		logger.info("all options are present");

	}

	//Scenario Outline: Verify department sidebar options
	
	@When("User on {string}")
	public void userOnElectronics(String department) {
		
		getDriver().findElement((By.xpath("//span[text()='"+department+"']"))).click();
	    logger.info("user on departments");
	}
	@Then("below options are present in the department")
	public void belowOptionsArePresentInTheDepartment(DataTable dataTable) {
	    List<List<String>> departmentOptions= dataTable.asLists(String.class);
	    List<WebElement> dept = factory.homePage().sidebar;
	    for(int i = 0; i < departmentOptions.get(0).size();i++ ) {
	    	
	    	for(WebElement element : dept) {
	    		
	    		if(element.getText().equals(departmentOptions.get(0).get(i))) {
	    			Assert.assertTrue(element.isDisplayed());
	    			logger.info(element.getText()+ "is present");
	    		}
	    	}
	    }
	}


	//Scenario: Verify user can add an item to cart
	
	@Then("User change the category to {string}")
	public void userChangeTheCategoryTo(String smartHome) {
		selectByVisibleText(factory.homePage().searchCatagory, smartHome);
		logger.info("user changed the category to smart home");

	}

	@Then("User search for an item {string}")
	public void userSearchForAnItem(String string) {
		sendText(factory.homePage().searchInput, string);
		logger.info("user searched for item");
	}

	@Then("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchBtn);
		logger.info("user clicked on search button");

	}

	@Then("User click on item")
	public void userClickOnItem() {
		waitTillPresence(factory.homePage().productName);
		click(factory.homePage().productName);
		logger.info("user clicked on item");
	}

	@Then("User select quantity {string}")
	public void userSelectQuantity(String string) {
		selectByVisibleText(factory.homePage().productSelectBtn, string);
		logger.info("user selected 2 quantities");

	}

	@Then("user click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.homePage().addToCartBtn);
		logger.info("user clicked on add to cart button");

	}

	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String expectedQty) {
		
		//waitTillPresence(factory.homePage().cartQty);
		//String actualQty = getElementText(factory.homePage().cartQty);
		Assert.assertEquals(expectedQty,factory.homePage().cartQty.getText());
		logger.info("cart icon quantity changed to " + expectedQty);

	}

	//Scenario: Verify user can place an order without Shipping address and payment Method on file AND
	//Scenario: Verify User can place an order with Shipping address and payment Method on file
	
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
	    click(factory.homePage().cartBtn);
	    logger.info("user clicked on cart option");
	}
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
	    click(factory.homePage().proceedCheckOutBtn);
	    logger.info("user clicked on proceed to checkout button");
	}
	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
	    click(factory.homePage().addAddressBtn);
	    logger.info("user clicked on new address link for shiping address");
	}
	@Then("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
		waitTillClickable(factory.homePage().addCreditCardCheckoutBtn);
	    click(factory.homePage().addCreditCardCheckoutBtn);
	    logger.info("user clicked on add credit card or debit card payment method");
	}
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
	    click(factory.homePage().placeOrderBtn);
	    logger.info("user clicked on place your order button");
	}

	//Verify User can place an order with Shipping address and payment Method on file
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
}
