package com.springboot;

import jakarta.persistence.*; 

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_laptops")
@Getter
@Setter
public class Laptop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@OneToOne
	@JoinColumn(name = "brand_id")
	private Brand brand;
	
	private Float price;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Laptop(LaptopRequest request) {
		this.name = request.getName();
		this.price = request.getPrice(); 
	}
	
}