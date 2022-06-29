Feature: Pokemon Color Service

  Scenario: View Pokedex color categories
    Given that I request to view the Pokedex color categories
    Then I see that the response code is 200
    And I see that the color count is  10

  Scenario: View information about a specific Pokedex color by name
    Given that I request to see information on black
    Then I see that the response code is 200
    And that the id for the color is 1

  Scenario: View information about a Pokedex color by name that does not exist
    Given that I request to see information on slime-green
    Then I see that the response code is 404

  Scenario: View information about a specific Pokedex color by id that does not exist
    Given that I request to see information on the color with id 10000
    Then I see that the response code is 404
