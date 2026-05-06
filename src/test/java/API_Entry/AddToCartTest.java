package API_Entry;

import Base.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

    @Test
    public void verifyAddToCart() {

        Response response = RestAssured
                .given()
                    .header("Content-Type", "application/json")
                    .body("{\"id\":\"123\",\"cookie\":\"test\",\"prod_id\":1,\"flag\":false}")
                .when()
                    .post("/addtocart");

        System.out.println(response.asString());

        Assert.assertEquals(response.getStatusCode(), 200);
    }
}