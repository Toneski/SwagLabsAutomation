package steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.TestBase;

public class CheckoutDefinitions extends TestBase {


	
	String a = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[4]/div[2]/a/div")).getText().toString();


@When("^User lands on cart, remove (\\d+) product$")
public void user_lands_on_cart_remove_product(int arg1) throws Throwable {
	driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/button")).click();
	getTextByXpath("//*[@id='shopping_cart_container']/a/span", "1");
}

@When("^User clicks checkout button and lands on checkout page$")
public void user_clicks_checkout_button_and_lands_on_checkout_page() throws Throwable {
	clickByXpath("//*[@id='checkout']");
	getTextByXpath("//*[@id=\"header_container\"]/div[2]/span", "Checkout: Your Information");
}

@When("^User enters shipping information \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
public void user_enters_shipping_information(String firstname, String lastname, String zipcode) throws Throwable {
sendByXpath("//*[@id='first-name']",firstname);
sendByXpath("//*[@id='last-name']",lastname);
sendByXpath("//*[@id='postal-code']",zipcode);
clickByXpath("//*[@id=\"continue\"]");

}

@Then("^User views confirmation page and verifies order information before clicking finish$")
public void user_views_confirmation_page_and_verifies_order_information_before_clicking_finish() throws Throwable {

	getTextByXpath("//*[@id=\"header_container\"]/div[2]/span", "Checkout: Overview");
	getTextByXpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div", a);


	clickByXpath("//*[@id=\"finish\"]");


}
@Then("^User arrives at the thank you page and goes back home$")
public void user_arrives_at_the_thank_you_page_and_goes_back_home() throws Throwable {
	getTextByXpath("//*[@id=\"header_container\"]/div[2]/span", "Checkout: Complete!");
	clickByXpath("//*[@id=\"back-to-products\"]");
	getTextByXpath("//*[@id=\"header_container\"]/div[2]/span", "Products");	

}


}
