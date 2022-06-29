package stepdefinitions;

import context.TestContext;
import io.cucumber.java8.En;
import services.Colors;
import services.Pokemon;

public class ExampleStepDefinitions implements En {
    TestContext context;

    public ExampleStepDefinitions(TestContext context) {
        this.context = context;

        Given("that I do things", () -> {
            Pokemon.getPokemon().prettyPrint();
            Colors.getColors();
        });
    }
}
