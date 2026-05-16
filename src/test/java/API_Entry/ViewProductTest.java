package API_Entry;

import Base.BaseTest;
import Base.RequestBuilder;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ViewProductTest extends BaseTest {

    @Test
    public void verifyViewProduct() {
    	

        Response response = RestAssured
                .given()
                .spec(RequestBuilder.getRequestSpec())
//                    .header("Content-Type", "application/json") // mark due to request builder 
                    .body("{ \"id\": \"1\" }")
                .when()
                    .post("/view");

        System.out.println(response.asPrettyString());

        Assert.assertEquals(response.getStatusCode(), 200);
    }
}