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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Customer;
import com.masai.model.CustomerDTO;
import com.masai.service.CustomerService;

import jakarta.validation.Valid;

@RestController
public class MyController {
	
	@Autowired
	private CustomerService csr;
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> registerCustomerhandler(@Valid @RequestBody Customer c){
		Customer cus = csr.registerCustomer(c);
		
		return new ResponseEntity<Customer>(cus,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/customer/{id}")
	public ResponseEntity<Customer> getCustomerByIdhandler(@PathVariable("id") Integer id){
		Customer cus = csr.getCustomerById(id);
		
		return new ResponseEntity<Customer>(cus,HttpStatus.OK);
	}
	
	@GetMapping("/customer/{email}/{pass}")
	public ResponseEntity<Customer> loginHandler(@PathVariable("email") String email, @PathVariable("pass") String pass){
		Customer cus = csr.loginCustomer(email, pass);
		return new ResponseEntity<Customer>(cus,HttpStatus.ACCEPTED);
		
		
	}
	
	
	@PutMapping("/customer/{email}/{oldPass}/{newPass}")
	public ResponseEntity<Customer> updatePasswordHandler(@PathVariable("email") String email, @PathVariable("oldPass") String pass, @PathVariable("newPass") String pass2){
		Customer cus = csr.updateCustomerPassword(email, pass, pass2);
		return new ResponseEntity<Customer>(cus,HttpStatus.ACCEPTED);
		
		
	}
	
	
	@GetMapping("/customer")
	public ResponseEntity<List<Customer>> getAllCustomerHandler(){
		
		List<Customer> cus = csr.getAllCustomerDetails();
		
		return new ResponseEntity<List<Customer>>(cus,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/customer/{id}")
	public ResponseEntity<Customer> deleteCustomerByIDHandler(@PathVariable("id") Integer id){
		
		Customer cus = csr.deleteCustomerById(id);
		
		return new ResponseEntity<Customer>(cus,HttpStatus.OK);
	}
	
	@GetMapping("/getcustomer/{address}")
	public ResponseEntity<List<Customer>> getAllCustomerByAddressHandler(@PathVariable("address") String address){
		
		List<Customer> cus = csr.getCustomerDetailsByAddress(address);
		
		return new ResponseEntity<List<Customer>>(cus,HttpStatus.OK);
	}
	
	@PutMapping("/customer")
	public ResponseEntity<Customer> updateCustomerHandler(@RequestBody Customer customer){
		Customer cus = csr.updateCustomer(customer);
		return new ResponseEntity<Customer>(cus,HttpStatus.ACCEPTED);
		
		
	}
	
	
	
	@GetMapping("/getcustomerByage/{s}/{e}")
	public ResponseEntity<List<Customer>> getAllCustomerBetweenAgeLimitHandler(@PathVariable("s") Integer s,@PathVariable("e") Integer e){
		
		List<Customer> cus = csr.getCustomersBetweenAge(s, e);
		
		return new ResponseEntity<List<Customer>>(cus,HttpStatus.OK);
	}
	
	
	@GetMapping("/customerdtos")
	public ResponseEntity<List<CustomerDTO>> getAllCustomerWithNameAddressAgeHandler(){
		
		List<CustomerDTO> cus = csr.getNameAddressAgeOfAllCustomers();
		
		return new ResponseEntity<List<CustomerDTO>>(cus,HttpStatus.OK);
	}
	
	

}

























