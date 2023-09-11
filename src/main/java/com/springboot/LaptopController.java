package com.springboot;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class LaptopController {
	
	@Autowired
	private LaptopRepository lRepo;
	
	@Autowired
	private BrandRepository bRepo;
	
	@PostMapping("/laptops/save")
	public ResponseEntity<Laptop> saveData (@RequestBody LaptopRequest req) {
		
		Brand brand = new Brand();
		brand.setBrandName(req.getBrand());
		
		brand = bRepo.save(brand);
		
		Laptop laptop = new Laptop(req);
		laptop.setBrand(brand);
		
		laptop = lRepo.save(laptop);
		
		return new ResponseEntity<Laptop>(laptop, HttpStatus.CREATED);
		
	}
}