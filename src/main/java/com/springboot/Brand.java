package com.springboot;

import jakarta.persistence.*; 

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_brand")
@Setter
@Getter
public class Brand {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "brand")
	private String brandName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
}