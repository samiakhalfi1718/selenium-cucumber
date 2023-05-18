@login
Feature: Je souhaite tester la page de la connexion de l application Swag labs
  ETQ utilisateur je souhaite tester la page de la connexion de l application Swag Labs

  @connexion-CasPassant
  Scenario: Je souhaite tester la page de la connexion avec un cas passant
    Given Je me connecte a l application Swag Labs
    Then Je me redirige vers la page Home "Products"

  @login_casNonPassant
  Scenario: Je souhaite tester la page connexion avec un cas non passant
    Given Je me connecte sur l application Swag Labs
    When Je saisi le username "samia"
    When Je saisi le password "samia123"
    When Je clique sur le bouton login
    Then Le message d erreur s affiche "Epic sadface: Username and password do not match any user in this service"
