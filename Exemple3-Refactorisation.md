# Troisieme Exemple - Refactorisation

Dans la partie d'amélioration de code source, nous avons creé une enumeration "TypeCompte" qui va remplacer le type String. 

Le Type de compte est COURANT, un champ type de compte est créé et il est initialisé lors de la construction de l'objet à la bonne valeur.

Voici le code refactore :

<img width="703" alt="Capture d’écran 2022-01-22 à 17 06 22" src="https://user-images.githubusercontent.com/98129570/150646348-fc7065a3-5ae8-4862-8f6a-4f54ea7a951c.png">

# Type Compte

<img width="648" alt="image" src="https://user-images.githubusercontent.com/98129570/150691901-6c9f4c95-7ee7-4bfa-9fdb-b539d463f0ca.png">

On contrôle que les tests passent toujours sans modifier le test :

<img width="703" alt="Capture d’écran 2022-01-22 à 17 14 03" src="https://user-images.githubusercontent.com/98129570/150646641-7435061b-19b5-4730-9cb0-db06b07f7305.png">

Nous continuons ainsi de la meme manier pour les autres methode

1 - Création des testes (Fail).

2 - Création de l'implimentation des testes pour quel passer.

3 - Amelioration de l'implemention.

# Exercices

Ecrivez la methode *virement* qui permet de passer d'un virement du Compte A vers la Compte B, on respectant le mecanisme de TDD.
