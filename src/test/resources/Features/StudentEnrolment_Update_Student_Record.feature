@regression
Feature: Update student record
  As a user
  I want to update student record using "/updateStudent" api end point and PUT method

  Scenario Outline: user update the existing student record
    Given I use the student details as id "<ID>" and className "<className>"
    When trigger the create student enrolment request
    Then status code "<status>" must be validated
    And response contains all the student details
    And student record is found in database using student ID "<ID>" with className "<className>"
    Examples:
      | ID   | className | status |
      | 2289 | 3 E       | 201    |

  Scenario Outline: user update the record of non existing student
    Given I use the student details as id "<ID>" and className "<className>"
    When trigger the create student enrolment request
    Then status code "<status>" must be validated
    And error message "<error>" is received
    Examples:
      | ID   | className | status | error     |
      | 9999 | 3 E       | 400    | Not found |


