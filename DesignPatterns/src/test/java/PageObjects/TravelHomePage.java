package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PageComponents.FooterNav;
import PageComponents.NavigationBar;

public class TravelHomePage {
	By sectionElement = By.id("traveller-home");
	By footerNavSectionElement = By.id("buttons");
	WebDriver driver;
	
	public TravelHomePage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void goTo() 
	{
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	}

	public NavigationBar getNavigationBar() 
	{
		return new NavigationBar(driver,footerNavSectionElement);
	}

	public FooterNav getFooterNav() 
	{
		return new FooterNav(driver,sectionElement);
	}


}
