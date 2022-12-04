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
	
	@Then("below options are present in the department")
	public void belowOptionsArePresentInTheDepartment(DataTable dataTable) {
		List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
	}

	@When("User on Electronics")
	public void userOnElectronics() {

	}

	@When("User on Computers")
	public void userOnComputers() {

	}

	@When("User on Smart Home")
	public void userOnSmartHome() {

	}

	@When("User on Sports")
	public void userOnSports() {

	}

	@When("User on Automative")
	public void userOnAutomative() {

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
		click(factory.homePage().kasaPlug);
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
	public void theCartIconQuantityShouldChangeTo(String string) {
		waitTillPresence(factory.homePage().cartQty);
		String actualQty = getElementText(factory.homePage().cartQty);
		Assert.assertEquals(string,actualQty);
		logger.info("cart icon quantity changed to 2");

	}

	//Scenario: Verify user can place an order without Shipping address and payment Method on file AND
	//Scenario: Verify User can place an order with Shipping address and payment Method on file
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
	  click(factory.homePage().cartBtn);
	  logger.info("User clicked on cart button");
	}
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.homePage().proceedCheckOutBtn);
		  logger.info("User clicked on proceed to checkout button");
	}
	
	@And("User click add Your address button")
	public void userClickAddYourAddressButton() {
	    click(factory.homePage().CheckOutAddressBtn);
	    logger.info("user clicked on address button");
	}
	
	@And("User fill address form with below new information")
	public void userFillNewAddressFormWithBelowInformation(DataTable data) {
	  List<Map<String,String>> address = data.asMaps(String.class,String.class);
	  selectByVisibleText(factory.homePage().countryDropdown,"United States");
	  sendText(factory.homePage().fullNameInput,address.get(0).get("fullName"));
	  sendText(factory.homePage().adddresspPhoneNumberInput,address.get(0).get("phoneNumber"));
	  sendText(factory.homePage().streetInput,address.get(0).get("streetAddress"));
	  sendText(factory.homePage().apartmentInput,address.get(0).get("apt"));
	  sendText(factory.homePage().cityInput,address.get(0).get("city"));
	  selectByValue(factory.homePage().stateInput,"California");
	  sendText(factory.homePage().zipCodeInput,address.get(0).get("zipCode"));
	  logger.info("user filled in address information");
	}
	
	@When("User click Add a credit card for Payment method")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.homePage().addCreditCardCheckoutBtn);
		logger.info("user clicked on Add A Payment Method");
	}

	@Then("User fill debit card information")
	public void userFillDebitCardInformation(DataTable data) {
		List<Map<String, String>> card = data.asMaps(String.class, String.class);
		sendText(factory.homePage().cardNumberInput, card.get(0).get("cardNumber"));
		sendText(factory.homePage().nameOnCardInput, card.get(0).get("nameOnCard"));
		selectByVisibleText(factory.homePage().expirationMonthInput,card.get(0).get("expirationMonth"));
		selectByVisibleText(factory.homePage().expirationYearInput,card.get(0).get("expiratonYear"));
		sendText(factory.homePage().securityCodeInput, card.get(0).get("securityCode"));
		logger.info("user entered credit card information"); 
	}
	
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.homePage().placeOrderBtn);
		  logger.info("User clicked on place order button button"); 
	}
	@Then("The message should be displayed {string}")
	public void theMessageShouldBeDisplayed(String string) {
	    Assert.assertEquals(string, getElementText(factory.homePage().oderPlacedSuccessfullyMessage));
	    logger.info("Order placed successfully message displaced ");
	}
	
	
	
	
	
	
	
	
	
	
	
}
