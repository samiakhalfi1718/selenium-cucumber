@logout
Feature: Je souhaite tester la fonctionnalite de deconnexion de l application Swag labs
  ETQ utilisateur je souhaite tester la fonctionnalite de deconnexion de l application Swag Labs

  Background: 
    Given Je me connecte a l application Swag Labs

  @deconnexionCasPassant
  Scenario: Je souhaite tester la fonctionnalite de deconnexion avec un cas passant
    And Je clique sur le burguer menu button
    And Je clique sur le bouton Logout
    Then Je me redirige vers la page login "Swag Labs"