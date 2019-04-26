package com.buba.dao;

import org.springframework.stereotype.Repository;

@Repository
public class BookDaoExer extends BookDao{
	public void save() {
		System.out.println("BookDaoExer保存的数据");
	}
}
