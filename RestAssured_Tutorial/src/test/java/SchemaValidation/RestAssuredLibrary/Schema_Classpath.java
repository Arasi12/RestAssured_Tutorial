package SchemaValidation.RestAssuredLibrary;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class Schema_Classpath {

	// JSON Schema Validator - Dependency
	
	@Test
	public void schemaClassPath() {
		
		File inputJSON= new File("src/test/resources/Myinput.json");		
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.body(inputJSON)
		.when()
		.post("posts")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("MySchema.json"))
		;
	
		
	}
	
}
