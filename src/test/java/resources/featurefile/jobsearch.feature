Feature: Job Search Test
  As user I want to search the job on cv- library website

  @smoke
  Scenario Outline: verify Job Search Result Using Different Data Set
    Given I am on homepage
    When I click on accepts cookies
    And  I enter the job title "<jobTitle>"
    And  I enter the location "<location>"
    And  I select the distance "<distance>"
    And  I click on more search options link
    And  I enter the salary minimum "<salaryMin>"
    And  I enter the salary maximum "<salaryMax>"
    And  I select the salary type "<salaryType>"
    And  I select  the job type "<jobType>"
    And  I click on find jobs button
    Then I verify the result "<result>"
    Examples:
      | jobTitle | location   | distance | salaryMin | salaryMax | salaryType | jobType   | result                                       |
      | Tester   | London     | 5        | 30000     | 50000     | Per month  | Permanent | Permanent Tester jobs in London              |
      | Tester   | Brighton   | 7        | 35000     | 60000     | Per month  | Contract  | Contract Tester jobs in Brighton             |
      | Tester   | Leeds      | 35       | 20000     | 50000     | Per week   | Contract  | Contract Tester jobs in Leeds                |
      | Tester   | Manchester | 5        | 20000     | 50000     | Per week   | Contract  | Contract Tester jobs in Manchester           |
      | Tester   | Newcastle  | 5        | 30000     | 50000     | Per month  | Permanent | Permanent Tester jobs in Newcastle upon Tyne |
      | Tester   | Birmingham | 35       | 2000      | 5000      | Per week   | Permanent | Permanent Tester jobs in Birmingham          |
      | Tester   | Glasgow    | 5        | 2000      | 5000      | Per week   | Permanent | Permanent Tester jobs in Glasgow             |