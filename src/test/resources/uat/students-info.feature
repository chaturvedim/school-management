Feature: School Management Students Info

  Scenario: Get all students
    Given There is a school
    When There are students enrolled in the school
    Then I get 9 students
  	When I retrive students with id 3 from school
  	Then I get student with id 3
  	When I retrive students with standard 6 from school
  	Then I get 3 students
    