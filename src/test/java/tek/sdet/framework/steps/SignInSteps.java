package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{

	
	private POMFactory factory = new POMFactory();
	
	@Given("User is on retail website") 
	public void userIsOnRetailWebsite() {
		String expectedTitle = "React App";
		String actualTitle = getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info(actualTitle +"is equal to" + expectedTitle);
		
	}
	
	@When("User click on Sign in option") 
	public void userClickOnSignInOption() {
		click(factory.signInPage().signIn);
		logger.info("User clicked on signIn button");
	}
	
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email,String password) {
		sendText(factory.signInPage().emailField,email);
		sendText(factory.signInPage().passwordField,password);
		logger.info("user entered " + email + "and password" + password);
	}
	
	@And("User click on login button")
	public void userClickOnLoginButton() {
	click(factory.signInPage().loginButton);
	logger.info("user clicked on login button");
	}
	
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
	Assert.assertTrue(isElementDisplayed(factory.signInPage().account));
	logger.info("user logged in into the account");
	}
	
	@And("User click on Create New Account button")
	public void userClickOnCreatNewAccountButton() {
		click(factory.signInPage().newAccountButton);
		logger.info("user clicked on sign In option");
	}
	
	@And("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable data) {
		List<Map<String,String>> signUpData = data.asMaps(String.class,String.class);
		sendText(factory.signInPage().nameInput,signUpData.get(0).get("name"));
		sendText(factory.signInPage().emailInput,signUpData.get(0).get("email"));
		sendText(factory.signInPage().passwordInput,signUpData.get(0).get("password"));
		sendText(factory.signInPage().confirmPasswordInput,signUpData.get(0).get("confirmPassword"));
		logger.info("user entered required information into sign up form");
	}
	
	@And("User click on signUp button")
	public void userClickOnSignUpButton() {
		click(factory.signInPage().signupBtn);
		logger.info("user clicked on new account button");
	}
	
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccouontPage() {
	//Assert.assertTrue(isElementDisplayed(factory.accountPage().profileImage));
	Assert.assertTrue(isElementDisplayed(factory.signInPage().account));
	logger.info("Account was created");
	}
	
	
	
	
	
	
}
