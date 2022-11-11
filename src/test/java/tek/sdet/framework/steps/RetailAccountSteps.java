package tek.sdet.framework.steps;



import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
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
	
	@When("User enter below informaton")
	public void userEnterBelowInformaton(DataTable data) {
	    List<Map<String,String>> changePassword = data.asMaps(String.class,String.class);
	    sendText(factory.accountPage().perviousPasswordInput,changePassword.get(0).get("previousPassword"));
	    sendText(factory.accountPage().newPasswordInput,changePassword.get(0).get("newPassword"));
	    sendText(factory.accountPage().confirmPasswordInput,changePassword.get(0).get("confirmPassword"));
	    logger.info("user entered updated information");
	}
	@When("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
	click(factory.accountPage().credentialsSubmitBtn);
	logger.info("user clicked on change password button");
	}
	@Then("A message should be displayed Password Updated Successfully")
	public void aMessageShouldBeDisplayedPasswordUpdatedSuccessfully() {
	  Assert.assertTrue(isElementDisplayed(factory.accountPage().alserPC)); 
	  logger.info("alert displayed");
	}

	

	
	
}
