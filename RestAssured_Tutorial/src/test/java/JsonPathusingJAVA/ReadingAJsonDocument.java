package JsonPathusingJAVA;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.InvalidJsonException;
import com.jayway.jsonpath.JsonPath;

public class ReadingAJsonDocument {

	public static void ReadingAJSONDocument() throws IOException {
		File file=new File("src/test/resources/BookStore.json");
		List<Object> allcategory=JsonPath.read(file, "$..category");
		
		for (Object category : allcategory) {
			System.out.println(category);
		}
		
	}
	
	public static void ReadingAJSONDocumentParseoneTime() throws InvalidJsonException, IOException {
		InputStream file=new FileInputStream("src/test/resources/BookStore.json");
		
		Object	Parsedjsondoc= Configuration.defaultConfiguration().
		jsonProvider().parse(file.readAllBytes());
		
		List<Object> allcategory=JsonPath.read(Parsedjsondoc, "$..category");
		for (Object category : allcategory) {
			System.out.println(category);
		}
		
	}
	
	public static void FluentAPI() throws IOException {
		File file=new File("src/test/resources/BookStore.json");
		
		
		DocumentContext context=JsonPath.parse(file);
		List<Object> allcategory=context.read("$..category");
		
		for (Object category : allcategory) {
			System.out.println(category);
		}
		
		//method  2 in Fluent APi
		Configuration configuration=Configuration.defaultConfiguration();
		List<Object> allcategory2=JsonPath
		.using(configuration)
		.parse(file)
		.read("$..category");
		
		for (Object category : allcategory2) {
			System.out.println(category);
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		// - Uncomment one by one to understand the methods
		
		//ReadingAJSONDocument();
		//ReadingAJSONDocumentParseoneTime();
		FluentAPI();
	}

}
