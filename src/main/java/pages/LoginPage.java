package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver i) {
		this.driver = i;
	}

	// Login Data

	// by class
	By userNameField = By.xpath("//input[@id='username']");
	By passWordField = By.xpath("//*[@id=\"password\"]");
	By signInButtonField = By.xpath("/html/body/div/div/div/form/div[3]/button");

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement USERNAME_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement PASSWORD_Element;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement SIGNIN_BUTTON__Element;

	public void inserUserName(String userName) {
		USERNAME_Element.sendKeys(userName);
	}

	public void inserPassword(String password) {
		PASSWORD_Element.sendKeys(password);
	}

	public void clickSignInButton() {
		SIGNIN_BUTTON__Element.click();
		;
	}

	public void loginTest(String userName, String password) {
		USERNAME_Element.sendKeys(userName);
		PASSWORD_Element.sendKeys(password);
		SIGNIN_BUTTON__Element.click();
		;
	}

}
