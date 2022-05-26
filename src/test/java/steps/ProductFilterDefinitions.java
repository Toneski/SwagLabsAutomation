package steps;

import cucumber.api.java.en.When;
import pages.TestBase;

public class ProductFilterDefinitions extends TestBase {

	@When("^User clicks right hand dropdown and selects \"([^\"]*)\"$")
	public void user_clicks_right_hand_dropdown_and_selects(String expectedPage) throws Throwable {
		expectedPage = null;
		switch (expectedPage) {
		case "Name (Z to A)":
			selectFromDropdown("/html/body/div/div/div/div[1]/div[2]/div[2]/span/select", "Name (Z to A)",
					"//*[@id=\"header_container\"]/div[2]/div[2]/span/span");
			Thread.sleep(500);
		case "<A-Z>":
			selectFromDropdown("/html/body/div/div/div/div[1]/div[2]/div[2]/span/select", "Name (A to Z)",
					"//*[@id=\"header_container\"]/div[2]/div[2]/span/span");
			Thread.sleep(500);
		case "Price (high to low)":
			selectFromDropdown("/html/body/div/div/div/div[1]/div[2]/div[2]/span/select", "Name (A to Z)",
					"//*[@id=\"header_container\"]/div[2]/div[2]/span/span");
			Thread.sleep(500);
		case "Price (low to high)":
			selectFromDropdown("/html/body/div/div/div/div[1]/div[2]/div[2]/span/select", "Name (A to Z)",
					"//*[@id=\"header_container\"]/div[2]/div[2]/span/span");
			Thread.sleep(500);
			break;
		}

	}

}
