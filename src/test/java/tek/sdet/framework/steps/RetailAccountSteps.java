package tek.sdet.framework.steps;



import org.junit.Assert;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {

	
	private POMFactory factory = new POMFactory();
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
	 click(factory.signInPage().account); 
	 logger.info("user clicked on account button");
	}
	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phone) {
	   sendText(factory.accountPage().nameInput,name); 
	   sendText(factory.accountPage().phoneNumberInput,phone);
	   logger.info("user entered " + name + "and phone number" + phone);
	}
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
	  click(factory.accountPage().updateButton);
	  logger.info("user clicked on update button");
	}
	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() { 
	   Assert.assertTrue(isElementDisplayed(factory.accountPage().alert));
		
		
	    logger.info("alert is displayed");
	}
	
	
	

	
	
}
