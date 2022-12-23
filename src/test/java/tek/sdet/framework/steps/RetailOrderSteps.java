package tek.sdet.framework.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import org.junit.Assert;

public class RetailOrderSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();

//Scenario: Verify User can cancel the order 

	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.homePage().orderSectionBtn);
		logger.info("ser clicked on order section");
	}

	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.orderPage().firstorderItem);
		logger.info("user clicked on first order");
	}

	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderPage().cancelBtn);
		logger.info("user clicked on cancel button");
	}

	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String reason) {
		selectByVisibleText(factory.orderPage().cancellaionReason, reason);
		logger.info("User selected the cancelation Reason");
	}

	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().cancelOrderBtn);
		logger.info("User clicked on Cancel Order button");
	}

	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String expectedMessage) {
		if(expectedMessage.contains("Your Order Has Been Cancelled")) {
			Assert.assertEquals(expectedMessage, factory.orderPage().yourOderCancelled.getText());
			logger.info(expectedMessage + "displayed");
		
		}else if(expectedMessage.contains("Return was successful")) {
			Assert.assertEquals(expectedMessage, factory.orderPage().returnWasSuccessfull.getText());
			logger.info(expectedMessage + "is displayed");
		}
	}
		
	

	// Scenario: Verify User can Return the order

	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.orderPage().returnBtn);
		logger.info("User clicked on Return Items button");
	}

	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String reason) {
		selectByVisibleText(factory.orderPage().cancellaionReason, reason);
		logger.info("User selected the Return Reason");
	}

	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String drpLocation) {
		selectByVisibleText(factory.orderPage().dropOffLocation, drpLocation);
		logger.info("User selected the drop off service");
	}

	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().returnOderBtn);
		logger.info("User clicked on Return Order button");
	}

	//Scenario: Verify User can write a review on order placed
	
	@When("User click on Review button")
	public void userClickOnReviewButton() {
	   click(factory.orderPage().reviewBtn);
	   logger.info("User clicked on Review button");
	}
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String headline, String textValue) {
	    sendText(factory.orderPage().headlineInput,headline);
	    sendText(factory.orderPage().descriptionInput,textValue);
	    logger.info(headline + "and"+ textValue);
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
	  click(factory.orderPage().reviewSubmitBtn);
	  logger.info("User clicked Add your Review button");
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String expectedMessage) {
		waitTillPresence(factory.orderPage().reviewAddedSuccessfully);
	    Assert.assertEquals(factory.orderPage().reviewAddedSuccessfully.getText(),expectedMessage);
	    logger.info(expectedMessage + "is displayed");
	}

	
	
}
