package com.rest.BDDstyle;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class updateAnEmployeeBDD {

	@Test
	public void updateEmployee() {
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.body("{\r\n"
				+ "    \"title\": \"ArasiRakkiuthu\",\r\n"
				+ "    \"author\": \"ArasiRakkiuthu\"\r\n"
				+ "}")
		.when()
		.put("posts/8bed")
		.prettyPrint();
		
	}
	
}
