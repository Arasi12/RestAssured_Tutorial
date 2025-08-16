package com.rest.nonBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class updateAnEmployee {

	@Test
	public void updateEmployee() {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification requestSpecification= RestAssured.given().
				body("{\r\n"
						+ "    \"id\": \"342\",\r\n"
						+ "    \"title\": \"APITEST16aug\",\r\n"
						+ "    \"author\": \"Arasi M\"\r\n"
						+ "  }");
		Response response=requestSpecification.request(Method.PUT,"posts/79eb");
		System.out.println(response.statusCode());
		System.out.println(response.statusLine());
		System.out.println(response.asPrettyString());
		
		
	}
	
	
}
