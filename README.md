# Définition 

Factory (Fabrique) est un patron de conception de création qui définit une interface pour créer des objets dans une classe mère, mais délègue le choix des types d’objets à créer aux sous-classes.

<img width="738" alt="image" src="https://user-images.githubusercontent.com/98129570/153080089-612e17c6-4b09-421b-a0ca-725d2190a7d1.png">

# Problème :(

Imaginez que vous êtes en train de créer une application de gestion logistique. La première version de votre application ne propose que le transport par *camion*, la majeure partie de votre code est donc située dans la classe Camion.

Au bout d’un certain temps, votre application devient populaire et de nombreuses entreprises de transport maritime vous demandent tous les jours d’ajouter la gestion de la logistique maritime dans l’application.

<img width="738" alt="image" src="https://user-images.githubusercontent.com/98129570/153080149-bf6780fc-7c9f-4bba-81d0-e6057a2d9d5f.png">


C’est super, n’est-ce pas ? Mais qu’en est-il du code ? La majeure partie est actuellement couplée à la classe *Camion*. Pour pouvoir ajouter des *Bateaux* dans l’application, il faudrait revoir la base du code. De plus, si vous décidez plus tard d’ajouter un autre type de transport dans l’application, il faudra effectuer à nouveau ces changements.

Par conséquent, vous allez vous retrouver avec du code pas très propre, rempli de conditions qui modifient le comportement du programme en fonction de la classe des objets de transport.


# Solution :)

Le patron de conception fabrique vous propose de remplacer les appels directs au constructeur de l’objet (à l’aide de l’opérateur *new*) en appelant une méthode fabrique spéciale. Pas d’inquiétude, les objets sont toujours créés avec l’opérateur *new*, mais l’appel se fait à l’intérieur de la méthode fabrique. Les objets qu’elle retourne sont souvent appelés produits.

<img width="738" alt="image" src="https://user-images.githubusercontent.com/98129570/153080181-a8f8a9c5-1622-4ec9-8ccf-c16b6907fb8c.png">


À première vue, cette modification peut sembler inutile : nous avons juste déplacé l’appel du constructeur dans une autre partie du programme. Mais maintenant, vous pouvez redéfinir la méthode fabrique dans la sous-classe et changer la classe des produits créés par la méthode.

Il y a tout de même une petite limitation : les sous-classes peuvent retourner des produits différents seulement si les produits ont une classe de base ou une interface commune. De plus, cette interface doit être le type retourné par la méthode fabrique de la classe de base.

<img width="738" alt="image" src="https://user-images.githubusercontent.com/98129570/153080217-cf97210f-e026-4b02-974a-e789425281f3.png">


Par exemple, les classes *Camion* et *Bateau* doivent toutes les deux implémenter l’interface *Transport*, qui déclare une méthode *livrer*. Chaque classe implémente cette méthode à sa façon : les camions livrent par la route et les bateaux livrent par la mer. La méthode fabrique de la classe *LogistiqueRoute* retourne des camions, alors que celle de la classe *LogistiqueMer* retourne des bateaux.

<img width="738" alt="image" src="https://user-images.githubusercontent.com/98129570/153080241-e6a33abc-0ac9-411d-9eda-9cee54ba475d.png">


Le code qui appelle la méthode fabrique (souvent appelé le code client) ne fait pas la distinction entre les différents produits concrets retournés par les sous-classes, il les considère tous comme des *Transports* abstraits. Le client sait que tous les objets transportés sont censés avoir une méthode *livrer*, mais son fonctionnement lui importe peu.


# Diagramme de classe

<img width="655" alt="image" src="https://user-images.githubusercontent.com/98129570/153092089-08e8f1df-8d59-43ec-ae03-53c9889d0aed.png">

Comme vous pouvez voir ci-dessus, afin de créer notre Fabrique, nous avons besoin de 4 éléments :

- Une fabrique générique : Elle contient toutes les méthodes nécessaires à la création d'un produit
- Une fabrique : Elle va créer le produit souhaité
- Un produit : Le produit créé par la fabrique, dérivant du produit générique
- Un produit générique : Le produit d'origine, contenant toutes les méthodes permettant de réaliser les actions associées

Ainsi, nous détachons la création des objets de l'utilisation, ce qui permet d'éviter une certaine redondance au niveau de la programmation.

Nous pouvons voir aussi que le fait de passer par des classes filles pour créer différents objets permet de répondre au principe DIP, qui consiste à dire que *les objets de forte valeur métier ne doivent pas dépendre des objets de faible valeur métier*

# Exercices 



