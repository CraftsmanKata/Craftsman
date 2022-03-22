# Cucumber

Cucumber est un framework pour l’implémentation de scénarios de type BDD (Behavior-Driven-Development). Dans ce chapitre, nous verrons en quoi consiste une approche BDD ainsi qu’une introduction à l’automatisation de scénarios avec Cucumber en Java. Enfin nous verrons comment valider une application Web en associant Cucumber et Selenium.


# Behavior-Driven-Development (BDD)

Le BDD (Behavior-Driven-Development) est une approche proposée par Dan North dans son article Introducing BDD. Le fondement du BDD est moins de raisonner en terme de tests que de comportements d’un système.

Un test fait le plus souvent référence à une interaction entre un utilisateur et un système. Le résultat de cette interaction doit être conforme à une exigence ou une expression de besoins. Le test est un formalisme pour valider le travail de développement.

L’approche BDD oblige à revoir la notion de test et d’expression de besoins. Par exemple, dans une approche agile (qui est à la base de l’approche BDD), une nouvelle fonctionnalité à ajouter dans un système est associée à un ensemble de critères d’acceptation avant que l’équipe ne la développe. Dan North propose de représenter autant que possible ces critères d’acceptation par des scénarios décrivant les comportements attendus du système. Pour faciliter la communication, il propose de suivre un formalisme simple pour écrire ces scénarios : Given, When, Then :

<img width="701" alt="image" src="https://user-images.githubusercontent.com/98129570/159477898-f26231fc-95ba-4edb-8323-293fb1cef7c8.png">

Soit en français :

<img width="701" alt="image" src="https://user-images.githubusercontent.com/98129570/159477936-12891098-caa2-4a83-a2a1-1f4ce39e026a.png">

Note :

   - Le formalisme du BDD reprend le principe du AAA des tests. L’étape Given correspond à la phase Arrange, l’étape When correspond à la phase Act et l’étape When correspond à la phase Assert.
  
En utilisant ce formalisme, les scénarios deviennent facilement communicables entre les développeurs, les experts fonctionnels et toutes les parties-prenantes dans la création de la solution. Les scénarios deviennent un support à la discussion et à la compréhension des fonctionnalités. Idéalement avec le BDD, la spécification du système est l’ensemble des scénarios définis.

De plus, en utilisant ce formalisme, il est possible de concevoir un outil capable d’analyser les scénarios et de les exécuter. On parle alors de spécification exécutable. Ainsi, les scénarios, bien qu’automatisés, demeurent écrits en langage naturel et sont facilement accessibles à l’ensemble des intervenants du projet.

Il ne faut pas voir le BDD comme une approche technique mais bien plutôt comme une manière d’organiser le développement logiciel différemment en repensant, d’une part, le lien entre expression de besoins et validation et, d’autre part, la communication entre les développeurs et les experts fonctionnels.

Plusieurs framework ont été proposés pour aider à réaliser ce type d’approche : FitNesse, JBehave (proposé par Dan North lui-même) et Cucumber. Cucumber est probablement le plus utilisé actuellement. Il a l’avantage de ne pas être lié à un seul langage de programmation car il a été porté pour plusieurs langages.

# Écrire des scénarios avec Cucumber

Cucumber permet de rédiger des scénarios en suivant un formalisme appelé le langage Gherkin. Les scénarios sont regroupés par fonctionnalité (feature). Ils sont écrits dans un simple fichier texte. Par défaut, Cucumber s’attend à ce que le fichier porte l’extension .feature.

Imaginons que nous voulions tester le jeu du pendu (the hangman en anglais). Nous pourrions écrire les scénarios suivant dans le fichier PlayHagman.feature :

Le fichier PlayHangman.feature 

<img width="701" alt="image" src="https://user-images.githubusercontent.com/98129570/159478001-ea77b605-8507-42ac-b2d7-1ae63ee08536.png">


Le fichier commence par le mot clé Feature suivi de deux points et de la description de la fonctionnalité. Puis viennent les scénarios. Chacun d’entre-eux commence par Scenario suivi de deux points et de son nom. Chaque scénario est constitué d’étapes (steps) commençant par Given, When``ou ``Then. Il est possible de séquencer plusieurs étapes en utilisant And. Nous pourrions donc fusionner les deux scénarios précédents en un seul :

Le fichier PlayHangman.feature

<img width="701" alt="image" src="https://user-images.githubusercontent.com/98129570/159478056-899272b3-330f-4553-b2c3-1e86e0678e80.png">

La caractère # peut être utilisé pour signifier un commentaire. Il est également possible de l’utiliser suivi d’un mot-clé pour donner une méta-information. Par exemple, Gherkin est disponible dans de nombreuses langues. Pour préciser la langue du fichier, on utilise #language :

Le fichier JeuDuPendu.feature en français

<img width="701" alt="image" src="https://user-images.githubusercontent.com/98129570/159478100-cacbe495-77f0-4200-8197-4e6bd5cc5fef.png">

La méta-information #language: fr en tête du fichier permet d’écrire les tests en français.

Chaque fonctionnalité est décrite par des scénarios dans son propre fichier portant l’extension .feature.

