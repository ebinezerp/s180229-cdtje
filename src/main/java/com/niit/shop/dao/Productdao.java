package com.niit.shop.dao;

import java.util.List;

import com.niit.shop.model.Product;

public interface Productdao {
	
	public boolean insert(Product product);
	public boolean update(Product product);
	public Product getProduct(int productid);
	public List<Product> allProducts();

}
