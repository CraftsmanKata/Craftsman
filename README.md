# Définition 

Factory (Fabrique) est un patron de conception de création qui définit une interface pour créer des objets dans une classe mère, mais délègue le choix des types d’objets à créer aux sous-classes.

image 1

# Problème :(

Imaginez que vous êtes en train de créer une application de gestion logistique. La première version de votre application ne propose que le transport par *camion*, la majeure partie de votre code est donc située dans la classe Camion.

Au bout d’un certain temps, votre application devient populaire et de nombreuses entreprises de transport maritime vous demandent tous les jours d’ajouter la gestion de la logistique maritime dans l’application.

Image 2

C’est super, n’est-ce pas ? Mais qu’en est-il du code ? La majeure partie est actuellement couplée à la classe *Camion*. Pour pouvoir ajouter des *Bateaux* dans l’application, il faudrait revoir la base du code. De plus, si vous décidez plus tard d’ajouter un autre type de transport dans l’application, il faudra effectuer à nouveau ces changements.

Par conséquent, vous allez vous retrouver avec du code pas très propre, rempli de conditions qui modifient le comportement du programme en fonction de la classe des objets de transport.


# Solution :)

Le patron de conception fabrique vous propose de remplacer les appels directs au constructeur de l’objet (à l’aide de l’opérateur *new*) en appelant une méthode fabrique spéciale. Pas d’inquiétude, les objets sont toujours créés avec l’opérateur *new*, mais l’appel se fait à l’intérieur de la méthode fabrique. Les objets qu’elle retourne sont souvent appelés produits.

Image 3

À première vue, cette modification peut sembler inutile : nous avons juste déplacé l’appel du constructeur dans une autre partie du programme. Mais maintenant, vous pouvez redéfinir la méthode fabrique dans la sous-classe et changer la classe des produits créés par la méthode.

Il y a tout de même une petite limitation : les sous-classes peuvent retourner des produits différents seulement si les produits ont une classe de base ou une interface commune. De plus, cette interface doit être le type retourné par la méthode fabrique de la classe de base.

Image 4

Par exemple, les classes *Camion* et *Bateau* doivent toutes les deux implémenter l’interface *Transport*, qui déclare une méthode *livrer*. Chaque classe implémente cette méthode à sa façon : les camions livrent par la route et les bateaux livrent par la mer. La méthode fabrique de la classe *LogistiqueRoute* retourne des camions, alors que celle de la classe *LogistiqueMer* retourne des bateaux.

Image 5

Le code qui appelle la méthode fabrique (souvent appelé le code client) ne fait pas la distinction entre les différents produits concrets retournés par les sous-classes, il les considère tous comme des *Transports* abstraits. Le client sait que tous les objets transportés sont censés avoir une méthode *livrer*, mais son fonctionnement lui importe peu.


# Diagramme de classe

Image 6

# Exercices 



