package com.hexin.configuration;

import com.hexin.dao.MyDao;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class A implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("a before init " + beanName);
		return bean;
	}
//	@Override
//	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//		if(bean instanceof MyDao){
//			return new MyDao();
//		}
//		return bean;
//	}
}
