# Définition 

*Builder* ou (Monteur) &est un design pattern de conception de création qui permet de construire des objects complexes étape par étape. Il permet de produire différentes variante ou représentation d'un objet en utilisant le même code de construction.

<img width="712" alt="image" src="https://user-images.githubusercontent.com/98129570/152418475-2b93a84c-cce3-4d56-904b-ba24e9adbdf4.png">

# Problème :(

Imaginez un objet complexe qui nécessite une initialisation fastidieuse, composée de plusieurs parties avec de nombreux champs et objets imbriqués. Le code d’initialisation va se retrouver dans un constructeur, enterré sous une pile monstrueuse de paramètres, ou encore pire : réparti un peu partout dans le code client.

<img width="712" alt="image" src="https://user-images.githubusercontent.com/98129570/152418528-72116948-8b82-4d5c-846e-9d4b0c466487.png">


Réfléchissons à la manière de modéliser un objet Maison. Pour fabriquer une *maison* de base, vous devez construire quatre murs et un sol, installer une porte, poser quelques fenêtres et bâtir un toit. Mais comment procéder si vous voulez une plus grande maison avec plus de lumière, un peu de terrain et autres commodités (un système de chauffage, de la plomberie et des câbles électriques) ?

La solution la plus simple est d’étendre la classe de base *Maison* et de créer un ensemble de sous-classes pour couvrir toutes les combinaisons de paramètres. Mais au bout d’un certain temps, vous allez vous retrouver avec un nombre considérable de sous-classes. Le moindre paramètre supplémentaire comme le style du porche par exemple, va encore plus développer la hiérarchie.

Voici une autre approche qui n’implique pas de générer des sous-classes : vous pouvez créer un constructeur géant dans la classe de base *Maison* avec tous les paramètres contrôlant l’objet *maison*. Cette solution élimine le besoin de sous-classes, mais entraîne un autre problème.

<img width="713" alt="image" src="https://user-images.githubusercontent.com/98129570/152418567-1bf630a7-d54c-4679-b460-2f2f51183810.png">


Dans la majorité des cas, la plupart des paramètres resteront inutilisés, rendant *l’appel au constructeur assez hideux*. Par exemple, le paramètre recensant les piscines se révèle inutile neuf fois sur dix, car peu de maisons en sont équipées.

# Solution :)

Le patron de conception monteur (Builder) propose d’extraire le code du constructeur d’objet de sa classe et de le déplacer dans des objets distincts appelés monteurs (builders).

<img width="713" alt="image" src="https://user-images.githubusercontent.com/98129570/152418611-d6aeec0d-4599-4736-ae3d-b4b2d3d0fe50.png">


Il organise la construction de l’objet à l’aide d’une série d’étapes (*construireMurs*, *construirePorte*, etc.). Pour créer un objet, vous allez effectuer une séquence d’étapes dans un objet monteur. Le gros avantage, c’est que vous n’avez pas besoin d’appeler toutes les étapes, mais seulement celles nécessaires à la création de la configuration particulière d’un objet.

Certaines étapes de la construction peuvent demander des implémentations variables en fonction des différentes représentations du produit. Par exemple, les murs d’une cabane peuvent être en bois, mais ceux d’un château seront en pierre.

Dans ce cas, vous pouvez créer plusieurs monteurs (builders) qui implémentent le même ensemble d’étapes de construction, mais d’une manière différente. Vous pouvez ensuite utiliser ces monteurs dans le processus de construction (c’est-à-dire une succession d’appels ordonnés des étapes) pour créer différents types d’objets.


Prenons un autre exemple : un premier monteur qui fabrique tout à partir de bois et de verre, un deuxième qui utilise de la pierre et du fer et un troisième qui se sert d’or et de diamants. En appelant les mêmes étapes, vous pouvez construire une maison avec le premier, un petit château avec le deuxième et un palais grâce au troisième. Mais tout ceci ne peut fonctionner que si le code client qui appelle les étapes de la construction peut interagir avec les monteurs via une interface commune.

# Directeur (Director)

Vous pouvez aller encore plus loin en prenant tous les appels aux étapes utilisées pour construire un produit, et en les mettant dans une classe séparée que l’on nomme directeur. La classe directeur va définir l’ordre d’exécution des différentes étapes et le monteur fournit les implémentations de ces étapes.

<img width="713" alt="image" src="https://user-images.githubusercontent.com/98129570/152418677-60963c62-de4d-4e62-b9ea-fc8c35e03629.png">


La classe directeur n’est pas obligatoire. Vous pouvez toujours appeler les étapes de construction dans un ordre spécifique depuis le code client. Cependant, la classe directeur se révèle idéale pour y placer les routines de construction et pouvoir les réutiliser ensuite dans votre programme.

De plus, le directeur cache au client les détails de la construction du produit. Le client doit juste associer un monteur avec un directeur, lancer la construction via le directeur, puis récupérer le résultat auprès du monteur.

<img width="945" alt="image" src="https://user-images.githubusercontent.com/98129570/152418706-23fae74e-6690-4424-9437-5e6f26988c36.png">


# Pseudo-code

Voici un exemple qui montre comment un Monteur peut réutiliser le même code de construction d’objet pour assembler différents types de produits comme des voitures, et créer leurs manuels respectifs.

<img width="714" alt="image" src="https://user-images.githubusercontent.com/98129570/152418754-4c658055-4577-4015-92b2-3a779f60ebe1.png">

Une voiture est un objet complexe. Elle peut être fabriquée de cent manières différentes. Plutôt que d’encombrer la classe Voiture avec un énorme constructeur, nous avons extrait le code dans une classe monteur séparée pour la voiture. Cette classe est composée d’un ensemble de méthodes pour configurer les différentes parties d’une voiture.

Si le code client veut assembler un modèle spécial de voiture bénéficiant d’un réglage de précision, il peut s’adresser directement au monteur. Il peut également déléguer l’assemblage à la classe directeur qui connait le processus de fabrication à indiquer au monteur pour les modèles de voitures les plus populaires.

Ce qui suit va peut-être vous choquer, mais chaque voiture doit posséder son propre manuel (franchement, qui les lit ?). Le manuel décrit toutes les fonctionnalités de la voiture et les détails vont varier selon les modèles. Il semble donc approprié de réutiliser un processus de construction existant pour les voitures et leurs manuels. Bien entendu, la création d’un manuel et d’une *voiture* sont deux procédés complètement différents et nous devons concevoir des monteurs spécialisés pour les manuels. Cette classe va implémenter les mêmes méthodes de construction que sa cousine assembleuse de voitures, mais au lieu de fabriquer des pièces de voitures, elle se contente de les décrire. Nous pouvons construire une voiture ou un manuel en passant ces monteurs au même objet directeur.

L’étape finale consiste à récupérer l’objet qui en résulte. Même si une voiture en métal et un manuel en papier sont directement liés, ce sont deux choses complètement différentes. Nous ne pouvons pas insérer une méthode pour récupérer les résultats dans le directeur sans le coupler aux classes concrètes du produit. Par conséquent, c’est le monteur qui effectue le travail qui nous donne ensuite le résultat.

