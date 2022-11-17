package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
		click(factory.accountPage().MasterCard);
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
	
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
	  click(factory.accountPage().addAddress);
	  logger.info("user clicked on add address option");
	}
	@When("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable data) {
	  List<Map<String,String>> address = data.asMaps(String.class,String.class);
	  
	  selectByValue(factory.accountPage().countryDropdown,"United States");
	  sendText(factory.accountPage().fullNameInput,address.get(0).get("fullName"));
	  sendText(factory.accountPage().phoneNumberInput,address.get(0).get("phoneNumber"));
	  sendText(factory.accountPage().streetInput,address.get(0).get("streetAddress"));
	  sendText(factory.accountPage().apartmentInput,address.get(0).get("apt"));
	  sendText(factory.accountPage().cityInput,address.get(0).get("city"));
	  selectByValue(factory.accountPage().stateInput,"California");
	  sendText(factory.accountPage().zipCodeInput,address.get(0).get("zipCode"));
	  logger.info("user filled in address information");
	}
	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
	    click(factory.accountPage().addressBtn);
	    logger.info("user clicked on address button");
	    
	}
	
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
	   click(factory.accountPage().addEditBtn);
	   logger.info("user clicked on edit address option");
	}
	
	@When("User click on update Address button")
	public void userClickOnUpdateAddressButton() {
	  click(factory.accountPage().addressBtn);
	  logger.info("user clicked on update address button");
	}

	
	@When("User click on remove option of address section")
	public void userClickOnRemoveOptionOfAddressSection() {
	   click(factory.accountPage().removeAddress);
	   logger.info("user clicked on remove button of the address section");
	}
	
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
	  Assert.assertFalse(isElementDisplayed(factory.accountPage().removeAddress));
	  logger.info("address details are removed");
	}

	
	
	
	
	
	
}
