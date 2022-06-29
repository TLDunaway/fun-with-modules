package stepdefinitions;

import context.TestContext;
import io.cucumber.java8.En;
import services.Colors;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class ColorStepDefinitions implements En {
    TestContext context;

    public ColorStepDefinitions(TestContext context) {
        this.context = context;

        Given("that I request to view the Pokedex color categories", () -> {
            context.setResponse(Colors.getColors());
        });

        Then("I see that the color count is  {int}", (Integer count) -> {
            context.getResponse()
                    .then()
                    .body("count", equalTo(count));
        });

        Given("that I request to see information on {word}", (String color) -> {
            context.setResponse(Colors.getColor(color));
        });

        Given("that I request to see information on the color with id {word}", (String id) -> {
            context.setResponse(Colors.getColor(id));
        });

        Then("that the id for the color is {int}", (Integer id) -> {
            context.getResponse()
                    .then()
                    .body("id", equalTo(id));
        });

        Then("that the name for the color is {word}", (String color) -> {
            context.getResponse()
                    .then()
                    .body("name", equalToIgnoringCase(color));
        });
    }
}
