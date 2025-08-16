package POSTFromJSONfile;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostFromJSONfile {

	@Test
	public void PostReqWithJSONFile() {
		
		File jsonFile=new File("src/test/resources/PostInputSheet.json");
		
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.body(jsonFile)
		.when()
		.post("posts")
		.prettyPrint();
	}
	
	
	
}
