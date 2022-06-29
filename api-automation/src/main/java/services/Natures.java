package services;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Natures {

    public static Response getNatures() {
        return given()
                .baseUri("https://pokeapi.co/api/v2/nature/")
                .when()
                .get();
    }

    public static Response getNature(String nature) {
        return given()
                .baseUri("https://pokeapi.co/api/v2/nature/")
                .when()
                .get(nature);
    }
}
