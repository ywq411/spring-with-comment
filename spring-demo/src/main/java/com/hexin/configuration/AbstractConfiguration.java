package com.hexin.configuration;

import com.hexin.service.MyService2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.Order;

@Import(MyConfiguration.class)
public class AbstractConfiguration {
	@Bean
	public A post() {
		return new A();
	}

	@Bean
	public MyService2 myService2() {
		post();
		return new MyService2();
	}
}
