package tek.sdet.framework.steps;



import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailHomeSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();
	
	
	
	@When("User click on All section")
	public void userClickOnAllSection() {
	 click(factory.homePage().AllBtn);
	 logger.info("user clicked on All section button");
	}
	
	@Then("Below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable data) {
	   List<Map<String,String>> allDepartmentList =  data.asMaps(String.class,String.class);
	   
	   waitTillPresence(factory.homePage().AllBtn);
	   waitTillPresence(factory.homePage().electronics);
	   waitTillPresence(factory.homePage().computers);
	   waitTillPresence(factory.homePage().smartHome);
	   waitTillPresence(factory.homePage().sports);
	   waitTillPresence(factory.homePage().automative);
	   logger.info("all department options are available");
	   
	   
	}

	
	
}
