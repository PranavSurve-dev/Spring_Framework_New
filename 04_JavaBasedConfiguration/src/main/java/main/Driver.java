package main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.Mobile;
import test.Person;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext con = new AnnotationConfigApplicationContext(MyConfig.class);
				
			Person p = (Person)con.getBean("person");
		        
		        System.out.println(p);
		     
	}
}
