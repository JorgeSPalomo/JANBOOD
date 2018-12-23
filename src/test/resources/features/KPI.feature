# Jorge Palomo
Feature: KIP Reach

  Scenario: As an admin I should have ability to add KPI for Performance
    Given I logged into OrangeHRM
    When I click Performance Module and click KPI
    And I click add
    And I Select Job Title
    And I Select IT Executive
    And Enter Key Performance indicator
    And Enter Minimum Rating
    And Enter Maximum Rating
    And Click Make Default Scale
    And Click Save
    And Select Job Title from Search Key Performance that you chose
    And click Search
    Then Validate that Key Performance Indicator has been created
    And Delete created Key Performance Indicator
    And Validate that No Records Found
    
    Scenario: 
    Given I logged into OrangeHRM
    When I click Performance Module and click Tracker under Configure
    And Enter a Tracker Name
    And Enter a Default Employee
    And Click John Smith in Available Reviewers
    And Click Add to Assign Reviewers
    And Click Save again
    Then Validate that Employee is created with Tracker
    And Delete created Employee
    And Validate that No Records Found
