@alertdemo
Feature: Je souhaite tester le bouton AlertDemo et confirmer l alerte et recuperer le titre de la page 
  ETQ Je souhaite tester le bouton AlertDemo et confirmer l alerte et recuperer le titre de la page

  @alertdemo-caspassant
  Scenario: Je souhaite tester le bouton AlertDemo et confirmer l alerte et recuperer le titre de la page avec un cas passant
    Given Je me connecte a l application demoqa menu alerts
    When Je clique sur le bouton alertButton
    Then Je confirme l alerte
    And je recupere le titre de la page
