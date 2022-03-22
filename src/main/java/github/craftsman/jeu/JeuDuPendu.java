package main.java.github.craftsman.jeu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JeuDuPendu {
	
	private static int MAX_ESSAIS = 10;
	
	private char[] motSecret;
	private char[] lettresDecouvertes;
	private List<Character> lettresChoisies = new ArrayList<>();
	private int essais;
	
	/**
	 * Crée une instance du jeu en donnant le mot à trouver.
	 * 
	 * @param motSecret Le mot à découvrir
	 */
	public JeuDuPendu(String motSecret) {
		this.motSecret = motSecret.toCharArray();
		this.lettresDecouvertes = new char[this.motSecret.length];
		Arrays.fill(this.lettresDecouvertes, '-');
	}
	
    /**
     * Permet au joueur de proposer une lettre. 
     * Si la lettre n'a pas déjà été proposée, l'appel à cette méthode 
     * compte pour un essai.
     * 
     * @param lettre La lettre que le joueur propose
     * @return le nombre d'occurrences de la lettre dans le mot
     */
	public int proposer(char lettre) {
		int nbOccurences = 0;
		for(int i = 0; i < motSecret.length; ++i) {
			if (motSecret[i] == lettre) {
				lettresDecouvertes[i] = lettre;
				nbOccurences++;
			}
		}
		if (!lettresChoisies.contains(lettre)) {
			lettresChoisies.add(lettre);
			if (nbOccurences == 0) {
				++essais;
			}
		}
		return nbOccurences;
	}
	
    /**
     * @return Les lettres découvertes dans le mot.
     *         Les lettres inconnues sont remplacées par -
     *         Par exemple : bo-jo--
     */
	public String getLettresDecouvertes() {
		return String.valueOf(lettresDecouvertes);
	}
	
	/**
	 * @return Si le joueur a gagné, c'est-à-dire si 
	 *         toutes les lettres ont été découvertes
	 *         avant d'avoir épuisé le nombre d'essais.
	 */
	public boolean isGagne() {
		return ! isPerdu() && Arrays.equals(motSecret, lettresDecouvertes);
	}
	
	/**
	 * @return Si le joueur a perdu, c'est-à-dire s'il
	 *         ne peut plus faire de proposition.
	 */
	public boolean isPerdu() {
		return essais >= MAX_ESSAIS;
	}
}
