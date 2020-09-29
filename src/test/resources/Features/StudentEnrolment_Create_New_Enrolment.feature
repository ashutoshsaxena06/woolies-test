@regression @create
Feature: New student enrolment (create)
  As a user
  I want to enrol new students using "/newStudent" api end point and POST method

  Scenario Outline: user enrols a new student with all valid student details
    Given I use the student details as id "<ID>", firstName "<firstName>", lastName "<lastName>", className "<className>" and nationality "<nationality>"
    When trigger the create student enrolment request
    Then status code "<status>" must be validated
    And student record is found in database with provided details
    Examples:
      | ID           | firstName                     | lastName                     | className | nationality | status |
      | 2289         | Tom22'                        | Crui$eeeeeeeeeeeeeeeeeeeeeee | 3 A       | American    | 201    |
      | 2294         | Brad                          | Pitt                         | 3 B       | Canadian    | 201    |
      | 2295         | Virat                         | Kohli                        | 3 B       | Indian      | 201    |
      | 214748364789 | Mike@qwertyuiobvhh-vhjhvhhhkh | Wong                         | 36667777  | Singapore   | 201    |

  Scenario Outline: user enrols a new student with missing student details from body
    Given I use the student details as id "<ID>", firstName "<firstName>", lastName "<lastName>", className "<className>" and nationality "<nationality>"
    When trigger the create student enrolment request
    Then status code "<status>" must be validated
    And error message "<error>" is received
    Examples:
      | ID   | firstName                     | lastName                     | className | nationality | status | error                   |
      | 1108 |                               | Crui$eeeeeeeeeeeeeeeeeeeeeee | 3 A       | American    | 400    | Missing Student details |
      | 1109 | Brad                          |                              | 3 B       | Canadian    | 400    | Missing Student details |
      | 1110 | Virat                         | Kohli                        |           | Indian      | 400    | Missing Student details |
      | 1111 | Mike@qwertyuiobvhh-vhjhvhhhkh | Wong                         | 36667777  |             | 400    | Missing Student details |

  Scenario Outline: user enrols a new student with existing student Id
    Given I use the student details as id "<ID>", firstName "<firstName>", lastName "<lastName>", className "<className>" and nationality "<nationality>"
    When trigger the create student enrolment request
    Then status code "<status>" must be validated
    And student record is found in database with provided details
    Given I use the student details as id "<ID>", firstName "<firstName1>", lastName "<lastName1>", className "<className1>" and nationality "<nationality1>"
    When trigger the create student enrolment request
    Then status code "<status>" must be validated
    And error message "<error>" is received
    Examples:
      | ID   | firstName | lastName | className | nationality | firstName1 | lastName1 | className1 | nationality1 | status | error                               |
      | 2297 | Alice     | Chan     | 3 A       | Hong Kong   | Mike       | Lui       | 3 C        | Singapore    | 400    | Student ID already exist or Invalid |

  Scenario Outline: user enrols a new student without student Id
    Given I use the student details as firstName "<firstName>", lastName "<lastName>", className "<className>" and nationality "<nationality>"
    When trigger the create student enrolment request
    Then status code "<status>" must be validated
    Examples:
      | firstName | lastName | className | nationality | status |
      | John      | Wight    | 3 D       | Brazil      | 400    |

  Scenario Outline: user enrols a new student with student Id as Blank or Invalid
    Given I use the student details as id "<ID>", firstName "<firstName>", lastName "<lastName>", className "<className>" and nationality "<nationality>"
    When trigger the create student enrolment request
    Then status code "<status>" must be validated
    And error message "<error>" is received
    Examples:
      | ID      | firstName | lastName | className | nationality | status | error                               |
      |         | Akram     | Raza     | 3 A       | UAE         | 400    | Student ID already exist or Invalid |
      | invalid | Akram     | Raza     | 3 A       | UAE         | 400    | Student ID already exist or Invalid |

  Scenario Outline: user enrols a new student with all valid student details and method as PUT
    Given I use the student details as id "<ID>", firstName "<firstName>", lastName "<lastName>", className "<className>" and nationality "<nationality>"
    When trigger the create student enrolment request with PUT method
    Then status code "<status>" must be validated
    Examples:
      | ID   | firstName | lastName | className | nationality | status |
      | 2284 | Brad      | Pitt     | 3 B       | Canadian    | 405    |




