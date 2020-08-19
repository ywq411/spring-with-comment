package com.hexin;

import com.hexin.configuration.AbstractConfiguration;
import com.hexin.configuration.MyConfiguration;
import com.hexin.dao.MyDao;
import com.hexin.service.MyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class, AbstractConfiguration.class);
		MyService service = context.getBean(MyService.class);
		MyDao dao = context.getBean(MyDao.class);
		service.doSomething();
	}
}
