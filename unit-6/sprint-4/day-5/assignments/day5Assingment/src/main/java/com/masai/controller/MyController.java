package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Product;
import com.masai.model.ProductDTO;
import com.masai.service.ProductServices;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/productservices")
public class MyController {
	
	@Autowired
	private ProductServices psr;
	
	@PostMapping("/products")
	public ResponseEntity<Product> registerProductHandler(@Valid @RequestBody Product pro){
		
		Product product = psr.registerProduct(pro);
		
		return new ResponseEntity<Product>(product,HttpStatus.ACCEPTED);
	
	}
	
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllproductHandler(){
		
		List<Product> products = psr.getAllProducts();
		
		return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
	}
	
	
	@PutMapping("/products")
	public ResponseEntity<Product> updateProductHandler(@Valid @RequestBody Product pro){
		
		Product product = psr.updateProdcut(pro);
		
		return new ResponseEntity<Product>(product,HttpStatus.ACCEPTED);
	
	}
	
	
	@DeleteMapping("/products/{id}")
	public ResponseEntity<Product> deleteProductById(@PathVariable("id") Integer id){
		    
		Product product =   psr.deleteProductById(id);
		
		return new ResponseEntity<Product>(product,HttpStatus.OK);
	}
	
	@GetMapping("/products/{category}")
	public ResponseEntity<List<Product>> getProductByCategory(@PathVariable("category") String category){
		    
		List<Product> products =   psr.getsProductByCategory(category);
		
		return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
	}
	
	
	@GetMapping("/productDtos")
	public ResponseEntity<List<ProductDTO>> getAllproductHandlerWithNameQtyPrice(){
		
		List<ProductDTO> products = psr.getProductNameQtyPrice();
		
		return new ResponseEntity<List<ProductDTO>>(products,HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
