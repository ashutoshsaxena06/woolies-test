@regression @delete
Feature: Delete student record
  As a user
  I want to delete existing student record using "/removeStudent" api end point and DELETE method

  Scenario Outline: user provides existing student ID to delete
    Given I use the student details as id "<ID>", firstName "<firstName>", lastName "<lastName>", className "<className>" and nationality "<nationality>"
    When trigger the create student enrolment request
    Then status code "<status>" must be validated
    And response contains all the student details
    And student record is found in database with provided details
    Given I use the student ID "<ID>" to remove the record
    When trigger the delete student record
    Then status code "<statusDelete>" must be validated
    And student record with student ID "<ID>" is not found in database
    Examples:
      | ID   | firstName | lastName | className | nationality | status | statusDelete |
      | 1100 | Bryan     | Adams    | 3 A       | American    | 201    | 200          |

  Scenario Outline: user provides non existing student ID to delete
    Given student record with student ID "<ID>" is not found in database
    And I use the student ID "<ID>" to remove the record
    When trigger the delete student record
    Then status code "<statusDelete>" must be validated
    And error message "<error>" is received
    Examples:
      | ID   | statusDelete | error     |
      | 1100 | 400          | Not Found |