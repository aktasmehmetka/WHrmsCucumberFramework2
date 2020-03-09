@sprint1 @login
Feature: Login

  #@smoke
  #Scenario: Valid Login
    #Given I open bowser and navigated to the HRMS
    #When I enter valid username and valid password
    #And I click on login button
    #Then I successfully logged in
    #And I close browser

  @regression
  Scenario: Invalid Login
    Given I open bowser and navigated to the HRMS
    When I see syntax logo
    When I enter invalid username valid passowrd
    And I click on login button
    Then I see error message
    And I close browser
