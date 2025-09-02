package Predicates;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;

public class FilterAPIPredicates {

	File file=new File("src/test/resources/BookStore.json");	

	public void FilterAPIex1() throws IOException {

		Filter PriceLessThan10=Filter.filter(
				Criteria
				.where("price")
				.lt(10)
				) ;

		List<Object> result=JsonPath.parse(file).read("$.store.book[?]",PriceLessThan10);
		System.out.println(result);

	}

	public void FilterAPIex2() throws IOException {

		Filter second=Filter.filter(
				Criteria
				.where("price")
				.lt(10)
				.and("category")
				.is("fiction")
				) ;

		List<Object> result=JsonPath.parse(file).read("$.store.book[?]",second);
		System.out.println(result);

	}
	
	public void FilterAPIex3() throws IOException {

		Filter Third=Filter.filter(
				Criteria
				.where("price")
				.gt(10)
				.and("category")
				.is("fiction")
				) ;

		List<Map<String, Object>> result=JsonPath.parse(file).read("$.store.book[?]",Third);
		System.out.println(result);

	}
	
	
	public static void main(String[] args) throws IOException {
		FilterAPIPredicates example=new FilterAPIPredicates();
		//example.FilterAPIex1();
		//example.FilterAPIex2();
		example.FilterAPIex3();
	}

}
