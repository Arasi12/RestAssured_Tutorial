package com.rest.nonBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class createAnEmployee {

	@Test
	public void CreateAnEmployee() {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification requestSpecification=	RestAssured.given();
		Response response= requestSpecification.request(Method.POST,"posts");
		
		
	}

}
