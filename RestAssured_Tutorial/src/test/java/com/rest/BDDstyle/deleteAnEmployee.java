package com.rest.BDDstyle;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class deleteAnEmployee {

	@Test
	public void deleteEmployee() {
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.when()
		.delete("posts/8fb2")
		.prettyPrint();
	}
	
}
