package JsonPathusingJAVA;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class Finite_InfinitePath {

	public static void Definite() throws IOException {
		File file=new File("src/test/resources/BookStore.json");		
		
		DocumentContext context=JsonPath.parse(file);
		String titleString=context.read("$.store.book[3].title");
		
		System.out.println("-------------------");
		System.out.println("FINITE example");
		System.out.println(titleString);
	}
	
	public static void Indefinite() throws IOException {
		File file=new File("src/test/resources/BookStore.json");		
		
		DocumentContext context=JsonPath.parse(file);
		List<Object> allcategory=context.read("$.store.book[*].title");
		System.out.println("-------------------");
		System.out.println("INFINITE example");
		for (Object category : allcategory) {
			System.out.println(category);
		}
	}
	
	public static void main(String[] args) throws IOException {
		// Finite path
		Definite();
		
		// Indefinite Path
		
		//.. deep scan
		//?(expression)
		//[0,1] or [0:3] [*]
		// boolean / Filter
		Indefinite();

	}

}
