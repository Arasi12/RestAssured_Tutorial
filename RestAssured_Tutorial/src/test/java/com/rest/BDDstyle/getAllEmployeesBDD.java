package com.rest.BDDstyle;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class getAllEmployeesBDD {

	
	@Test
	public void getallEmpBDD() {
		RestAssured
		.given()
			.baseUri("http://localhost:3000/")
		.when()
			.get("posts")
		.prettyPrint();
		
		
	}
	
	
}