Note :
   
   - Gherkin supporte les variantes de la forme Etant donné que, Etant donné qu', Etant donné… Vous pouvez également utiliser Mais (But) plutôt que Alors quand cela est syntaxiquement plus correct.
   
   - Pour une présentation complète du langage Gherkin, consultez la documentation officielle :
   
   - https://cucumber.io/docs/gherkin/reference/

# Automatiser les scénarios en Java

Pour poursuivre notre exemple du jeu du pendu, nous partirons du principe que les développeurs ont créé la classe JeuDuPendu que nous allons valider grâce à nos scénarios :

Le fichier JeuDuPendu.java

<img width="701" alt="image" src="https://user-images.githubusercontent.com/98129570/159478197-949a74b3-2614-4715-aa7d-db25e10243b1.png">

Projet de démo : 
    Vous pouvez trouver un exemple plus complet dans ce projet qui contient tous les exemples de ce chapitre.

Pour automatiser les scénarios avec Cucumber, le plus simple est de les lancer avec Junit 4. Dans un projet Java géré avec Maven, on commence par ajouter les dépendances nécessaires :

Les dépendances Maven

<img width="701" alt="image" src="https://user-images.githubusercontent.com/98129570/159478242-92b39da4-91e4-4422-b51b-a2cdb60e24d6.png">

Pour exécuter les scénarios, nous avons besoin :

    - Des scénarios écrits dans des fichiers texte avec l’exentension .feature,

    - D’une ou plusieurs classes contenant l’implémentation à exécuter pour chaque étape (step) d’un scénario,

    - D’une classe permettant de lancer les scénarios avec JUnit.

# Les classes d’implémentation des étapes

Un scénario est découpé en étapes (steps). Chaque étape doit être associée à une méthode qui pourra être exécutée. Une telle méthode est publique et est annotée avec @Given, @When ou @Then. Même si ce n’est pas nécessaire, vous pouvez utiliser les annotations équivalentes dans la langue de vos scénarios. (par exemple, Cucumber fournit des annotations @Etantdonné, @Etantdonnéque, @Quand, @Alors).

Pour l’exemple du jeu du pendu, voici la classe d’implémentation des étapes :

La classe d’implémentation des étapes 

<img width="701" alt="image" src="https://user-images.githubusercontent.com/98129570/159478281-502d5ab2-857d-4fde-b900-3a6c0bc1847f.png">

Notez que ces méthodes utilisent les annotations pour préciser le texte de l’étape qu’elles représentent. Il est possible de paramétrer les étapes avec une notation de la forme {} donnant le type du paramètre.

     - {int} : Le paramètre est un entier
     - {float} : Le paramètre est un nombre à virgule
     - {word} : Le paramètre est un mot sans espace
     - {string} : Le paramètre est une chaîne de caractères délimitée par des apostrophes ou des guillemets
     - {} : Le paramètre est une chaîne de caractères et correspond à n’importe quelle valeur

Par exemple, à la ligne 14 de la classe, on associe la méthode une étape de la forme le mot à trouver est {word}. Cucumber se chargera d’extraire le mot apparaissant dans le scénario pour le passer en paramètre de la méthode.

Note :
 
   - Si vous préférez, vous pouvez associer les méthodes aux étapes en utilisant des expressions régulières. Les paramètres à extraire correspondent aux groupes définis dans votre expression.

Une classe définissant des méthodes d’étape agit le plus souvent comme une machine à état. Elle maintient en interne des attributs qui sont modifiés au fur et à mesure de l’appel aux méthodes. Remarquez que les méthodes annotées avec @Alors utilisent des assertions JUnit pour valider l’état courant.

Note :
   - Pour allez plus loin, vous pouvez consulter la documentation officielle :
     
   -  https://cucumber.io/docs/cucumber/cucumber-expressions/
     
   -  https://cucumber.io/docs/cucumber/api/
   
   
# La classe de lancement JUnit

La classe de lancement JUnit est très simple à écrire car elle ne contient aucun test particulier. Grâce à l’annotation @RunWith, elle déclare que le moteur JUnit doit utiliser Cucumber pour se lancer. On peut également utiliser l’annotation @CucumberOptions pour paramétrer l’exécution des scénarios.

La classe de lancement avec JUnit

<img width="701" alt="image" src="https://user-images.githubusercontent.com/98129570/159478335-5f0023bd-0f50-45df-a1c9-47d305e581ee.png">

Pour localiser les fichiers .feature et les classes fournissant l’implémentation des étapes, la règle par défaut est d’utiliser le même package que le package de la classe de lancement.

Pour l’exemple ci-dessus, toutes les classes dans le package dev.gayerie.jeu et définissant des étapes seront utilisées. Dans le répertoire Maven src/test/resources, tous les fichiers avec l’extension .feature présents dans le package dev.gayerie.jeu seront lus et exécutés.

Pour exécuter les scénarios associés, il suffit de lancer cette classe de test dans votre IDE ou de lancer la commande Maven :
 
<img width="701" alt="image" src="https://user-images.githubusercontent.com/98129570/159478369-8100ba12-cbe4-4846-85b8-45b031dc34d2.png">



