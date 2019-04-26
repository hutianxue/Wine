package com.buba.servlet;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import com.buba.service.BookService;

@Controller
public class BookServlet {
	@Autowired
	private BookService bookService;
	public void save() {
		bookService.save();
	}
}
