package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import PageObjects.TravelHomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
	
	@Test
	public void flightTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		TravelHomePage travelHomePage = new TravelHomePage(driver);
		travelHomePage.goTo();
		travelHomePage.getFooterNav().selectFlight();
		travelHomePage.getNavigationBar().selectFlight();
	}
}
