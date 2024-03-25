Feature: To validate the login page of poshmark
  Scenario: To validate the home page of poshmark
    Given user shoud be in poshmark
    When user shoud click continue with google
    And user shoud click next button
    Then user shoud be in login page
