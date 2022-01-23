# Creation d'un projet Java en IntelleJ

Dans le menu de IntelliJ, selectionnez File -> New -> Project

<img width="706" alt="image" src="https://user-images.githubusercontent.com/98129570/150686275-078066ce-7867-4873-b6cf-b26af54ef640.png">

Selectionnez la version de JDK

<img width="813" alt="image" src="https://user-images.githubusercontent.com/98129570/150686297-589c191b-c76c-4d68-b0e2-5be2ecaec6eb.png">

Puis, saisir le nom de votre projet

# Presentation TDD

Le TDD (Test Driven Development) est une pratique qui consiste à développer les tests avant d’écrire le code applicatif. De cette manière, les tests ne sont plus écrits en fonction du code, ce qui est le cas dans les processus actuels de développement. On évite ainsi de se retrouver dans la situation où, à cause de la manière dont l’application a été codée, on ne peut tester certaines parties.

Grâce au TDD, c’est au code de s’adapter aux tests, en travaillant de manière itérative jusqu’à arriver à un développement finalisé, testé à 100%


# Pourquoi les TDD

Le TDD présente également d’autres avantages : les tests fournissent une documentation sur comment le développeur a compris la fonctionnalité et l’application. Cette documentation sera constamment à jour, puisqu’elle sera complétée au fur et à mesure. Comme explicité plus haut, on a une meilleure couverture du code : on écrit les tests et le code en même temps et on est sûr d’avoir couvert le code.

La mise en place du TDD offre la possibilité de travailler en pair-programming : un développeur peut écrire les tests et un autre développe le code pour les passer. Ceci offre également l’opportunité de partager les connaissances sur les fonctionnalités entre les développeurs, évitant ainsi les blocages lors de l’absence de l’un d’entre eux.

Le TDD construit un référentiel de tests au fur et à mesure des itérations. Ainsi, il est maintenu tout au long de la durée de vie du projet. Sa complétude offre permet de faciliter grandement les tests de non-régression.

# Comment les mettre en place ?

Si on utilise la méthode de développement TDD, l’équipe projet suit le cycle suivant :

1 - On développe un test qui échoue volontairement, mais qui respecte les règles métiers définies.

2 - On rédige le code qui permet de passer le test.

3 - On refactorise le code.

<img width="702" alt="image" src="https://user-images.githubusercontent.com/98129570/150563591-45b0e162-813d-4e4c-a5d5-287aaa420718.png">


On itère ainsi jusqu’au développement complet de la fonctionnalité. A chaque ajout de test et de développements, on vérifie que tous les tests précédents sont validés. De cette manière, aucune régression n’est introduite par le développeur.


