package automation.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class createUserTest {
	
	private WebDriver driver;
	createUser createUserObject;

	@Before
	public void setUp() throws Exception {
		createUserObject = new createUser(driver);
		driver = createUserObject.chromeDriverConnection();
		createUserObject.visit("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		createUserObject.registerUser();
		assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.",createUserObject.rMessage());
	}

}
