package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.Customer;
import com.masai.model.CustomerDTO;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer>{
	
	
	public Customer findByEmailAndPassword(String email,String password);
	
	public List<Customer> findByAddress(String address);
	
	public List<Customer> findByAgeBetween(Integer s, Integer e);
	
	
	@Query("select new com.masai.model.CustomerDTO(c.customerName,c.address,c.age) from Customer c")
	public List<CustomerDTO> getNameAddressAgeOfAllCustomer();
}
