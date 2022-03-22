package test.java.github.craftsman.duckduckgo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Etantdonnéque;
import io.cucumber.java.fr.Quand;

public class DuckDuckGoSteps {
	
	private WebDriver webDriver;
	private HomePage homePage;
	private ResultPage resultPage;
	
	@Before
	public void createWebDriver() {
		webDriver = new ChromeDriver();
	}
	
	@After
	public void quitWebDriver() {
		webDriver.quit();
	}

	@Etantdonnéque("l'utilisateur est sur la page d'accueil de DuckDuckGo")
	public void utilisateurSurLaPageDAccueil() {
		homePage = HomePage.openWith(webDriver);
	}
	
	@Quand("il saisit le mot-clé {word}")
	public void ilSaisit(String motCle) {
		assertNotNull("La page de recherche n'est pas disponible", homePage);
		homePage.enterKeywords(motCle);
	}
	
	@Quand("il lance la recherche")
	public void ilLanceLaRecherche() {
		assertNotNull("La page de recherche n'est pas disponible", homePage);
		resultPage = homePage.clickOnSearch();
		homePage = null;
	}
	
	@Alors("la page de résultats contient un lien sur le site {}")
	public void laPageDeResultatContient(String site) {
		assertNotNull("La page de résultats n'est pas disponible", resultPage);
		assertTrue("Pas de résultat pour " + site, resultPage.isLinkPresent(site));
	}

}
