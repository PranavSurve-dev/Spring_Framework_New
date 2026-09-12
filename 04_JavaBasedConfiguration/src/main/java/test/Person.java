package test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import demo.Mobile;

@Component
public class Person {
	 //1.Field Dependency Injection(If we add @value Here then its Field Dependency Injection)

	private int id;
	private String name;
	
	private Mobile mobile;
	
    //2.Constructor Dependency Injection(If we add @value Here then its Constructor Dependency Injection)
	
	public Person(@Value("101")int id,@Value("pranav")String name, Mobile mobile) {
		
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}

//public Person(int id,String name,Mobile mobile) {
//		
//		this.id = id;
//		this.name = name;
//		this.mobile = mobile;
//	}

	//3.Setter Dependency Injection(if we add @value Here then its Setter Dependency Injection)
//
//	public int getId() {
//		return id;
//	}
//	@Value("101")
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//	@Value("pranav")
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Mobile getMobile() {
//		return mobile;
//	}
//	@Autowired 
//	public void setMobile(Mobile mobile) {
//		this.mobile = mobile;
//	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Mobile getMobile() {
		return mobile;
	}
 
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
	}
}