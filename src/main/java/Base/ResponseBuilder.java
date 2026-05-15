package Base;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

public class ResponseBuilder {

    public static ResponseSpecification getResponseSpec() {

        ResponseSpecification responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)
//                .expectHeader("Content-Type", "text/html; charset=utf-8")
                .build();

        return responseSpec;
    }
}