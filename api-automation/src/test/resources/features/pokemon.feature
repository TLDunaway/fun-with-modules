Feature: Pokemon

  Scenario: View list of all Pokemon
    Given that I request to view all of the Pokemon
    Then I see that the response code is 200
    And I see that the Pokemon count is  1154

  Scenario: View information about a Pokemon by name
    Given that I ask about Charmander
    Then I see that the response code is 200
    And that the Pokemon's id is 4

  Scenario: View information about a Pokemon by id
    Given that I ask about the Pokemon with id 1
    Then I see that the response code is 200
    And that the Pokemon's name is Bulbasaur

  Scenario: View information about a Pokemon by name that does not exist
    Given that I ask about Taylormon
    Then I see that the response code is 404

  Scenario: View information about a Pokemon by id that does not exist
    Given that I ask about the Pokemon with id 12000
    Then I see that the response code is 404