package github.craftsman.jeu;

import static org.junit.Assert.*;

import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Etantdonnéque;
import io.cucumber.java.fr.Quand;
import main.java.github.craftsman.jeu.JeuDuPendu;

public class JeuDuPenduSteps {
	
	private JeuDuPendu jeuDuPendu;
	private int nbOccurencesDerniereLettreProposee;
	
	@Etantdonnéque("le mot à trouver est {word}")
	public void leMotATrouver(String mot) {
		jeuDuPendu = new JeuDuPendu(mot);
	}

	@Quand("le joueur propose la lettre {word}")
	public void proposerLettre(String lettre) {
		nbOccurencesDerniereLettreProposee = jeuDuPendu.proposer(lettre.charAt(0));
	}
	
	@Quand("le joueur propose successivement les lettres {}")
	public void proposerLettres(String lettresProposees) {
		String[] lettres = lettresProposees.split(", ");
		for (String lettre : lettres) {
			proposerLettre(lettre);
		}
	}

	@Alors("la lettre est présente {int} fois")
	public void laLettreEstPresente(int nbFois) {
		assertEquals(nbFois, nbOccurencesDerniereLettreProposee);
	}

	@Alors("le mot est {}")
	public void leMotEst(String mot) {
		assertEquals(mot, jeuDuPendu.getLettresDecouvertes());
	}
	
	@Alors("le joueur a gagné")
	public void leJoueurAGagne() {
		assertTrue(jeuDuPendu.isGagne());
	}

	@Alors("le joueur n'a pas gagné")
	public void leJoueurNAPasGagne() {
		assertFalse(jeuDuPendu.isGagne());
	}

	@Alors("le joueur a perdu")
	public void leJoueurAPerdu() {
		assertTrue(jeuDuPendu.isPerdu());
	}

	@Alors("le joueur n'a pas perdu")
	public void leJoueurNAPasPerdu() {
		assertFalse(jeuDuPendu.isPerdu());
	}
}
