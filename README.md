# Presentation BDD

Autrefois, la gestion de la qualité demandait plusieurs semaines pour contrôler les fonctionnalités d’un logiciel finalisé. Aujourd’hui, grâce à des tests automatisés lancés sur pression d’un simple bouton, il est aisé de vérifier si une application complexe remplit ses fonctions.

Le Behavior Driven Development ou BDD est une technique qui a le vent en poupe. Cette forme de développement de logiciel agile découle du Test Driven Development (TDD) et est considérée comme sa suite logique.

À la différence du TDD, le BDD considère les logiciels essentiellement du point de vue de l’utilisateur. Cette approche promeut une conception de logiciel globale et facilite la collaboration entre les développeurs, la gestion de la qualité et les clients.


# Qu’est-ce que le Behavior Driven Development ?

Avec la complexité croissante des applications logicielles, de plus en plus de méthodes de gestion de la qualité et de tests se développent.
 
C’est le seul moyen de vérifier de manière fiable la fonctionnalité des différents composants et de détecter immédiatement les erreurs On connaît depuis longtemps le développement piloté par les tests ou Test Driven Development (TDD).
 
Dans ce cas de figure, les développeurs développent en parallèle des tests unitaires ou des tests système adaptés.
 
Lors du processus de conception d’un logiciel, il est pertinent de ne pas seulement programmer, mais de faire participer également les membres de l’équipe ou les acteurs qui ne comprennent pas le code technique.
 
C’est ce que permet le Behavior Driven Development (BDD).
Lors du développement d’un logiciel agile, tous les participants au développement d’un programme peuvent définir le comportement souhaité d’un logiciel avant que le programmeur n’écrive le texte source, ceci grâce à des descriptions rédigées dans un langage facilement compréhensible, par exemple.
 
Cela signifie que le client pour lequel un logiciel est développé peut également prendre part à la modélisation.
 
Le BDD promeut la collaboration et assure une répartition des responsabilités.
Si cette méthode de développement de logiciel est bien utilisée, elle permet d’éviter des malentendus et génère, dans le meilleur des cas, un produit final de qualité.

# Comment fonctionne le Behavior Driven Development ?

Comme son nom l’indique, le Behavior Driven Development s’oriente vers le comportement que les logiciels doivent avoir. Grâce au langage ubiquitaire, qui signifie grossièrement « langage d’usage courant », les profanes peuvent également créer certaines descriptions de comportement. Le langage ubiquitaire est issu du Domain Driven Design (DDD), qui, comme le BDD, se concentre sur les domaines d’application. Les deux approches prennent en compte tous les domaines impliqués dans le processus de développement de logiciels et les relient entre eux indépendamment des frameworks, des langages de programmation ou des outils. Cela est rendu possible grâce à l’utilisation d’un langage unifié.

Cependant, le Behavior Driven Development n’est pas dépourvu d’outils ou de frameworks. En effet, pour que les cas de test que vous définissez soient traduits en code exécutable, quelques règles doivent être suivies. Par exemple, les descriptions dans le BDD ne sont pas rédigées en texte libre. En utilisant les outils BDD, tels que JBehave, Cucumber ou Behat, vous suivez une structure définie qui permet une implémentation fluide. L’utilisation de ces outils est beaucoup plus facile que l’apprentissage d’un langage de programmation classique. Découvrez les structures hiérarchiques que vous devez suivre dans le cadre du Behavior Driven Development :

Commencez par une analyse des besoins afin de définir les tâches, les objectifs et les fonctionnalités du logiciel. Demandez-vous, ou demandez à votre client, ce que le logiciel doit faire.
Une fois que vous avez identifié toutes les fonctionnalités, celles-ci sont décrites sous la forme de scénarios prédéfinis. Essayez de penser à toutes les situations possibles dans lesquelles le logiciel doit réagir avec une réponse précise.
L’étape suivante consiste à définir les réponses attendues pour chaque scénario dans un schéma de vérification (« étant donné-quand-alors »). « Étant donné » décrit le logiciel avant le test, « quand », l’action pendant le test et « alors » l’état du logiciel après le test.
Selon l’outil BDD utilisé, le vocabulaire peut légèrement varier. Certains outils proposent des variantes à la formulation « étant donné ». Ces outils sont disponibles pour les langages de programmation les plus courants, tels que Java, JavaScript, Python ou Ruby.


# Behavior Driven Development : étude de cas

Imaginez que vous vouliez créer une boutique en ligne facile à utiliser. Si le client s’est déjà enregistré dans votre boutique, les données utilisateurs doivent être enregistrées. Ainsi, il peut facilement se reconnecter sans avoir à indiquer à chaque fois ses données personnelles. Dans le langage Gherkin largement utilisé dans l’outil BDD Cucumber, la syntaxe correcte est la suivante :

** Fonctionnalité : un client existant doit pouvoir se connecter à son compte utilisateur avec ses données d’accès
   	Scénario : le client saisit les données d’accès correctes lors de la procédure de connexion
   		Étant donné que j’ai un compte utilisateur valide
   		Et que je me trouve sur la page de connexion du site Web
   		Quand j’entre mon adresse e-mail dans le champ prévu à cet effet
   		Et que j’entre mon mot de passe dans le champ prévu à cet effet
   		Et que je clique sur le bouton de connexion
   		Alors je devrais être automatiquement connecté **
   		
   		
L’exemple ci-dessus montre que grâce à l’ajout de « et », plusieurs conditions peuvent être posées simultanément et vos scénarios peuvent être complexifiés.

# Programmation pilotée par le comportement : ce qui différencie le BDD des autres procédures de test

Lors d’un test de logiciel, la programmation pilotée par le comportement se concentre sur la question « comment ». Les personnes concernées veulent savoir comment tester correctement le comportementd’un code, et non son implémentation. Lors d’un test unitaire, il s’agit de vérifier si une unité de code est correctement implémentée. Cette procédure de test porte donc sur le « quoi » et constitue un moyen rapide de trouver des bugs individuels. La réponse à la question « quand » (quand cela se passe) est donnée par le Test-Driven Development, qui est le processus d’exécution des tests. Ce processus peut également contenir des tests unitaires ou d’autres méthodes de test.

# Les avantages de BDD

  - Grâce au langage ubiquitaire idéal pour les débutants, aucune connaissance préalable n’est nécessaire
  - Meilleure communication entre les développeurs, les acteurs et la gestion de la qualité
  - Les scénarios tests servent de documentation pérenne et peuvent être adaptés facilement
  - L’accent est mis sur les utilisateurs finaux et la convivialité du logiciel
  
# Les inconvénients de BDD

  - Des spécifications mal rédigées compliquent le travail des développeurs
  - L’intégration d’acteurs allonge le temps de développement
  - La conversion au flux de travail BDD est complexe pour les codes existants
  

Bien qu’il vous soit possible d’appliquer chaque méthode de test de façon individuelle, la qualité de votre logiciel sera considérablement améliorée si vous utilisez plusieurs méthodes de test en combinaison. Le BDD assure un meilleur processus de rédaction des tests, et le TDD une batterie plus complète de tests.



