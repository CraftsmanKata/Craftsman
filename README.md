# Définition 

L’Adaptateur est un patron de conception structurel qui permet de faire collaborer des objets ayant des interfaces normalement incompatibles.

<img width="752" alt="image" src="https://user-images.githubusercontent.com/98129570/153757868-183bce0c-33da-46a0-acbb-707eaa3f9156.png">

# Problème :(

Imaginez que vous êtes en train de créer une application de surveillance du marché boursier. L’application télécharge des données de la bourse depuis diverses sources au format XML et affiche ensuite de jolis graphiques et diagrammes destinés à l’utilisateur.

Après un certain temps, vous décidez d’améliorer l’application en intégrant une librairie d’analyse externe. Mais il y a un hic ! Cette librairie ne fonctionne qu’avec des données au format JSON.

<img width="752" alt="image" src="https://user-images.githubusercontent.com/98129570/153757880-81afc05e-c94d-422d-bded-976d6f8b87a4.png">


Vous pourriez modifier la librairie afin qu’elle accepte du XML, mais vous risquez de faire planter d’autres parties de code qui utilisent déjà cette librairie. Ou alors, vous n’avez tout simplement pas accès au code source de la librairie, rendant la tâche impossible.

# Solution :)

Vous créez un adaptateur. C’est un objet spécial qui convertit l’interface d’un objet afin qu’un autre objet puisse le comprendre.

Un adaptateur encapsule un des objets afin de masquer la complexité de la conversion, exécutée à l’ombre des regards. L’objet encapsulé n’a pas conscience de ce que fait l’adaptateur. Par exemple, vous pouvez encapsuler un objet qui calcule en mètres et en kilomètres avec un adaptateur qui effectue la conversion de toutes les données en unités impériales comme les pieds et les milles.

Les adaptateurs peuvent non seulement effectuer des conversions dans différents formats, mais ils peuvent également aider différentes interfaces à collaborer. Le fonctionnement de l’adaptateur est le suivant :

1 - L’adaptateur prend une interface compatible avec un des objets existants.
2 - L’objet existant peut appeler les méthodes de l’adaptateur via cette interface en toute sécurité.
3 - Lorsque l’adaptateur reçoit un appel, il passe la requête au second objet dans un format et dans un ordre qu’il peut interpréter.

Il est même parfois possible de créer un adaptateur qui peut convertir dans les deux sens !

<img width="752" alt="image" src="https://user-images.githubusercontent.com/98129570/153757905-2af24602-ef11-48d6-95e9-4a3c50455123.png">

Retournons à notre application de surveillance du marché boursier. Pour résoudre le problème des formats incompatibles, vous pouvez créer des adaptateurs XML vers JSON pour chaque classe de la librairie que notre code veut utiliser. Vous n’avez plus qu’à ajuster votre code pour communiquer avec la librairie à l’aide de ces adaptateurs. Lorsqu’un adaptateur reçoit un appel, il convertit les données XML en une structure JSON. Il renvoie ensuite l’appel à la méthode appropriée dans un objet d’analyse encapsulé.

# D'autre exemple

![image](https://user-images.githubusercontent.com/98129570/153758091-c647a8b4-6d0d-4975-8f15-3292ed51e173.png)

Si vous voyagez aux États-Unis pour la première fois, vous allez avoir une petite surprise lorsque vous allez essayer de brancher votre ordinateur portable. Les câbles et prises de courant sont différents dans les autres pays : les câbles français ne rentrent pas dans les prises américaines. Ce problème peut être résolu en utilisant un adaptateur qui accepte un câble européen d’un côté et une prise américaine de l’autre.


# Diagramme de classe

Cette implémentation a recours au principe de composition : l’adaptateur implémente l’interface d’un objet et en encapsule un autre. Elle peut être utilisée dans tous les langages de programmation classiques.

<img width="839" alt="image" src="https://user-images.githubusercontent.com/98129570/153757933-4b8f028a-c2e4-4811-966e-5d13be2618f2.png">

# Pseudo-code

Considérez un scénario dans lequel il existe une application développée aux États-Unis qui renvoie la vitesse maximale des voitures de luxe en miles par heure (MPH). Nous devons maintenant utiliser la même application pour notre client au Royaume-Uni qui veut les mêmes résultats mais en kilomètres par heure (km/h).

Pour résoudre ce problème, nous allons créer un adaptateur qui convertira les valeurs et nous donnera les résultats souhaités :

![image](https://user-images.githubusercontent.com/98129570/153762868-9e74c1f1-5df0-40cb-8346-e1477f53a3c5.png)


# Exercices 



