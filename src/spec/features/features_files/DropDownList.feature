@dropdownlist
Feature: Je souhaite tester le DropDownList

  Background: Given Je me connecte a lapplication dropdownlist

  @dropdownlist-byindex
  Scenario: Title of your scenario
    Given Je me connecte a lapplication dropdownlist
    When Je selectionne lindexe
    Then Je constate la valeur attendu

  @dropdownlist-byvaleur
  Scenario: Title of your scenario
    When Je selectionne la valeur
    Then Je constate la valeur attendu

  @dropdownlist-byVisibleText
  Scenario: Title of your scenario
    When Je selectionne le texte souhaite
    Then Je constate la valeur attendu
    