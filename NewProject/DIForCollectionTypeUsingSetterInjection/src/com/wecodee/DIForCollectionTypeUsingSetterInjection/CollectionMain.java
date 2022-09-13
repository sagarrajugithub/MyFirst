package com.wecodee.DIForCollectionTypeUsingSetterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("CollectionConfig.xml");
				
		CollectionType c=(CollectionType)con.getBean("cref");		
		
		System.out.println(c);
		
	}

}
