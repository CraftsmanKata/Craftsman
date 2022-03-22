package test.java.github.craftsman.duckduckgo;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPage {

	private WebDriver webDriver;

	public ResultPage(WebDriver webDriver) {
		this.webDriver = webDriver;
		assertTrue("Titre de page inattendu " + webDriver.getTitle(), webDriver.getTitle().endsWith("at DuckDuckGo"));
	}

	public boolean isLinkPresent(String link) {
		return ! webDriver.findElements(By.partialLinkText(link)).isEmpty();
	}
}
