package steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.TestBase;

public class CartDefinitions extends TestBase {

	String beforeXpathButton = "/html/body/div/div/div/div[2]/div/div/div/div[";
	String afterXpathButton = "]/div[2]/div[2]/button";

	String beforeXpath = "/html/body/div/div/div/div[2]/div/div/div/div[";
	String afterXpath = "]/div[2]/div[1]/a/div";

	String beforeXpathButton2 = "/html/body/div/div/div/div[2]/div/div[1]/div[";
	String afterXpathButton2 = "]/div[2]/div[2]/button";

	String beforeXpath2 = "";
	String afterXpath2 = "";

	int random = generateRandomNO(2) + 1;
	int random2 = random + 3;
	String aConfirm = driver.findElement(By.xpath(beforeXpath + random + afterXpath)).getText().toString();
	String bConfirm = driver.findElement(By.xpath(beforeXpath + random2 + afterXpath)).getText().toString();
	String a = driver.findElement(By.xpath(beforeXpath + random + afterXpath)).getText().toString();
	String b = driver.findElement(By.xpath(beforeXpath + random2 + afterXpath)).getText().toString();

	@And("^User will pick 2 random products, click add to cart$")
	public void user_will_pick_2_random_products_click_add_to_cart() throws Throwable {

		driver.findElement(By.xpath(beforeXpathButton + random + afterXpathButton)).click();

		System.out.println("Product Added:  " + a);

		driver.findElement(By.xpath(beforeXpathButton + random2 + afterXpathButton)).click();

		System.out.println("Product Added:  " + b);

		getTextByXpath("//*[@id='shopping_cart_container']/a/span", "2");

		Thread.sleep(500);
	}

	@When("^User will click on cart and view its contents$")
	public void user_will_click_on_cart_and_view_its_contents() throws Throwable {
		clickByXpath("//*[@id='shopping_cart_container']/a");
		getTextByXpath("//*[@id='shopping_cart_container']/a/span", "2");
		getTextByXpath("//*[@id='header_container']/div[2]/span","Your Cart");
		getTextByXpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div", a);
		getTextByXpath("/html/body/div/div/div/div[2]/div/div[1]/div[4]/div[2]/a/div", b);

	}

	@When("^User lands on cart, remove (\\d+) random product$")
	public void user_lands_on_cart_remove_random_product(int arg1) throws Throwable {
		int random = generateRandomNO(1) + 3;

		driver.findElement(By.xpath(beforeXpathButton2 + random + afterXpathButton2)).click();
		getTextByXpath("//*[@id='shopping_cart_container']/a/span", "1");

	}
	@Then("^User will click continue shopping to verify return to product page$")
	public void user_will_click_continue_shopping_to_verify_return_to_product_page() throws Throwable {

		clickByXpath("//*[@id='continue-shopping']");
		getTextByXpath("//*[@id=\"header_container\"]/div[2]/span", "PRODUCTS");
	
	}


}
