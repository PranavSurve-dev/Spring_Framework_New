package main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Test.Student;
import demo.Employee;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext con = new AnnotationConfigApplicationContext(MyConfig.class);
				
				Student s = (Student)con.getBean("stu");
		        Employee e = (Employee)con.getBean("emp");
		       
		        
		        System.out.println(s);
		        System.out.println(e);
	}
}