Feature: Employee Details

  Scenario: Get the details from an employee
    Given I send a request to the endpoint
    Then The API should return status 200
    And Response should contain User ID 1