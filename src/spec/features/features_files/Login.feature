@login
Feature: Je souhaite tester la page de la connexion de l application Swag labs
  ETQ utilisateur je souhaite tester la page de la connexion de l application Swag Labs

  @connexion-CasPassant
  Scenario: Je souhaite tester la page de la connexion avec un cas passant
    Given Je me connecte a l application Swag Labs
    When Je saisi le username "standard_user"
    And Je saisi le password "secret_sauce"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page Home "Products"