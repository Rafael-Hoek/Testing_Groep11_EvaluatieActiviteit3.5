Feature: Maaltijden worden gegroepeerd per categorie

  Scenario: De maaltijden worden gegroepeerd per categorie
    Given dat er maaltijden op het menu staan
    When “Rafael” op het menu kijkt
    Then worden alle maaltijden getoond, gegroepeerd per categorie
