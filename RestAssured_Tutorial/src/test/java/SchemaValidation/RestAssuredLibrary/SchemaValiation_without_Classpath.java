package SchemaValidation.RestAssuredLibrary;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class SchemaValiation_without_Classpath {

	// JSON Schema Validator - Dependency
	
	@Test
	public void schemaClasSchemaValiation_withoutClasspathsPath() {
		
		File inputJSON= new File("src/test/resources/Myinput.json");
		File schemaJSON= new File("src/test/resources/MySchema.json");	
		
		
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.body(inputJSON)
		.when()
		.post("posts")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchema(schemaJSON))
				;
				//matchesJsonSchemaInClasspath("MySchema.json"))
		//;
	
		
	}
	
	
	
	
}
