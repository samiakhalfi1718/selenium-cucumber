@button-click
Feature: Je souhaite tester les bouttons
  Je souhaite tester les bouttons 
  
  background
  Given Je me connecte a l application demoqa menu boutton

  @doubleclick
  Scenario: Je souhaite tester le boutton double clique
    When Je clique sur le bouton double click
    Then Le message de confirmation doubleclick "You have done a double click"

  @rightclick
  Scenario: Je souhaite tester le boutton clique droite
    When Je clique sur le bouton right click
    Then Le message de confirmation rightclick "You have done a right click"