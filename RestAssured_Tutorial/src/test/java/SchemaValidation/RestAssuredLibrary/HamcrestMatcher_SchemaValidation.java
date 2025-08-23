package SchemaValidation.RestAssuredLibrary;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class HamcrestMatcher_SchemaValidation {

	// Hamcrest - Dependency
	
	// Apache commons IO - Dependency --> used to convert File to String
	
	@Test
	public void HamcrestMatcher() throws IOException {
		
		File inputJSON= new File("src/test/resources/Myinput.json");
		
		String jsonContent=FileUtils.readFileToString(inputJSON,"UTF-8");
		
		File schemaJSON= new File("src/test/resources/MySchema.json");	
		
		MatcherAssert.assertThat(jsonContent, JsonSchemaValidator.matchesJsonSchema(schemaJSON));
		
		
	}
	
}
