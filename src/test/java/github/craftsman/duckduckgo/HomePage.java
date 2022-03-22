package test.java.github.craftsman.duckduckgo;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private WebDriver webDriver;

	public HomePage(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public HomePage open() {
		webDriver.navigate().to("https://duckduckgo.com");
		assertTrue("Titre de page inattendu " + webDriver.getTitle(), webDriver.getTitle().startsWith("DuckDuckGo"));
		return this;
	}

	public static HomePage openWith(WebDriver webDriver) {
		HomePage homePage = new HomePage(webDriver);
		homePage.open();
		return homePage;
	}

	public HomePage enterKeywords(String... words) {
		WebElement searchInput = webDriver.findElement(By.name("q"));
		searchInput.sendKeys(String.join(" ", words));
		return this;
	}

	public ResultPage clickOnSearch() {
		WebElement searchButton = webDriver.findElement(By.id("search_button_homepage"));
		searchButton.click();
		return new ResultPage(webDriver);
	}
}
