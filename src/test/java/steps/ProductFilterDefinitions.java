package steps;

import cucumber.api.java.en.When;
import pages.TestBase;

public class ProductFilterDefinitions extends TestBase {

	@When("^User clicks right hand dropdown and selects Name \\(Z to A\\)$")
	public void user_clicks_right_hand_dropdown_and_selects_Name_Z_to_A() throws Throwable {
		selectFromDropdown("/html/body/div/div/div/div[1]/div[2]/div[2]/span/select", "Name (Z to A)",
				"//*[@id=\"header_container\"]/div[2]/div[2]/span/span");
		Thread.sleep(500);
	}

	@When("^User clicks right hand dropdown and selects Name \\(A to Z\\)$")
	public void user_clicks_right_hand_dropdown_and_selects_Name_A_to_Z() throws Throwable {
		selectFromDropdown("/html/body/div/div/div/div[1]/div[2]/div[2]/span/select", "Name (A to Z)",
				"//*[@id=\"header_container\"]/div[2]/div[2]/span/span");
		Thread.sleep(500);
	}

	@When("^User clicks right hand dropdown and selects Price \\(high to low\\)$")
	public void user_clicks_right_hand_dropdown_and_selects_Price_high_to_low() throws Throwable {
		selectFromDropdown("/html/body/div/div/div/div[1]/div[2]/div[2]/span/select", "Name (A to Z)",
				"//*[@id=\"header_container\"]/div[2]/div[2]/span/span");
		Thread.sleep(500);
	}

	@When("^User clicks right hand dropdown and selects Price \\(low to high\\)$")
	public void user_clicks_right_hand_dropdown_and_selects_Price_low_to_high() throws Throwable {
		selectFromDropdown("/html/body/div/div/div/div[1]/div[2]/div[2]/span/select", "Name (A to Z)",
				"//*[@id=\"header_container\"]/div[2]/div[2]/span/span");
		Thread.sleep(500);
	}

}
