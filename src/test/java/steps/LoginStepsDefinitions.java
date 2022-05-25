package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.TestBase;

public class LoginStepsDefinitions extends TestBase {

	@Before
	public void define() {
		driver = initDriver();
	}

	@Given("^User is on Swag Labs login page$")
	public void user_is_on_Swag_Labs_login_page() throws InterruptedException {

		driver.get("https://www.saucedemo.com/inventory.html");
		Thread.sleep(500);
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) throws InterruptedException {
		sendByXpath("//*[@id=\"user-name\"]", username);
		Thread.sleep(500);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password(String password) throws InterruptedException {
		sendByXpath("//*[@id=\"password\"]", password);
		Thread.sleep(500);
	}

	@And("^User clicks on Signin button$")
	public void user_clicks_on_Signin_button() throws InterruptedException {
		clickByXpath("//*[@id=\"login-button\"]");
		Thread.sleep(500);
	}

	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page() throws Throwable {
		String testName = "LoginTest";
		takeScreenshot(driver, testName);
		getTextByXpath("//*[@id=\"header_container\"]/div[2]/span", "Products");
	}

	@After
	public void teardown() throws InterruptedException {
		Thread.sleep(300);
		TearDown();
	}
}
