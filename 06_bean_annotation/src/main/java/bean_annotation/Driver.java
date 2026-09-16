package bean_annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext con = new AnnotationConfigApplicationContext(Employee.class);
		
		Employee e = (Employee)con.getBean("employee");
		System.out.println(e);
	}

}
