package Main;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import dependency_injection_java_based.Employee;

@Configuration
@ComponentScan(basePackages = {"Main","NoUniqueBeanDefinition","dependency_injection_java_based"})
public class MyConfig {

	@Bean
	public Employee getEmployee() {
		return new Employee();
	}
	
//	public Connection getConnection() {
//		return DriverManager.getConnection();
//	}
	
}
