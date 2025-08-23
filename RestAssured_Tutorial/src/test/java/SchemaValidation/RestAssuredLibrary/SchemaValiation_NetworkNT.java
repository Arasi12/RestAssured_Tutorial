package SchemaValidation.RestAssuredLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion.VersionFlag;
import com.networknt.schema.ValidationMessage;


public class SchemaValiation_NetworkNT {

	// NetworkNt JSON Schema Validator - Dependency
	
	@Test
	public void SchemaValiationNetworkNT() throws IOException {
		
		ObjectMapper mapper=new ObjectMapper();		
		JsonSchemaFactory factory = JsonSchemaFactory.getInstance(VersionFlag.V4);
		
		File inputJSON= new File("src/test/resources/Myinput.json");
		InputStream schemaJSON= new FileInputStream("src/test/resources/MySchema.json");
		
		JsonNode jsonNode = mapper.readTree(inputJSON);
		JsonSchema jsonSchema = factory.getSchema(schemaJSON);
		
		Set<ValidationMessage> result=jsonSchema.validate(jsonNode);	
		
		if(result.isEmpty()) {
			System.out.println("No Validation errors");
		}else {
			for (ValidationMessage message : result) {
				System.out.println(message);
			}
		}
		
		
	}
	
}
