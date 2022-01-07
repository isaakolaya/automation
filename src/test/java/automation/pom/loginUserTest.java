package automation.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class loginUserTest {
	private WebDriver driver;
	loginUser loginUserObject;

	@Before
	public void setUp() throws Exception {
		loginUserObject = new loginUser(driver);
		driver = loginUserObject.chromeDriverConnection();
		loginUserObject.visit("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		loginUserObject.singInUser();
		Thread.sleep(2000);
		assertTrue(loginUserObject.accountDisplayed());
	}

}
