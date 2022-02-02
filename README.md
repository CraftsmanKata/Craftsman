# Définition 

*Stratégie* est un patron de conception comportemental qui permet de définir une famille d’algorithmes, de les mettre dans des classes séparées et de rendre leurs objets interchangeables.

# On commence par le problème :(

Un beau jour, vous avez décidé de créer une application de navigation pour les voyageurs occasionnels. Vous l’avez développé avec une superbe carte comme fonctionnalité principale, qui aide les utilisateurs à s’orienter rapidement dans n’importe quelle ville.

La fonctionnalité la plus demandée était la planification d’itinéraire. Un utilisateur devrait pouvoir entrer une adresse et le chemin le plus rapide pour arriver à destination s’afficherait sur la carte.

La première version de l’application ne pouvait tracer des itinéraires que sur les routes. Les automobilistes étaient comblés. Mais apparemment, certaines personnes préfèrent utiliser d’autres moyens de locomotion pendant leurs vacances. Vous avez ajouté la possibilité de créer des trajets à pied dans la version suivante. Juste après cela, vous avez ajouté la possibilité d’utiliser les transports en commun dans les itinéraires.

Mais tout ceci n’était que le début. Vous avez continué en adaptant l’application pour les cyclistes, et plus tard, ajouté la possibilité de construire les itinéraires en passant par les attractions touristiques de la ville.


L’application a beau avoir très bien marché d’un point de vue financier, vous vous êtes arraché les cheveux sur le côté technique. Chaque fois que vous ajoutiez un nouvel algorithme pour tracer les itinéraires, la classe principale Navigateur doublait de taille. À un moment donné, la bête n’était plus possible à maintenir.

Que ce soit pour corriger un petit problème ou pour ajuster les scores des rues, la moindre touche apportée aux algorithmes impactait la totalité de la classe, augmentant les chances de créer des bugs dans du code qui fonctionnait très bien.

De plus, travailler en équipe n’était plus efficace. Les membres de votre équipe embauchés juste après la sortie et le succès de votre application se plaignaient de passer trop de temps à résoudre des problèmes de fusion. Ajouter une nouvelle fonctionnalité vous demandait de modifier une classe énorme, créant des conflits dans le code produit par les autres développeurs.

# La solution :)

Le patron de conception stratégie vous propose de prendre une classe dotée d’un comportement spécifique mais qui l’exécute de différentes façons, et de décomposer ses algorithmes en classes séparées appelées stratégies.

Image 1

La classe originale (le contexte) doit avoir un attribut qui garde une référence vers une des stratégies. Plutôt que de s’occuper de la tâche, le contexte la délègue à l’objet stratégie associé.

Le contexte n’a pas la responsabilité de la sélection de l’algorithme adapté, c’est le client qui lui envoie la stratégie. En fait, le contexte n’y connait pas grand-chose en stratégies, c’est l’interface générique qui lui permet de les utiliser. Elle n’expose qu’une seule méthode pour déclencher l’algorithme encapsulé à l’intérieur de la stratégie sélectionnée.

Le contexte devient indépendant des stratégies concrètes. Vous pouvez ainsi modifier des algorithmes ou en ajouter de nouveaux sans toucher au code du contexte ou aux autres stratégies.

<img width="753" alt="image" src="https://user-images.githubusercontent.com/98129570/152257183-0e0420af-f140-4e21-a465-e83d5ac8791f.png">


Dans notre application de navigation, chaque algorithme d’itinéraire peut être extrait de sa propre classe avec une seule méthode *tracerItinéraire*. La méthode accepte une origine et une destination, puis retourne une liste de points de passage.

Quand bien même les différentes classes itinéraire ne donneraient pas un résultat identique avec les mêmes paramètres, la classe navigateur principale ne se préoccupe pas de l’algorithme sélectionné, car sa fonction première est d’afficher les points de passage sur la carte. La classe navigateur possède une méthode pour changer la stratégie d’itinéraire active afin que ses clients (les boutons de l’interface utilisateur par exemple) puissent remplacer le comportement sélectionné par un autre.

<img width="236" alt="image" src="https://user-images.githubusercontent.com/98129570/152257165-5d5a97a0-867b-4aa6-8827-eb53f40abf01.png">


Imaginez que vous devez vous rendre à l’aéroport. Vous pouvez prendre le bus, appeler un taxi ou enfourcher votre vélo. Ce sont vos stratégies de transport. Vous pouvez sélectionner une de ces stratégies en fonction de certains facteurs, comme le budget ou les contraintes de temps.

On passe à l'implementation côte code source :)


# Exercices

Nous souhaitons développer un bouton *Save* permettant d'enregistrer un document au format 'DOC', 'DOCX' ou 'PDF'.
- Utilisez le design pattern Strategy pour mettre en œuvre les trois stratégies de sauvegarde.
