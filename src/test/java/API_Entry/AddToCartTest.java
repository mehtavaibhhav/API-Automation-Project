package API_Entry;

import Base.BaseTest;
import Base.RequestBuilder;
import Base.ResponseBuilder;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

    @Test
    public void verifyAddToCart() {

        Response response = RestAssured
                .given()
                    .spec(RequestBuilder.getRequestSpec())
                    .body("{\"id\":\"123\",\"cookie\":\"test\",\"prod_id\":1,\"flag\":false}")
                .when()
                    .post("/addtocart")
                .then()
                    .spec(ResponseBuilder.getResponseSpec())
                    .extract()
                    .response();

        System.out.println(response.asPrettyString());

//        Assert.assertEquals(response.getStatusCode(), 200);
    }
}