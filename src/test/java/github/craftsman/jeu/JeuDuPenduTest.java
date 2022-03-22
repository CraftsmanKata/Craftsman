package github.craftsman.jeu;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, monochrome = true, plugin = {"pretty", "html:target/cucumber"})
public class JeuDuPenduTest {

}
