Feature: Toon alle maaltijden die op het menu staan

  Scenario: Alle maaltijden worden getoond
    Given dat er maaltijden op het menu staan
    When “Rafael” op het menu kijkt
    Then worden alle maaltijden getoond die op het menu staan

  Scenario: Er worden geen maaltijden getoond want er staan geen maaltijden op het menu
    Given er geen maaltijden op het menu staan
    When “Rafael” op het menu kijkt
    Then krijgt “Rafael” een melding dat er momenteel nog geen broodjes op het menu staan

