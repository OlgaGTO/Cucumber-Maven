Feature: FizzBuzz game
  Scenario: Introduce multiple of 3
    Given create a FizzBuzz game play
    When I introduce the number 9
    Then I see message fizz


  Scenario: Introduce multiple of 5
    Given create a FizzBuzz game play
    When I introduce the number 10
    Then I see message buzz

  Scenario: Introduce multiple of 3 and 5
    Given create a FizzBuzz game play
    When I introduce the number 15
    Then I see message fizzbuzz

  Scenario: Introduce a number which is not divided by 3 or 5
    Given create a FizzBuzz game play
    When I introduce the number 17
    Then I see the number "17"

  Scenario Outline: Introduce multiple of 5 different number
    Given create a FizzBuzz game play
    When I introduce the number <x>
    Then I see message buzz

    Examples:
    | x  |
    | 20 |
    | 35 |
    | 40 |
