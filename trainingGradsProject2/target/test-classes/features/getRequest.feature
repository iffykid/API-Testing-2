Feature: Sample API Tests

  Scenario: Test a Sample Get API
    Given url is https://reqres.in/api/unknown
    When method GET
    Then satus 200
