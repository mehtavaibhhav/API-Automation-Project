package API_Entry;

import Base.BaseTest;
import Base.RequestBuilder;
import Base.ResponseBuilder;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupTest extends BaseTest {

    @Test
    public void verifySignup() {

        String username = "user" + System.currentTimeMillis();

        Response response = RestAssured
                .given()
                .spec(RequestBuilder.getRequestSpec())
//                    .header("Content-Type", "application/json")
                    .body("{ \"username\": \"" + username + "\", \"password\": \"123\" }")
                .when()
                    .post("/signup")
                 .then()
                    .spec(ResponseBuilder.getResponseSpec())
                    .extract()
                    .response();

        System.out.println(response.asString());

//        Assert.assertEquals(response.getStatusCode(), 200);
    }
}