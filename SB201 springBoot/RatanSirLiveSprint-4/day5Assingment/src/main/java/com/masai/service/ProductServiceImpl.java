package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.ProductException;
import com.masai.model.Product;
import com.masai.model.ProductDTO;
import com.masai.repository.ProductDao;

@Service
public class ProductServiceImpl implements ProductServices{
	
	@Autowired
	private ProductDao pdao;
	
	

	@Override
	public Product registerProduct(Product pro) throws ProductException {
		
		Product product = pdao.save(pro); 
		
		return product;
	}



	@Override
	public List<Product> getAllProducts() throws ProductException {
		
		List<Product> list = pdao.findAll();
		if(list.isEmpty()) throw new ProductException("No Product Found..");
		return list;
	}



	@Override
	public Product updateProdcut(Product p) throws ProductException {
		
	     Optional<Product> product =  pdao.findById(p.getProductId());
	     
	     if(product.isPresent()) {
	    	 
	    	return pdao.save(p);
	     }else {
	    	throw new ProductException("Product Not found with productId : "+p.getProductId()); 
	     }
	}



	@Override
	public Product deleteProductById(Integer pid) throws ProductException {
		  Optional<Product> product =  pdao.findById(pid);
		     
		     if(product.isPresent()) {
		    	
		    	pdao.deleteById(pid);
		    	return product.get();
		     }else {
		    	throw new ProductException("Product Not found with productId : "+pid); 
		     }
	}



	@Override
	public List<Product> getsProductByCategory(String category) throws ProductException {
		
		List<Product> products = pdao.findByCategory(category);
		
		if(products.isEmpty()) {
			throw new ProductException("Product Not found with category : "+category);
		}else {
			return products;
		}
	}



	@Override
	public List<ProductDTO> getProductNameQtyPrice() throws ProductException {
		
		 List<ProductDTO> products = pdao.getProductNameQtyPrice();
		 
		if(products.isEmpty()) {
			throw new ProductException("No any Product in database..");
		}else {
			return products;
		}
	}

}
