package Main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import NoUniqueBeanDefinition.Car;
import dependency_injection_java_based.Employee;

public class Driver {
	
public static void main(String[] args) {
		
		ConfigurableApplicationContext con = new AnnotationConfigApplicationContext(MyConfig.class);
		
//		Car c  = (Car)con.getBean("car");
//		c.e.run();
		
		Employee e = (Employee)con.getBean("employee");
		System.out.println(e);
		
	}

}
