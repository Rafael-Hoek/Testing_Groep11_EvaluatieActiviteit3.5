Feature: Toon de prijs voor elke maaltijd

  Scenario: De prijs wordt getoond van elke maaltijd
    Given dat er maaltijden op het menu staan
    When “Rafael” op het menu kijkt
    Then worden alle maaltijden die op het menu staan met hun prijs getoond