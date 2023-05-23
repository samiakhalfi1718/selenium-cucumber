@draganddrop
Feature: Je souhaite tester la fonctionnalite draganddrop de la page demoqa
  Je souhaite tester la fonctionnalite draganddrop de la page demoqa

  @draganddrop
  Scenario: Je souhaite tester la fonctionnalite draganddrop de la page demoqa
    Given Je me connecte a l application demoqa menu drag and drop
    When Je glisse lelement et je la depose dans l enplacement prevus
    Then Je verifie le texte change dans le dropped
