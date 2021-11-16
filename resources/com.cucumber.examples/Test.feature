Feature:Login to application
  Scenario: Login with valid credentials
    Given Login page is opened in browser
    When I introduce username "ana"
    And I introduce password "A1234567."
    And I click Login button
    Then I see application page
