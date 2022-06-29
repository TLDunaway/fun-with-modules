package stepdefinitions;

import context.TestContext;
import io.cucumber.java8.En;
import services.Pokemon;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class PokemonStepDefinitions implements En {
    TestContext context;

    public PokemonStepDefinitions(TestContext context) {
        this.context = context;

        Given("that I request to view all of the Pokemon", () -> {
            context.setResponse(Pokemon.getPokemon());
        });

        Then("I see that the Pokemon count is  {int}", (Integer count) -> {
            context.getResponse()
                    .then()
                    .body("count", equalTo(count));
        });

        Given("that I ask about {word}", (String pokemon) -> {
            context.setResponse(Pokemon.getPokemon(pokemon));
        });

        Then("that the Pokemon's id is {int}", (Integer id) -> {
            context.getResponse()
                    .then()
                    .body("id", equalTo(id));
        });

        Given("that I ask about the Pokemon with id {word}", (String id) -> {
            context.setResponse(Pokemon.getPokemon(id));
        });

        Then("that the Pokemon's name is {word}", (String pokemon) -> {
            context.getResponse()
                    .then()
                    .body("name", equalToIgnoringCase(pokemon));
        });

    }
}
