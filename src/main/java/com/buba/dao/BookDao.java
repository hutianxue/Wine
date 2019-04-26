package com.buba.dao;

import org.springframework.stereotype.Repository;

@Repository("bb")
public class BookDao {
	
	public void save() {
		System.out.println("BookDao保存的数据");
		
	}

}
