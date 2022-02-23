package PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import AbstractComponents.AbstractComponent;

public class FooterNav extends AbstractComponent {
	WebDriver driver;
	//Method to handle flights
	//When Selenium executes any method in this class - Scope of Selenium should be in footer only.
	
	By flights = By.cssSelector("[title='Flights']");
	
	public FooterNav(WebDriver driver, By sectionElement) {
		super(driver,sectionElement); //When you inherit parent class - you should invoke parent class constructor in your own child constructor.
	}

	public void selectFlight() 
	{
		System.out.println(findElement(flights).getAttribute("class"));
	}

}
