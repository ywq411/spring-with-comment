package com.hexin.configuration;

import com.hexin.controller.MyController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

public class ImportedConfig {
	@Bean
	public MyController controller() {
		return new MyController();
	}
}
