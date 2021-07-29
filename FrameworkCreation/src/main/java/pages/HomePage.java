package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;

	private By formAuthenticationLink = By.linkText("Form Authentication");  //used encapsulation
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public LoginPage clickformAuthentication()
	{
		driver.findElement(formAuthenticationLink).click();
		return new LoginPage(driver);
	}

}

