package com.niit.shoppingcart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.bean.Category;

public class TestCategory {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart.bean");
		context.refresh();
		context.getBean("category");
		
	Category category = (Category)context.getBean("category");
		if(category == null)
		{ 
			System.out.println("category not created");
		}
			else
			{
			System.out.println("category  created");
			
		}
	}
}