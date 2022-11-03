 @FIDE-1403 @wip
Feature: As a user, I should be able to log in so that I can land on homepage.
  Background:
    Given User is on the fidexio login page


  @FIDE-1455 @wip
  Scenario Outline: Log in with valid credentials(as posMan & salesMan)
    When User types "<valid username>" username
    And User types "<valid password>" password
    And User clicks login button
    Then User lands on the home page "<title>"

    Examples: login with valid credentials we are using these credentials as is below.
      |valid username         |valid password|
      |posmanager11@info.com  |posmanager    |
      |posmanager22@info.com  |posmanager    |
      |salesmanager11@info.com|salesmanager  |
      |salesmanager22@info.com|salesmanager  |
  @FIDE-1456 @wip
    Scenario Outline: login with invalid credentials
      When User types "<invalid username>" invalid username
      And User types "<invalid password>" invalid password
      And User clicks login button
      Then User see the wrong mail or password message
      Examples: User types unvalid username and password as below
        |invalid username|invalid password|
        |oguzhan@info.com|oguzhan         |
        |mahmut.com      |mahmut          |
  @FIDE-1457 @wip
      Scenario Outline: user filled out just username or password
        When User types "<username>" just username
        And  User types "<password>" just password
        And User clicks login button
        Then User see the please fille out this field message after password or username is empty
        Examples: user types username or password as below
        |username             |password    |
        |posmanager@info.com  |            |
        |salesmanager@info.com|            |
        |                     |posmanager  |
        |                     |salesmanager|
  @FIDE-1458 @wip
        Scenario Outline: user fill out password blank and see the bullet sign by default
          When user types "<something>" to password blank
          Then user see bullet sign by default
          Examples: user types something as below
            |something|
            |kamcka   |
            |amckamkc |
            |amkmdca  |
  @FIDE-1459 @wip
          Scenario Outline: Verify if the ‘Enter’ key of the keyboard is working correctly on the login page
            When User types valid "<username>"
            And  User types valid "<password>" and press the Enter key
            Then User see Enter keyword working correctly on the login page
    Examples:
    |username             |password  |
    |posmanager11@info.com|posmanager|



