# Deuxieme Exemple - Pass

Dans le but de corriger les erreurs de compilation il faut créer les objets Compte avec le minimum d'information.


Voici les implémentation minimum pour l'objet Compte et TypeCompte :

# Compte

<img width="648" alt="image" src="https://user-images.githubusercontent.com/98129570/150644922-108ec4c1-b07f-46d1-8e1c-3bb6ffc09378.png">


# TypeCompte

<img width="648" alt="image" src="https://user-images.githubusercontent.com/98129570/150644943-ef7125b7-38e4-4d02-84bb-b924e184fe87.png">

Execution du test et constater qu'il échoue :

<img width="493" alt="image" src="https://user-images.githubusercontent.com/98129570/150645306-ae5f0e17-4866-4dda-a2fc-842be2326ecb.png">


Le test échoue et cela est normal car l'implémentation complète n'a pas encore été faite.

Le Type de compte est COURANT, un champ type de compte est créé et il est initialisé lors de la construction de l'objet à la bonne valeur.

Voici le code corrigé :

Capture d’écran 2022-01-22 à 17 06 22

On contrôle que les tests passent désormais :

Capture d’écran 2022-01-22 à 17 14 03

Nous continuons ainsi de la meme manier pour les autres methode

1 - Création des testes (Fail).

2 - Création de l'implimentation des testes pour quel passer.

3 - Amelioration de l'implemention.
