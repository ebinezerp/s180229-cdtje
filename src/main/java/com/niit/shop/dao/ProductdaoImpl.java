package com.niit.shop.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shop.model.Product;
@Repository("productdao")
@Transactional
public class ProductdaoImpl implements Productdao {
	
	@Autowired
	SessionFactory sessionFactory;

	public boolean insert(Product product) {
		
		try
		{
			Session session=sessionFactory.getCurrentSession();
			session.persist(product);
			return true;
		}catch (Exception e) {
			
			System.out.println(e);
			return false;
		}
	}

	public boolean update(Product product) {
		
		try
		{
			
			   /*Session session=sessionFactory.openSession();
			   Transaction tx=session.beginTransaction();*/
			
			Session session=sessionFactory.getCurrentSession();
			session.update(product);
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}

	public Product getProduct(int productid) {
		try
		{
			
		    Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from Product where product_id=:productid");
			query.setParameter("productid", productid);
			Product product=(Product)query.getSingleResult();
			
			return product;
		}catch(Exception e)
		{
			System.out.println(e);
			return null;
		}
	}

	public List<Product> allProducts() {
		// TODO Auto-generated method stub
		try
		{
			
		    Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from Product");
/*			ArrayList<Product> products=new ArrayList<Product>();*/
			List<Product> product=(List<Product>)query.getResultList();
			
			return product;
		}catch(Exception e)
		{
			System.out.println(e);
			return null;
		}
	}

}
