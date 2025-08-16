package com.rest.BDDstyle;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class createanEmployeeBDD {

	
	@Test
	public void createanEmployeBDD() {
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.body("{\r\n"
						+ "    \"title\": \"MUTHU\",\r\n"
						+ "    \"author\": \"RAKKI\"\r\n"
						+ "}")
		.when()
		.post("posts")
		.prettyPrint();
	}
	
}
