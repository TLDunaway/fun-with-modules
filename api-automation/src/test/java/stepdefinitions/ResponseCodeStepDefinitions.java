package stepdefinitions;

import context.TestContext;
import io.cucumber.java8.En;

public class ResponseCodeStepDefinitions implements En {
    TestContext context;

    public ResponseCodeStepDefinitions(TestContext context) {
        this.context = context;

        Then("I see that the response code is {int}", (Integer code) -> {
            context.getResponse()
                    .then()
                    .statusCode(code);
        });
    }
}
