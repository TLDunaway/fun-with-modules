package services;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class Colors {
    public static Response getColors() {
        return given()
                .baseUri("https://pokeapi.co/api/v2/pokemon-color/")
                .when()
                .get();
    }

    public static Response getColor(String color) {
        return given()
                .baseUri("https://pokeapi.co/api/v2/pokemon-color/")
                .when()
                .get(color);
    }
}
