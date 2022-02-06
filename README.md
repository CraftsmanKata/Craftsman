# Définition 

Composite est un patron de conception structurel qui permet d’agencer les objets dans des arborescences afin de pouvoir traiter celles-ci comme des objets individuels.

![image](https://user-images.githubusercontent.com/98129570/152692976-6f4d439c-a32c-4fe3-97c6-bccaeac72e3b.png)

# Problème :(

L’utilisation de ce patron doit être réservée aux applications dont la structure principale peut être représentée sous la forme d’une arborescence.

Prenons les deux objets suivants : *Produits* et *Boîtes*. Une boîte peut contenir plusieurs produits ainsi qu’un certain nombre de boîtes plus petites. Ces petites boîtes peuvent également contenir quelques produits ou même d’autres boîtes encore plus petites, et ainsi de suite.

Vous décidez de mettre au point un système de commandes qui utilise ces classes. Les commandes peuvent être composées de produits simples sans emballage, d’autres boîtes remplies de produits... et d’autres boîtes. Comment allez-vous déterminer le coût total d’une telle commande ?

<img width="713" alt="image" src="https://user-images.githubusercontent.com/98129570/152693128-d5427126-da1d-4470-9196-f1fa5b0a5550.png">

Vous pouvez tenter l’approche directe qui consiste à déballer toutes les boîtes, prendre chaque produit et en faire la somme pour obtenir le total. Ce mode de calcul peut facilement se mettre en place dans le monde réel mais dans un programme, ce n’est pas aussi simple que de créer une boucle. Il faut connaître à l’avance la classe des Produits et des Boîtes que l’on parcourt, le niveau d’imbrication des boîtes ainsi que d’autres détails. Tout ceci rend l’approche directe assez compliquée et même parfois impossible.

# Solution :)

Le patron de conception composite vous propose de manipuler les Produits et les Boîtes à l’aide d’une interface qui déclare une méthode de calcul du prix total.

Comment cette méthode peut-elle fonctionner ? Pour un produit, on retourne simplement son prix. Pour une boîte, on parcourt chacun de ses objets, on leur demande leur prix, puis on retourne un total pour la boîte. Si l’un de ces objets est une boîte plus petite, cette dernière va aussi parcourir son propre contenu et ainsi de suite, jusqu’à ce que tous les prix aient été calculés. Une boîte peut même ajouter des frais supplémentaires, comme le prix de l‘emballage.

<img width="713" alt="image" src="https://user-images.githubusercontent.com/98129570/152693209-b409f9cf-698f-4e83-969c-78a4f93aecea.png">

La cerise sur le gâteau est que vous n’avez même pas besoin de connaître la classe concrète des objets de l’arborescence. Vous n’avez pas besoin de savoir si un objet est un produit tout simple ou une boîte sophistiquée, vous les manipulez de la même manière grâce à une interface commune. Lorsque vous faites appel à une méthode, les objets s’occupent de faire transiter la requête en descendant vers les feuilles de l’arbre.

# D'autre exemple

<img width="713" alt="image" src="https://user-images.githubusercontent.com/98129570/152693225-a7f27536-919a-441b-abc1-46e877f1a49d.png">


En général, les armées d’un pays sont structurées en hiérarchies. Une armée comporte plusieurs divisions, une division est composée de brigades, une brigade est composée de compagnies, qui peuvent elles-mêmes être divisées en escouades. Pour finir, une escouade est un petit groupe de soldats. Les ordres sont donnés au sommet de la hiérarchie et passés au niveau directement inférieur à chaque soldat, qui sait quoi en faire.

# Structure

<img width="896" alt="image" src="https://user-images.githubusercontent.com/98129570/152693297-b8b00d97-de44-47a9-a9f7-20cbe742d47f.png">




