package com.corp314e.messagetracking.controller;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import static com.jayway.restassured.RestAssured.given;

class MessageControllerTest {


    @Test
    void makingSureServerIsUp() {
        given().when().get("http://localhost:8888/api/get").then().statusCode(HttpStatus.OK.value());
    }

    @Test
    void makingSureAbleToPostOnServer(){
        given()
                .contentType("text/plain")
                .body("hello")
                .when().post("http://localhost:8888/api/send").then()
                .statusCode(HttpStatus.OK.value());
    }
}
