package com.buba.test1;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.buba.service.BookService;

public class test2 {
	@Test
	public void test1() {
		ClassPathXmlApplicationContext ioc =new  ClassPathXmlApplicationContext("SpringIoc.xml");
		BookService db= (BookService) ioc.getBean("bookService");
		db.save();
	}
}
