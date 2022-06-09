package steps;

import org.openqa.selenium.interactions.Actions;

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

	@Given("^User is on Youtube login page$")
	public void user_is_on_Youtube_login_page() throws InterruptedException {

		driver.get("https://www.youtube.com/");

		clickByXpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[3]/div[2]/ytd-button-renderer/a/tp-yt-paper-button");
		Thread.sleep(3000);
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) throws InterruptedException {
		sendByXpath("//input[@id='identifierId']", username);
		clickByXpath("//span[text()='Next']/parent::*");

		Thread.sleep(3000);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password(String password) throws InterruptedException {
		sendByXpath("//input[@type='password']", password);
		clickByXpath("//span[text()='Next']/parent::*");

		Thread.sleep(3000);
	}

	@Then("^User goes to video as \"([^\"]*)\"$")
	public void user_goes_to_video_as(String vid) throws Throwable {

		
		gotov(vid);
Thread.sleep(1000);
clickByXpath("//div[@id='info']//ytd-toggle-button-renderer[1]//a[1]//yt-icon-button[1]//button[1]//yt-icon[1]\r\n"
		);


	}
	@Then("^leaves comment on video as \"([^\"]*)\"$")
	public void leaves_comment_on_video_as(String comment) throws Throwable {
		Thread.sleep(2000);

		clickByXpath("//*[@id='simplebox-placeholder']");
		Thread.sleep(1000);

		sendByXpath("//*[@id='contenteditable-root']",comment);
		Thread.sleep(1000);

		clickByXpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-watch-flexy/div[5]/div[1]/div/ytd-comments/ytd-item-section-renderer/div[1]/ytd-comments-header-renderer/div[5]/ytd-comment-simplebox-renderer/div[3]/ytd-comment-dialog-renderer/ytd-commentbox/div[2]/div/div[4]/div[5]/ytd-button-renderer[2]/a/tp-yt-paper-button");
		//*[@id="button"]
	}
//	@After
//	public void teardown() throws InterruptedException {
//		Thread.sleep(300);
//		TearDown();
//	}
}
