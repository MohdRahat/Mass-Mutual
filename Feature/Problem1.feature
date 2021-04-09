Feature: Problem1

  @inputValidation
  Scenario Outline: Validating the inputs from Exercise1
    Given Load Exercise1 home page
    Then Verify the right count of values appear on screen
    And Verify the values on the screen are greater than 0
    And Verify the total balance is correct based on the values listed on the screen
    And Verify the values formatted as currencies
    And Verify the total balance matches the sum of the values

    Examples:
      | Browser        |
      | Desktop_chrome |