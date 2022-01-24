# Premier Exemple - Fail

Dans un premier temps, comme la méthode TDD le suggère, la classe de test est d'abord créé avant l'implémentation.

Voici le code :

<img width="813" alt="image" src="https://user-images.githubusercontent.com/98129570/150688125-1effb713-a81d-4576-abe7-048c81cb5018.png">

Le but est tout d'abord de tester que le type de compte est egale "CAURANT" et C'est pourquoi le nom de la méthode de test porte le nom testGetTypeCompte.
Les erreurs de compilation signalent que l'objet Compte n'existe pas. La méthode employée est donc la bonne, en écrivant les tests on considère que nous avons besoin de tel objet et méthode pour respecter une règle fonctionnelle. Ici, en l'occurrence il est nécessaire de disposer de l'objet Compte (qui sera créé par la suite)
