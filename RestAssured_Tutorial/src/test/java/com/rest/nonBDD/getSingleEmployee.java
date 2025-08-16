package com.rest.nonBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getSingleEmployee {

	@Test
	public void deleteEmployee() {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification requestSpecification=RestAssured.given();
		Response response=requestSpecification.request(Method.GET,"posts/dcf7");
		System.out.println(response.statusCode());
		System.out.println(response.statusLine());
		System.out.println(response.asPrettyString());
	
	}
	
}
