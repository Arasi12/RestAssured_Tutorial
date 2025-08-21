package serialization;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

 // How to serialise a POJO
 // Using Jackson databind - ObjectMapper

public class Serialize_a_POJO {

	private String firstname;
	private String lastname;
	private List skills;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public List getSkills() {
		return skills;
	}
	public void setSkills(List skills) {
		this.skills = skills;
	}
	
	
	public static void main(String[] args) throws JsonProcessingException {
		Serialize_a_POJO obj=new Serialize_a_POJO();
		obj.setFirstname("Barbie");
		obj.setLastname("Chan");
		obj.setSkills(Arrays.asList("Web","Fly"));
		
		System.out.println(obj.getFirstname());
		System.out.println(obj.getLastname());
		System.out.println(obj.getSkills());
		
		ObjectMapper mapper=new ObjectMapper();
		String EmpJSON=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		
		System.out.println(EmpJSON);
		
	}
	
}
