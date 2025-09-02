package Predicates;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.JsonPath;

public class InlinePredicates {

	// Inline Predicates - And Or Negation

	File file=new File("src/test/resources/BookStore.json");		

	public void InlinePredicatesAnd() throws IOException {

		List<Object> AndPred=JsonPath.parse(file).read("$.store.book[?(@.category=='fiction' && @.price>10)]");

		for (Object object : AndPred) {
			System.out.println(object);
		}

	}

	public void InlinePredicatesOr() throws IOException {
		List<Object> OrPred=JsonPath.parse(file).read("$.store.book[?(@.category=='reference' || @.price<10)]");

		for (Object object : OrPred) {
			System.out.println(object);
		}
	}

	public void InlinePredicatesNegation() throws IOException {
		List<Object> negationPred=JsonPath.parse(file).read("$.store.book[?(!(@.category=='reference' || @.price<20))]");

		for (Object object : negationPred) {
			System.out.println(object);
		}
	}

	public static void main(String[] args) throws IOException {
		InlinePredicates example= new InlinePredicates();
		example.InlinePredicatesAnd();
		example.InlinePredicatesOr();
		example.InlinePredicatesNegation();


	}

}
