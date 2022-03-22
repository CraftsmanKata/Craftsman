#language: fr

Fonctionnalité: Référencement sur le moteur de recherche DuckDuckGo

Scénario: Le site de cucumber apparaît dans la première page de résultats de DuckDuckGo

  Étant donné que l'utilisateur est sur la page d'accueil de DuckDuckGo
  Quand il saisit le mot-clé cucumber
  Et qu'il lance la recherche
  Alors la page de résultats contient un lien sur le site https://cucumber.io

Scénario: Le site de selenium apparaît dans la première page de résultats de DuckDuckGo

  Étant donné que l'utilisateur est sur la page d'accueil de DuckDuckGo
  Quand il saisit le mot-clé selenium
  Et qu'il lance la recherche
  Alors la page de résultats contient un lien sur le site https://www.selenium.dev
