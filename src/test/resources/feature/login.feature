Feature: Verifying facebook page

  Scenario: Login
    Given User should be in adactinhotel page
    When User should enter the Username and password
    And User should select the login button
    And User should select the location
    And User should select the Hotel
    And User sholud select the room type according to his need
    Then User should verify login is success or not
