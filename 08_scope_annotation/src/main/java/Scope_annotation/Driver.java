package Scope_annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext con = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Student s = (Student)con.getBean("student");
		System.out.println(s);
		
		Student s2 = (Student)con.getBean("student");
		System.out.println(s2);
	}
}
