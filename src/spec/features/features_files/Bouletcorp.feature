@bouletcorp
Feature: Je souhaite tester le bouton aleatoire de lapplication bouletcorp
  En tant qu’utilisateur je me rends sur http://www.bouletcorp.com

  @bouletcorp
  Scenario: Je souhaite tester le bouton aleatoire de lapplication bouletcorp
    Given Je me connecte sur lapplication bouletcorp
    When Je clique sur aleatoire
    Then la page change
    And les widgets facebook twitter et tumblr sont bien affiches
