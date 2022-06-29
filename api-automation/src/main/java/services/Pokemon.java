package services;

import io.restassured.response.Response;

import java.util.Locale;

import static io.restassured.RestAssured.given;

public class Pokemon {

    public static Response login(int id) {
        return given()
                .baseUri("https://pokeapi.co/api/v2/pokemon/")
                .when()
                .get(Integer.toString(id));
    }

    public static Response getPokemon(String name) {
        name = name.toLowerCase(Locale.ENGLISH);
        return given()
                .baseUri("https://pokeapi.co/api/v2/pokemon/")
        .when()
                .get(name);
    }

    public static Response getPokemon() {
        return given()
                .baseUri("https://pokeapi.co/api/v2/pokemon/")
                .when()
                .get();
    }
}
