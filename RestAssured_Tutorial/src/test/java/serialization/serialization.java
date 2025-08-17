package serialization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class serialization {

	@Test
	public void serializationexample() {
		
		List<String> myskills=new ArrayList<String>();
		myskills.add("Flying");
		myskills.add("Dancing");
		
		Map<String, Object> jsonbody=new HashMap<String, Object>();
		jsonbody.put("first_name", "MaryJane");
		jsonbody.put("last_name", "Parker");
		jsonbody.put("email", "MJ@peter.com");
		jsonbody.put("Skills", myskills);
		
		System.out.println(jsonbody);
		
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.body(jsonbody)
		.log()
		.all()
		.when()
		.post("posts")
		.then()
		.log()
		.all();
		
		
		
	}

}
