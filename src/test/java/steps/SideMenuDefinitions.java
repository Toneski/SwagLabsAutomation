package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.TestBase;

public class SideMenuDefinitions extends TestBase {

	@When("^User clicks Sidemenu it should open$")
	public void user_clicks_Sidemenu_it_should_open() throws Throwable {
		clickByXpath("//button[@id='react-burger-menu-btn']");
		Thread.sleep(500);
		
		//div[@class = 'bm-burger-button']
	}

	@When("^User clicks About and lands on About page$")
	public void user_clicks_About_and_lands_on_About_page() throws Throwable {
		clickByXpath("//a[@id='about_sidebar_link']");
		Thread.sleep(500);
		getTextByXpath("//h1[contains(text(),'DEVELOP WITH CONFIDENCE')]", "DEVELOP WITH CONFIDENCE");
		Thread.sleep(500);
	}
	@When("^User clicks back arrow and returned to home page$")
	public void user_clicks_back_arrow_and_returned_to_home_page() throws Throwable {
		driver.navigate().back();
		getTextByXpath("//*[@id=\"header_container\"]/div[2]/span", "Products");
		Thread.sleep(500);
	}

	@Then("^User clicks cart to land on cart$")
	public void user_clicks_cart_to_land_on_cart() throws Throwable {
		clickByXpath("//*[@id='shopping_cart_container']/a");
		getTextByXpath("//*[@id=\"header_container\"]/div[2]/span", "Your Cart");
		Thread.sleep(500);
	}

	@When("^User clicks All Items and lands on All Items$")
	public void user_clicks_All_Items_and_lands_on_All_Items() throws Throwable {
		clickByXpath("//*[@id=\"inventory_sidebar_link\"]");
		getTextByXpath("//*[@id=\"header_container\"]/div[2]/span", "Products");
		Thread.sleep(500);
	}

	@Then("^User clicks Logout and user is logged out$")
	public void user_clicks_Logout_and_user_is_logged_out() throws Throwable {
		clickByXpath("//a[@id='logout_sidebar_link']");
		getTextByXpath("//*[@id='root']/div/div[2]/div[2]/div/div[2]/h4", "Password for all users:");
		Thread.sleep(500);
	}

}
