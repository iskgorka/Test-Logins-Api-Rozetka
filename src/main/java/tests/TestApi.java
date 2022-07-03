package tests;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TestApi {

    @Test
    public void testGetUser() {
        Response response = when()
                .get("https://swapi.dev/api/starships/9/");
        response.then().statusCode(200)
                .body("name", startsWith("Death Star"));

        System.out.println(response.asString());
    }
}
