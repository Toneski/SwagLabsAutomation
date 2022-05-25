package steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.TestBase;

public class AddProductDefinitions extends TestBase {

	String beforeXpathButton = "/html/body/div/div/div/div[2]/div/div/div/div[";
	String afterXpathButton = "]/div[2]/div[2]/button";
	
	String beforeXpath = "/html/body/div/div/div/div[2]/div/div/div/div[";
	String afterXpath = "]/div[2]/div[1]/a/div";
	

	
	@And("^User will pick a random product, click add to cart then remove from cart$")
	public void user_will_pick_a_random_product_click_add_to_cart_then_remove_from_cart() throws Throwable {
		int random = generateRandomNO(5)+1;
		driver.findElement(By.xpath(beforeXpathButton + random + afterXpathButton)).click();
		String a = driver.findElement(By.xpath(beforeXpath + random + afterXpath)).getText().toString();
		System.out.println("Product Added:  " + a);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(beforeXpathButton + random + afterXpathButton)).click();
		String b = driver.findElement(By.xpath(beforeXpath + random + afterXpath)).getText().toString();
		System.out.println("Product Removed:  " + b);
		Assert.assertEquals("They dont match!",b,a);
	}	
	
	
}
