package steps;

import java.util.Set;

import cucumber.api.java.en.Then;
import junit.framework.Assert;
import pages.TestBase;

public class SocialMediaDefinitions extends TestBase {

	@SuppressWarnings("deprecation")
	@Then("^User clicks on Twitter link to land on Users Twitter page$")
	public void user_clicks_on_Twitter_link_to_land_on_Users_Twitter_page() throws Throwable {
		
		String handle1 = driver.getWindowHandle();
		clickByXpath("//*[@id='page_wrapper']/footer/ul/li[1]/a");
		Thread.sleep(2000);
		Set<String> handle2 = driver.getWindowHandles();
		System.out.println(handle2);
		for(String i : handle2)
		{driver.switchTo().window(i);}
		String verifywindowchange = driver.getTitle();
		String MainWindow = driver.getWindowHandle();
		String a = "Sauce Labs (@saucelabs) / Twitter";

		Assert.assertEquals(verifywindowchange, verifywindowchange);
		
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(handle1);

		
	}
	@Then("^User clicks on FaceBook link to land on Users FaceBook page$")
	public void user_clicks_on_FaceBook_link_to_land_on_Users_FaceBook_page() throws Throwable {
		String handle1 = driver.getWindowHandle();
		clickByXpath("//*[@id=\"page_wrapper\"]/footer/ul/li[2]/a");
		Thread.sleep(2000);
		Set<String> handle2 = driver.getWindowHandles();
		System.out.println(handle2);
		for(String i : handle2)
		{driver.switchTo().window(i);}
		String verifywindowchange = driver.getTitle();
		String MainWindow = driver.getWindowHandle();
		String a = "Sauce Labs (@saucelabs) / Twitter";

		Assert.assertEquals(verifywindowchange, verifywindowchange);
		
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(handle1);

	}

	@Then("^User clicks on LinkedIn link to land on Users LinkedIn page$")
	public void user_clicks_on_LinkedIn_link_to_land_on_Users_LinkedIn_page() throws Throwable {
		String handle1 = driver.getWindowHandle();
		clickByXpath("//*[@id=\"page_wrapper\"]/footer/ul/li[3]/a");
		Thread.sleep(2000);
		Set<String> handle2 = driver.getWindowHandles();
		System.out.println(handle2);
		for(String i : handle2)
		{driver.switchTo().window(i);}
		String verifywindowchange = driver.getTitle();
		String MainWindow = driver.getWindowHandle();
		String a = "Sauce Labs (@saucelabs) / Twitter";

		Assert.assertEquals(verifywindowchange, verifywindowchange);
		
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(handle1);
		driver.close();		
		driver.quit();
	}

	
	
	
	
}
