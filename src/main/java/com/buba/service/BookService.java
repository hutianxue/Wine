package com.buba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.buba.dao.BookDao;

@Service
public class BookService {
	@Autowired(required=false)
	@Qualifier("bb")
	private BookDao bookDao;
	public void save() {
		bookDao.save();
		System.out.println("Service保存的业务逻辑");
	}
}
