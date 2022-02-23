package PageComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import AbstractComponents.AbstractComponent;

public class NavigationBar extends AbstractComponent {
	
	public NavigationBar(WebDriver driver, By sectionElement) 
	{
		super(driver, sectionElement);
	}

	By flights = By.cssSelector("[title='Flights']");
	
	public void selectFlight() 
	{
		System.out.println(findElement(flights).getAttribute("class"));
	}
}
