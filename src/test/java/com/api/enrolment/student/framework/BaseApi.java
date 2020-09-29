package com.api.enrolment.student.framework;

import com.api.enrolment.student.config.MethodType;
import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.springframework.stereotype.Component;

@Component
public class BaseApi {
    private CustomRequestSpecBuilder requestSpecBuilder = new CustomRequestSpecBuilder();
    private MethodType method;
    private Response response;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public MethodType getMethod() {
        return this.method;
    }

    public void setMethod(MethodType method) {
        this.method = method;
    }

    public CustomRequestSpecBuilder getRequestSpecBuilder() {
        return this.requestSpecBuilder;
    }

    public void setRequestSpecBuilder(CustomRequestSpecBuilder requestSpecBuilder) {
        this.requestSpecBuilder = requestSpecBuilder;
    }

    public Response execute() {
        RestAssured.defaultParser = Parser.JSON;
        RequestSpecification requestSpecification = getRequestSpecification();
        switch (getMethod()) {
            case GET:
                response = requestSpecification.when().get();
                break;
            case POST:
                response = requestSpecification.when().post();
                break;
            case PUT:
                response = requestSpecification.when().put();
                break;
            case DELETE:
                response = requestSpecification.when().delete();
                break;
            default:
                throw new RuntimeException("API method not specified");
        }
        this.printResponse(response);
        setResponse(response);
        return response;
    }

    private RequestSpecification getRequestSpecification() {
        return RestAssured
                .given()
                .config(RestAssuredConfig.config())
                .spec(getRequestSpecBuilder().build());
    }

    private void printResponse(Response response) {
        System.out.println("*********** Response *******");
        response.prettyPrint();
    }

    public BaseApi setBody(Object obj) {
        this.requestSpecBuilder.setBody(obj);
        return this;
    }

}