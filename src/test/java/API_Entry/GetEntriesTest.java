package API_Entry;

import Base.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetEntriesTest extends BaseTest {

    @Test
    public void verifyGetEntries() {

        Response response = RestAssured
                .given()
                .when()
                    .get("/entries")
                .then()
                    .statusCode(200)
                    .extract()
                    .response();

        System.out.println(response.asPrettyString());

        Assert.assertTrue(response.jsonPath().getList("Items").size() > 0);
    }
}