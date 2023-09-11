package com.springboot;

import lombok.Getter; 
import lombok.Setter;

@Setter
@Getter
public class LaptopRequest {
	
	private String name;
	
	private String brand;
	
	private Float price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
	
	
}