package com.hexin.configuration;

import com.hexin.dao.MyDao;
import com.hexin.service.MyService;
import com.hexin.service.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.Ordered;
import org.springframework.core.PriorityOrdered;
import org.springframework.core.annotation.Order;

@Configuration
@Import(AbstractConfiguration.class)
@ComponentScan("com.hexin")
public class MyConfiguration {

	@Bean
	public Service service2() {
		return new MyService();
	}
}
