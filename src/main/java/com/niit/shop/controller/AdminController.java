package com.niit.shop.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.shop.dao.Productdao;
import com.niit.shop.model.Product;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	Product product;
	
	@Autowired
	Productdao productdao;
	
	@RequestMapping(value="/addproduct",method=RequestMethod.GET)
	public String productPage(Model model) {
		
		model.addAttribute("product",product);
		model.addAttribute("products", productdao.allProducts());
		return "product";
	}
	
	@RequestMapping(value="/addproduct",method=RequestMethod.POST)
	public String addProduct(@ModelAttribute("product")Product product,HttpServletRequest request)
	{
		
		productdao.insert(product);
		
		if(product.getFile()!=null)
		{
			/*System.out.println(product.getFile().getOriginalFilename());*/
			try {
				InputStream inputStream=	product.getFile().getInputStream();
		        System.out.println(request.getServletContext().getRealPath("/"));
		        File file=new File(request.getServletContext().getRealPath("/")+"resources/products");
		        if(!file.exists())
		        	 file.mkdirs();
		        
				FileOutputStream fileOutputStream=new FileOutputStream(file+"/"+product.getProduct_id()+".jpg");
				fileOutputStream.write(product.getFile().getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
		return "redirect:/admin/addproduct";
	}
	
	
	

}
