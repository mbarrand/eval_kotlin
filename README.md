# Evaluation Kotlin

L'API choisie au début fut l'API valorant du site https://dash.valorant-api.com/
Or, j'ai eu beaucoup de problème avec celle-ci et ai décidé de continuer avec des données mockées.

Les fonctionnalités implémentées sont les suivantes : 
- Affichage de la liste des characters sur le main screen
- Card clickable pour obtenir les détails du character
- Second screen pour avoir les détails du character
- Navigation entre les screens
- Ecran scrollable


Les fonctionnalités tentées mais échouées... : 
- Ajout d'un son et d'une vibration au clic
- Gestion des langues anglaises et françaises
- Implémentation du mode nuit
      - Création des colors mais problème avec les thèmes light et dark (non reconnaissance des primary/secondary colors)



L'architecture du projet : 
Nom de l'application evalkotlin
data
  - model
      - Ability
      - Character
  - repository
      - CharacterRepository
ui
  - composables
      - CharacterCard 
  - screen
      - CharacterDetailScreen
      - CharacterListScreen 
  - theme
      - Color
      - Theme
      - Type
Navigation    
   - NavigationGraph
MainActivity



PS :
Je tiens à préciser ma frustration lors de cette évaluation. 
