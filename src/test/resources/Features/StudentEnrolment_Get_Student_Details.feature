@regression
Feature: Get student enrolment (Read)
  As a user
  I want to see student(s) records using "/fetchStudents" api end point and GET method

  Scenario Outline: Fetch bulk record: user fetch all students in database for that class
    Given I provide the class name "<className>" to fetch bulk records
    When trigger the get student enrolment request
    Then status code "<status>" must be validated
    And student records are fetched from response
    And compare the records from the database using class name "<className>"
    Examples:
      | className | status |
      | 3 B       | 200    |
      | 3 A       | 200    |
      | 3 C       | 200    |

  Scenario Outline: Fetch student record by student id
    Given I provide the student ID "<ID>" to fetch single record
    When trigger the get student enrolment request
    Then status code "<status>" must be validated
    And only one record is received
    And student record are fetched from response
    And compare the record from the database using student ID "<ID>"
    Examples:
      | ID   | status |
      | 2294 | 200    |
      | 2295 | 200    |





