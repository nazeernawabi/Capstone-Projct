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

		String electronicActualText = getElementText(factory.homePage().electronics);
		String compActualText = getElementText(factory.homePage().computers);
		String smartHomeActualText = getElementText(factory.homePage().smartHome);
		String sportsActualText = getElementText(factory.homePage().sports);
		String autoActualText = getElementText(factory.homePage().automative);
		Assert.assertEquals(list.get(0).get(0), electronicActualText);
		Assert.assertEquals(list.get(0).get(1), compActualText);
		Assert.assertEquals(list.get(0).get(2), smartHomeActualText);
		Assert.assertEquals(list.get(0).get(3), sportsActualText);
		Assert.assertEquals(list.get(0).get(4), autoActualText);
		logger.info("all options are present");

	}

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
		String expectedQty = string;
		String actualQty = getElementText(factory.homePage().cartQty);
		Assert.assertEquals(expectedQty, actualQty);
		logger.info("cart icon quantity changed to 2");

	}

}
