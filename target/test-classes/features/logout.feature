@logout
Feature:
  Background: user logged in succesfuly

    Scenario:
      Given user is on the home page as "posmanager"
      When user clicks posmanager section right top of the page
      And user clicks log out button from bottom of the section
      Then user successfully logged out from the page

      Scenario:
        Given user logged out successfully as a "posmanager"
        When user clicks step back button
        Then user see session expired text

      Scenario:
        Given user is on the home page as "salesmanager"
        When user clicks salesmanager section right top of the page
        And user clicks log out button from bottom of the section
        Then user successfully logged out from the page

  Scenario:
    Given user logged out successfully as a "salesmanager"
    When user clicks step back button
    Then user see session expired text


