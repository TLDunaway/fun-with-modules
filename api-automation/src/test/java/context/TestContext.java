package context;

import io.restassured.response.Response;

public class TestContext {
    private Response response;

    public TestContext() {}

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}
