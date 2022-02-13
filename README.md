# Définition 

L’Adaptateur est un patron de conception structurel qui permet de faire collaborer des objets ayant des interfaces normalement incompatibles.

Image 1

# Problème :(

Imaginez que vous êtes en train de créer une application de surveillance du marché boursier. L’application télécharge des données de la bourse depuis diverses sources au format XML et affiche ensuite de jolis graphiques et diagrammes destinés à l’utilisateur.

Après un certain temps, vous décidez d’améliorer l’application en intégrant une librairie d’analyse externe. Mais il y a un hic ! Cette librairie ne fonctionne qu’avec des données au format JSON.

Image 2

Vous pourriez modifier la librairie afin qu’elle accepte du XML, mais vous risquez de faire planter d’autres parties de code qui utilisent déjà cette librairie. Ou alors, vous n’avez tout simplement pas accès au code source de la librairie, rendant la tâche impossible.

# Solution :)

Vous créez un adaptateur. C’est un objet spécial qui convertit l’interface d’un objet afin qu’un autre objet puisse le comprendre.

Un adaptateur encapsule un des objets afin de masquer la complexité de la conversion, exécutée à l’ombre des regards. L’objet encapsulé n’a pas conscience de ce que fait l’adaptateur. Par exemple, vous pouvez encapsuler un objet qui calcule en mètres et en kilomètres avec un adaptateur qui effectue la conversion de toutes les données en unités impériales comme les pieds et les milles.

Les adaptateurs peuvent non seulement effectuer des conversions dans différents formats, mais ils peuvent également aider différentes interfaces à collaborer. Le fonctionnement de l’adaptateur est le suivant :

1 - L’adaptateur prend une interface compatible avec un des objets existants.
2 - L’objet existant peut appeler les méthodes de l’adaptateur via cette interface en toute sécurité.
3 - Lorsque l’adaptateur reçoit un appel, il passe la requête au second objet dans un format et dans un ordre qu’il peut interpréter.

Il est même parfois possible de créer un adaptateur qui peut convertir dans les deux sens !

Image 3

Retournons à notre application de surveillance du marché boursier. Pour résoudre le problème des formats incompatibles, vous pouvez créer des adaptateurs XML vers JSON pour chaque classe de la librairie que notre code veut utiliser. Vous n’avez plus qu’à ajuster votre code pour communiquer avec la librairie à l’aide de ces adaptateurs. Lorsqu’un adaptateur reçoit un appel, il convertit les données XML en une structure JSON. Il renvoie ensuite l’appel à la méthode appropriée dans un objet d’analyse encapsulé.

# D'autre exemple

Image 4

Si vous voyagez aux États-Unis pour la première fois, vous allez avoir une petite surprise lorsque vous allez essayer de brancher votre ordinateur portable. Les câbles et prises de courant sont différents dans les autres pays : les câbles français ne rentrent pas dans les prises américaines. Ce problème peut être résolu en utilisant un adaptateur qui accepte un câble européen d’un côté et une prise américaine de l’autre.


# Diagramme de classe

Cette implémentation a recours au principe de composition : l’adaptateur implémente l’interface d’un objet et en encapsule un autre. Elle peut être utilisée dans tous les langages de programmation classiques.

Image 5


# Exercices 



