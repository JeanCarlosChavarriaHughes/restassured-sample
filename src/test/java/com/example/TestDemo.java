package com.example;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class TestDemo {
    @Test(description = "Verify that the Get Post API returns correctly")
    public void verifyGetAPI() {
    // Given
    given()
        .baseUri("https://jsonplaceholder.typicode.com")
                .header("Content-Type", "application/json")
    // When
    .when()
        .get("/posts/1")
    // Then
    .then()
        .statusCode(200)
        // To verify correct value
        .body("userId", equalTo(1))
        .body("id", equalTo(1))
        .body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"))
        .body("body", equalTo("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"));
    }

    @Test(description = "Verify that the publish post API returns correctly")
    public void verifyPostAPI() {
    // Given
    given()
        .baseUri("https://jsonplaceholder.typicode.com")
        .header("Content-Type", "application/json")
        // When
        .when()
        .body("{\"title\": \"foo\", \"body\": \"bar\", \"userId\": 1\n}")
        .post("/posts")
        // Then
        .then()
        .statusCode(201)
        // To verify correct value
        .body("userId", equalTo(1))
        .body("id", equalTo(101))
        .body("title", equalTo("foo"))
        .body("body", equalTo("bar"));
    }

    @Test(description = "Verify body message is Success")
    public void verifyBodyErrorMsgIsSuccess() {
        String url = "https://dog.ceo/api/breeds/image/random";
        // Given
        Response response = given()
            .queryParam("CUSTOMER_ID", "68195")
        // When
            .when()
            .get(url);
        // Then
        response.then()
            .log()            
            .body()
            .assertThat()
            .statusCode(200)
            .contentType("application/json")
            .body("status", equalTo("success"));            
    }

    @Test(description = "Verify message lenght equal to expected length")
    public void verifyMessageLenghtEqualTo() {

        String url = "https://dog.ceo/api/breeds/image/random/3"; // lenght is 3
        // given
        Response response = given()
            .queryParam("testparam", "testvalue")

        // when
        .when()
            .get(url);

        // then
        response.then()
            .log()
            .body()
            .assertThat()
            .body("message.size()", equalTo(3));
    }

    
}
