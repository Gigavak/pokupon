package someTests;

import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.given;


public class HelloWorldRestAssured {

    @Test
    public void makeSureThatGoogleIsUp() {

        given().when().get("https://apigermany.pokupon.ua/v1/comments").then().statusCode(200);

    }

}

