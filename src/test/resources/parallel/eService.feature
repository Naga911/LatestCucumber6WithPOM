Feature: eService Login Feature

  Background:
    Given user has already logged in to eService application
      |username|password|
      |Billa|123qwe|

  @Regression
  Scenario: eService page title verification
    Given user is on Accounts page
    When user gets the title of the page
