#language: fr

Fonctionnalité: Jouer au jeu du pendu

Plan du scénario: Proposer une lettre

  Étant donné que le mot à trouver est cucumber
  Quand le joueur propose la lettre <lettre>
  Alors la lettre est présente <occurrence> fois
  Et le mot est <mot>

Exemples:
 
 | lettre | occurrence |    mot   |
 |      c |          2 | c-c----- |
 |      u |          2 | -u-u---- |
 |      m |          1 | ----m--- |
 |      w |          0 | -------- |
 
Scénario: Le jeu continue si toutes les lettres ne sont pas trouvées

  Étant donné que le mot à trouver est cucumber
  Quand le joueur propose la lettre u
  Alors le joueur n'a pas gagné
  Mais le joueur n'a pas perdu

Scénario: Le jeu est fini si toutes les lettres ont été trouvées

  Étant donné que le mot à trouver est aaa
  Quand le joueur propose la lettre a
  Alors le joueur a gagné
  Et le joueur n'a pas perdu

Scénario: Le jeu est fini si toutes les lettres n'ont pas été trouvées au bout de 10 essais

  Étant donné que le mot à trouver est z
  Quand le joueur propose successivement les lettres a, b, c, d, e, f, g, h, i, j
  Alors le joueur a perdu
  Et le joueur n'a pas gagné

Scénario: Le joueur gagne s'il trouve toutes les lettres à partir du 10ième essai

  Étant donné que le mot à trouver est jour
  Quand le joueur propose successivement les lettres a, b, c, d, e, f, g, h, i, j, o, u, r
  Alors le joueur a gagné

Scénario: On peut proposer plusieurs fois la même lettre (non comptabilisée après la première fois)

  Étant donné que le mot à trouver est truc
  Quand le joueur propose successivement les lettres a, a, a, a, a, a, a, a, a, a, a, t, r, u, c
  Alors le joueur n'a pas perdu
  Et le joueur a gagné
  Et le mot est truc
