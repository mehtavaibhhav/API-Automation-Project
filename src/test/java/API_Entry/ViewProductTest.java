package API_Entry;

import Base.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ViewProductTest extends BaseTest {

    @Test
    public void verifyViewProduct() {

        Response response = RestAssured
                .given()
                    .header("Content-Type", "application/json")
                    .body("{ \"id\": \"1\" }")
                .when()
                    .post("/view");

        System.out.println(response.asPrettyString());

        Assert.assertEquals(response.getStatusCode(), 200);
    }
}