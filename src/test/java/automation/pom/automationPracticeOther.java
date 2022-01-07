package automation.pom;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class automationPracticeOther {
	
private WebDriver driver;
	
	By singinLocator = By.linkText("Sign in");
	
	By registerPageLocator = By.xpath("//*[@id=\"account-creation_form\"]/div[1]/h3");
	
	By emailCreate = By.cssSelector("input[name='email_create']");
	By btnCreateLocator = By.id("SubmitCreate");
	
	By radioBtnLocator = By.id("uniform-id_gender1");
	By firstNameLocator = By.id("customer_firstname");
	By lastNameLocator = By.id("customer_lastname");
	By passLocator = By.id("passwd");
	By daysLocator = By.id("days");
	By monthsLocator = By.id("months");
	By yearLocator = By.id("years");
	By newsletterLocator = By.id("newsletter");
	By uniformLocator = By.id("uniform-optin");
	By companyLocator = By.id("company");
	By adressLocator = By.id("address1");
	By cityLocator = By.id("city");
	By stateLocator = By.id("id_state");
	By postCodeLocator = By.id("postcode");
	By countryLocator = By.id("id_country");
	By phoneLocator = By.id("phone");
	By phoneMobileLocator = By.id("phone_mobile");
	By aliasLocator = By.id("alias");
	By submitAccountBtnLocator = By.id("submitAccount");
	
	By singOutLocator = By.linkText("Sign out");
	
	
	By registerPageLocatorLogin = By.xpath("//*[@id=\"login_form\"]/h3");
	By emailLoginLocator = By.cssSelector("input[name='email']");
	By passwdLoginLocator = By.cssSelector("input[name='passwd']");
	By SubmitLoginLocator = By.id("SubmitLogin");

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/CDriver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test1_CreateUser() throws InterruptedException {
		driver.findElement(singinLocator).click();
		
		Thread.sleep(2000);
		
		driver.findElement(emailCreate).sendKeys("AdminGPH003@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(btnCreateLocator).click();
		
		Thread.sleep(3000);	
		
		if(driver.findElement(registerPageLocator).isDisplayed()) {
			
			driver.findElement(radioBtnLocator).click();
			Thread.sleep(1000);
			driver.findElement(firstNameLocator).sendKeys("Admin");
			Thread.sleep(1000);
			driver.findElement(lastNameLocator).sendKeys("Administrador");
			Thread.sleep(1000);
			driver.findElement(passLocator).sendKeys("AdminPass");
			Thread.sleep(1000);
			driver.findElement(daysLocator).sendKeys("15");
			Thread.sleep(1000);
			driver.findElement(daysLocator).click();
			Thread.sleep(1000);
			driver.findElement(monthsLocator).sendKeys("jan");
			Thread.sleep(1000);
			driver.findElement(monthsLocator).click();
			Thread.sleep(1000);
			driver.findElement(yearLocator).sendKeys("2000");
			Thread.sleep(1000);
			driver.findElement(yearLocator).click();
			Thread.sleep(1000);
			driver.findElement(newsletterLocator).click();
			Thread.sleep(1000);
			driver.findElement(uniformLocator).click();
			Thread.sleep(1000);
			driver.findElement(companyLocator).sendKeys("N/A");
			Thread.sleep(1000);
			driver.findElement(adressLocator).sendKeys("N/A");
			Thread.sleep(1000);
			driver.findElement(cityLocator).sendKeys("Medellín");
			Thread.sleep(1000);
			driver.findElement(stateLocator).sendKeys("Alabama");
			Thread.sleep(1000);
			driver.findElement(postCodeLocator).sendKeys("00000");
			Thread.sleep(1000);
			driver.findElement(countryLocator).sendKeys("United States");
			Thread.sleep(1000);
			driver.findElement(phoneLocator).sendKeys("4444444");
			Thread.sleep(1000);
			driver.findElement(phoneMobileLocator).sendKeys("3010001111");
			Thread.sleep(1000);
			driver.findElement(aliasLocator).clear();
			Thread.sleep(1000);
			driver.findElement(aliasLocator).sendKeys("AdminAdmin");
			Thread.sleep(1000);
			driver.findElement(submitAccountBtnLocator).click();
			Thread.sleep(3000);
			
			
			List<WebElement> notes2= driver.findElements(By.className("info-account"));
			
			Thread.sleep(1500);
			
			assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.",notes2.get(0).getText());
			
			System.out.println(notes2.get(0).getText());
			
			Thread.sleep(5000);
			
			driver.findElement(singOutLocator).click();
						
			
		}
		else {
			System.out.print("Register pages was not found");
		}
	}
	
	@Test
	public void test2_LoginUser() throws InterruptedException {
		
		driver.findElement(singinLocator).click();
		
		Thread.sleep(2000);
		
		
		if(driver.findElement(registerPageLocatorLogin).isDisplayed()) {
			
			driver.findElement(emailLoginLocator).sendKeys("AdminGPH003@gmail.com");
			
			driver.findElement(passwdLoginLocator).sendKeys("AdminPass");
			
			Thread.sleep(2000);
			
			driver.findElement(SubmitLoginLocator).click();			
			
		}
		else {
			System.out.print("Login pages was not found");
		}
		
		List<WebElement> notes2= driver.findElements(By.className("info-account"));
		
		Thread.sleep(1500);
		
		assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.",notes2.get(0).getText());
		
		System.out.println(notes2.get(0).getText());
	}	

}
