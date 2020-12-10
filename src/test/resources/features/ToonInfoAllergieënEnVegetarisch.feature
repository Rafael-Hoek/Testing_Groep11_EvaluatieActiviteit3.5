Feature: Informatie over allergieën en al dan niet vegetarisch moet getoond worden

  Scenario: Informatie over allergieën of vegetarische broodjes worden getoond op het menu
    Given dat er maaltijden op het menu staan
    When “Rafael” op het menu kijkt
    Then ziet “Rafael” welke broodjes vegetarisch zijn en welke broodjes een allergische reactie kunnen veroorzaken

  Scenario: Er wordt een maaltijd zonder allergieën getoond
    Given dat er een maaltijd zonder allergieën op het menu staat
    When “Rafael” naar deze maaltijd kijkt
    Then krijgt “Rafael” te zien dat de maaltijd geen allergieën bevat
