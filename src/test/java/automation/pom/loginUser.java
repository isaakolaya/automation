package automation.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginUser extends Base{
	
	By singInLocator = By.linkText("Sign in");
	By singInPageLocator = By.xpath("//*[@id=\"login_form\"]/h3");
	
	By emailLoginLocator = By.cssSelector("input[name='email']");
	By passwdLoginLocator = By.cssSelector("input[name='passwd']");
	By SubmitLoginLocator = By.id("SubmitLogin");
	
	By accountLocator = By.xpath("//*[@id=\"center_column\"]/p");
	
	public loginUser(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void singInUser() throws InterruptedException {
		
		click(singInLocator);
		
		Thread.sleep(2000);
		
		
		if(isDisplayed(singInPageLocator)) {
			
			type("AdminIOH5@gmail.com",emailLoginLocator);
			
			type("AdminPass",passwdLoginLocator);
			
			Thread.sleep(2000);
			
			click(SubmitLoginLocator);			
			
		}
		else {
			System.out.print("Username does not exist");
		}
	}
	
	public boolean accountDisplayed() {
		return isDisplayed(accountLocator);
	}
}	

