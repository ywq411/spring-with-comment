package com.hexin.service;

import com.hexin.dao.MyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService implements com.hexin.service.Service {
	@Autowired
	private MyDao dao;

	public MyDao getDao() {
		return dao;
	}

	public void doSomething() {
		System.out.println("hello world");
	}
}
