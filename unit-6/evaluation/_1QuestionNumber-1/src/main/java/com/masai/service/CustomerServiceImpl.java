package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.CustomerException;
import com.masai.model.Customer;
import com.masai.model.CustomerDTO;
import com.masai.repository.CustomerDAO;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerDAO cdao;

	@Override
	public Customer registerCustomer(Customer Customer) throws CustomerException {
		
		Customer customer = cdao.save(Customer);
		return customer;
	}

	@Override
	public Customer getCustomerById(Integer customerId) throws CustomerException {
		
		return cdao.findById(customerId)
				.orElseThrow(() -> new CustomerException("Not Found ..."));
		
	}

	@Override
	public Customer loginCustomer(String email, String password) throws CustomerException {
		
		Customer c = cdao.findByEmailAndPassword(email, password);
		
		if(c == null) {
			throw new CustomerException("Wrong Credential");
		}
		
		return c;
	}

	@Override
	public Customer updateCustomerPassword(String username, String oldPassword, String newPassword)throws CustomerException {
		
		Customer c = cdao.findByEmailAndPassword(username, oldPassword);
		
		
		if( c == null) {
			throw new CustomerException("Wrong Credential");
		}else {
			
			c.setPassword(newPassword);
			Customer updated = cdao.save(c);
			return updated;
		}
		
		
	}

	@Override
	public List<Customer> getAllCustomerDetails() throws CustomerException {
		
		List<Customer> list = cdao.findAll();
		
		if(list.isEmpty()) {
			throw new CustomerException("Not Found ...");
		}else {
			return list;
		}
	}

	@Override
	public Customer deleteCustomerById(Integer customerId) throws CustomerException {
		
		Optional<Customer> cus = cdao.findById(customerId);
		
		if(cus.isPresent()) {
			cdao.deleteById(customerId);
			return cus.get();
			
		}else {
			throw new CustomerException("Not Found ...");
		}
	}

	@Override
	public List<Customer> getCustomerDetailsByAddress(String address) throws CustomerException {
		
		List<Customer> list = cdao.findByAddress(address);
		
		if(list.isEmpty()) {
			throw new CustomerException("Not Found ...");
		}else {
			return list;
		}
	}

	@Override
	public Customer updateCustomer(Customer customer) throws CustomerException {
		
		Optional<Customer> cus = cdao.findById(customer.getCustomerId());
		
		if(cus.isPresent()) {
			Customer updated = cdao.save(customer);
			
			return updated;
			
		}else {
			throw new CustomerException("Not Found ...");
		}
	}

	@Override
	public List<Customer> getCustomersBetweenAge(Integer start_age, Integer end_age) throws CustomerException {
		List<Customer> list = cdao.findByAgeBetween(start_age, end_age);
		

		if(list.isEmpty()) {
			throw new CustomerException("Not Found ...");
		}else {
			return list;
		}
	}

	@Override
	public List<CustomerDTO> getNameAddressAgeOfAllCustomers() throws CustomerException {
		
		List<CustomerDTO> list = cdao.getNameAddressAgeOfAllCustomer();
		
		if(list.isEmpty()) {
			throw new CustomerException("Not Found ...");
		}else {
			return list;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
}
