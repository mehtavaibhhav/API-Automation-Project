package Base;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestBuilder {

    public static RequestSpecification getRequestSpec() {

        RequestSpecification requestSpec = new RequestSpecBuilder()
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept-Encoding", "gzip, deflate, br")
                .build();

        return requestSpec;
    }
}