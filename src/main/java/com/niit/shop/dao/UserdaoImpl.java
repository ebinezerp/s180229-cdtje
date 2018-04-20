package com.niit.shop.dao;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shop.model.User;
@Repository("userdao")
@Transactional
public class UserdaoImpl implements Userdao{
	
	@Autowired
	SessionFactory sessionFactory;

	public boolean insert(User user) {
		try
		{
			Session session=sessionFactory.getCurrentSession();
			session.save(user);
			return true;
		}catch(Exception e)
		{
			System.out.println(e);
			return false;
		}
	}

	public boolean update(User user) {
		try
		{
			Session session=sessionFactory.getCurrentSession();
			session.update(user);
			return true;
		}catch(Exception e)
		{
			System.out.println(e);
			return false;
		}	}

	public User getUser(int id) {
		try
		{
			Session session=sessionFactory.getCurrentSession();
		Query query=	session.createQuery("From User where user_id=:userid");
		 query.setParameter("userid", id);
		 User user=(User)query.getSingleResult();
			return user;
		}catch(Exception e)
		{
			System.out.println(e);
			return null;
		}
	}

	public User login(String username, String password) {
		// TODO Auto-generated method stub
		try
		{
			Session session=sessionFactory.getCurrentSession();
		Query query=	session.createQuery("From User where username=:username and password=:password");
		 query.setParameter("username", username);
		 query.setParameter("password", password);
		 User user=(User)query.getSingleResult();
			return user;
		}catch(Exception e)
		{
			System.out.println(e);
			return null;
		}
	}

}
