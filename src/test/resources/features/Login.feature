#Author: SyntaxTeam
Feature: Login feature

  Background: 
    Given OrangeHRM logo is displayed

  Scenario: Valid login
    When I enter "admin" and "admin123"
    And I click on login button
    Then I successfully logged in


