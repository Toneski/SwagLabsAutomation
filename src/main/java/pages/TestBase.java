package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestBase {

	public static WebDriver driver;

	public static WebDriver initDriver() {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.get(url);
		return driver;
	}

	public static void takeScreenshot(WebDriver driver, String screenShotName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat formartter = new SimpleDateFormat(" mm-dd-yy ");
		Date date = new Date();
		String label = formartter.format(date);
		FileUtils.copyFile(sourcefile, new File("user.dir" + "\\ScreenShot\\" + screenShotName + label + ".png"));
	}

	public static void sendByXpath(String xpath, String keys) {

		By datafield = By.xpath(xpath);
		driver.findElement(datafield).sendKeys(keys);
	}

	public static void clickByXpath(String xpath) {
		By datafield = By.xpath(xpath);
		driver.findElement(datafield).click();
		;

	}

	public static void getTextByXpath(String xpath, String expectedText) {
		By datafield = By.xpath(xpath);
		String getText = driver.findElement(datafield).getText().toLowerCase();
		System.out.println(getText);
		Assert.assertEquals("no", expectedText.toLowerCase(), getText);

	}

	public void TearDown() {
		driver.close();
		driver.quit();
	}

	public int generateRandomNO(int boundaryNumber) {
		Random rnd = new Random();
		int generatedNo = rnd.nextInt(boundaryNumber);
		return generatedNo;

	}

	public void selectFromDropdown(String xpath, String visibleText, String assertXpath) {
		By datafield = By.xpath(xpath);
		Select sel = new Select(driver.findElement(datafield));
		sel.selectByVisibleText(visibleText);
		By assertDatafield = By.xpath(assertXpath);
		String getText = driver.findElement(assertDatafield).getText().toLowerCase();
		Assert.assertEquals("no", visibleText.toLowerCase(), getText);

	}

}
