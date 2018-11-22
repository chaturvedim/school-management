 Feature: School Management Teachers Info
    
  Scenario: Get all teachers
  	Given There is a school
  	When I retrieve all teachers from school
  	Then I get 6 teachers
  	When I retrive teachers with id 1 from school
  	Then I get teacher with id 1
  	When I retrive teachers with standard 6 from school
  	Then I get 2 teachers