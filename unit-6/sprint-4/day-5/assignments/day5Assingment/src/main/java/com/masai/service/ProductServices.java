package com.masai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.exception.ProductException;
import com.masai.model.Product;
import com.masai.model.ProductDTO;

@Service
public interface ProductServices {
	
	public Product registerProduct(Product pro) throws ProductException;
	
	
	public List<Product> getAllProducts()throws ProductException;
	
	public Product updateProdcut(Product p)throws ProductException;
	
	public Product deleteProductById(Integer pid)throws ProductException;
	
	public List<Product> getsProductByCategory(String category)throws ProductException;
	
	public List<ProductDTO> getProductNameQtyPrice() throws ProductException;

}
