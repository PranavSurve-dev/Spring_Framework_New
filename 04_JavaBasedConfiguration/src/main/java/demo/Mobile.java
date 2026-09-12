package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	 //1.Field Dependency Injection(If we add @value Here then its Field Dependency Injection)
	
	private int id;
    
	private String brand;
   
	private double price;
	
    //2.Constructor Dependency Injection(If we add @value Here then its Constructor Dependency Injection)
	
	public Mobile(@Value("201")int id,@Value("Samsung") String brand, @Value("10000") double price) {
		
		this.id = id;
		this.brand = brand;
		this.price = price;
	}
//public Mobile(int id, String brand,  double price) {
//	
//	this.id = id;
//	this.brand = brand;
//	this.price = price;
//}
	
	//3.Setter Dependency Injection(if we add @value Here then its Setter Dependency Injection)
//	public int getId() {
//		return id;
//	}
//	@Value("201")
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getBrand() {
//		return brand;
//	}
//	@Value("Samsung")
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//
//	public double getPrice() {
//		return price;
//	}
//	@Value("10000")
//	public void setPrice(double price) {
//		this.price = price;
//	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", brand=" + brand + ", price=" + price + "]";
	}	
}
