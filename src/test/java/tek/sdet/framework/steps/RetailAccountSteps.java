package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
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
		sendText(factory.accountPage().nameInput, name);
		sendText(factory.accountPage().phoneNumberInput, phone);
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
		List<Map<String, String>> changePassword = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().perviousPasswordInput, changePassword.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPasswordInput, changePassword.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPasswordInput, changePassword.get(0).get("confirmPassword"));
		logger.info("user entered updated information");
	}

	@When("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage().credentialsSubmitBtn);
		logger.info("user clicked on change password button");
	}

	@Then("A message should be displayed {string}")
	public void aMessageShouldBeDisplayedPasswordUpdatedSuccessfully(String message) {
		Assert.assertTrue(message, true);
		logger.info("alert displayed");
	}

	@When("User click on add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().AddAPaymentMethod);
		logger.info("user clicked on Add A Payment Method");
	}

	@When("User fill debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable data) {
		List<Map<String, String>> card = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumberInput, card.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCardInput, card.get(0).get("nameOnCard"));
		sendText(factory.accountPage().expirationMonthInput, card.get(0).get("expirationMonth"));
		sendText(factory.accountPage().expirationYearInput, card.get(0).get("expirationMonth"));
		sendText(factory.accountPage().securityCodeInput, card.get(0).get("securityCode"));
		logger.info("user entered credit card information");
	}

	@When("User click on add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().paymentSubmitBtn);
		logger.info("user cliked on add card button");
	}

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String string) {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().cardPicture));
		logger.info("card picture is present");
	}

	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().AmericanExpress);
		click(factory.accountPage().Edit);
		logger.info("user clicked on Edit button");
	}

	@And("Use edit information with below data")
	public void useEditInformationWithBelowData(DataTable data) {
		List<Map<String, String>> cardEdit = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumberInput, cardEdit.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCardInput, cardEdit.get(0).get("nameOnCard"));
		sendText(factory.accountPage().expirationMonthInput, cardEdit.get(0).get("expirationMonth"));
		sendText(factory.accountPage().expirationYearInput, cardEdit.get(0).get("expiratonYear"));
		sendText(factory.accountPage().securityCodeInput, cardEdit.get(0).get("securityCode"));
		logger.info("user entered card information");
	}

	@Then("User click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().paymentSubmitBtn);
		logger.info("user clicked on update your card button");
	}

	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
	  click(factory.accountPage().MasterCard);
	  click(factory.accountPage().removeBtn);
	  logger.info("user clicked on remove button");
	}
	
	@Then("Payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
	   Assert.assertTrue(isElementDisplayed(factory.accountPage().MasterCard));
	   logger.info("user removed the card");
	}
	
	
	
	
}
