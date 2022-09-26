Feature: Show App Components

  Scenario: Successful Loading of Home Screen
    Given the application is running
    Then user expects to see a welcome message

  Scenario: Successful opening of settings menu
    Given the application is running
    When user opens the settings menu
    Then user expects to see settings menu

  Scenario: Successful sending of mail
    Given the application is running
    When the user click the mail button
    Then user expects to see successful send message
