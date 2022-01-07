package automation.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class createUser extends Base {
	
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
	
	By rMessage = By.xpath("//*[@id=\"center_column\"]/p");

	public createUser(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		
	public void registerUser() throws InterruptedException {
		click(singinLocator);
		Thread.sleep(2000);
		
		type("AdminIOH5@gmail.com",emailCreate);
		Thread.sleep(1500);
		
		click(btnCreateLocator);
		
		Thread.sleep(2000);
		
		if(isDisplayed(registerPageLocator)) {
			click(radioBtnLocator);
			type("Admin",firstNameLocator);
			type("Administrador",lastNameLocator);
			type("AdminPass",passLocator);
			type("15",daysLocator);
			click(daysLocator);
			type("jan",monthsLocator);
			click(monthsLocator);
			type("2000",yearLocator);
			click(yearLocator);
			click(newsletterLocator);
			click(uniformLocator);
			type("N/A",companyLocator);
			type("N/A",adressLocator);
			type("Medellín",cityLocator);
			type("Alabama",stateLocator);
			type("00000",postCodeLocator);
			type("United States",countryLocator);
			type("4444444",phoneLocator);
			type("3010001111",phoneMobileLocator);
			clear(aliasLocator);
			type("AdminAdmin",aliasLocator);
			click(submitAccountBtnLocator);
			Thread.sleep(3000);
			
			//click(singOutLocator);
		}
		else {
			System.out.println("Register pages was not found");
		}		
	}
	 
	public String rMessage() {
		List<WebElement> notes = findElements(rMessage);
		return getText(notes.get(0));
	}
	

}
