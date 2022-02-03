# Définition 

*Builder* ou (Monteur) &est un design pattern de conception de création qui permet de construire des objects complexes étape par étape. Il permet de produire différentes variante ou représentation d'un objet en utilisant le même code de construction.

Image 1

# Problème :(

Imaginez un objet complexe qui nécessite une initialisation fastidieuse, composée de plusieurs parties avec de nombreux champs et objets imbriqués. Le code d’initialisation va se retrouver dans un constructeur, enterré sous une pile monstrueuse de paramètres, ou encore pire : réparti un peu partout dans le code client.

image 2

Réfléchissons à la manière de modéliser un objet Maison. Pour fabriquer une *maison* de base, vous devez construire quatre murs et un sol, installer une porte, poser quelques fenêtres et bâtir un toit. Mais comment procéder si vous voulez une plus grande maison avec plus de lumière, un peu de terrain et autres commodités (un système de chauffage, de la plomberie et des câbles électriques) ?

La solution la plus simple est d’étendre la classe de base *Maison* et de créer un ensemble de sous-classes pour couvrir toutes les combinaisons de paramètres. Mais au bout d’un certain temps, vous allez vous retrouver avec un nombre considérable de sous-classes. Le moindre paramètre supplémentaire comme le style du porche par exemple, va encore plus développer la hiérarchie.

Voici une autre approche qui n’implique pas de générer des sous-classes : vous pouvez créer un constructeur géant dans la classe de base *Maison* avec tous les paramètres contrôlant l’objet *maison*. Cette solution élimine le besoin de sous-classes, mais entraîne un autre problème.


