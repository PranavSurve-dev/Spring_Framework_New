package Main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import NoUniqueBeanDefinition.Car;

public class Driver {
	
public static void main(String[] args) {
		
		ConfigurableApplicationContext con = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Car c  = (Car)con.getBean("car");
		c.e.run();
		
	}

}
