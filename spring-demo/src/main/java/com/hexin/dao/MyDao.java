package com.hexin.dao;

import com.hexin.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class MyDao {
	@Autowired
	private MyService service;
}
