package someTests;

import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;

public class HelloWorldRestAssured {

//    @Test
//    public void makeSureThatGoogleIsUp() {
//
//       // given().when().get("https://apigermany.pokupon.ua/v1/comments").then().statusCode(200);
//        given().when().get("http://apigermany.superdeal.ua/v1/startup_info").then().assertThat().
//                body("settings.currency", allOf());
//    }



//    @Test
//    public void oauth(){
//        given().auth().oauth2("ztEjzEdSZ-SaHfTkSKuhEJhWVgfrdQ").when().
//                get("https://apigermany.pokupon.ua/v1/user/profile").then().assertThat().statusCode(200).body(("id"));
//    }

    @Test()
    public void test1(){
        get("http://swapi.co/api/people/1/")
                .then().statusCode(200)
                .and()
                .assertThat()
                .body("mass", equalTo("77"));
    }
}

