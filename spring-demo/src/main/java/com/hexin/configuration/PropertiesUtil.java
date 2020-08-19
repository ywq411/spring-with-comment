package com.hexin.configuration;

import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

@Component
public class PropertiesUtil implements EmbeddedValueResolverAware {

	private StringValueResolver resolver;

	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		this.resolver = resolver;
	}


	/**
	 * 获取属性，直接传入属性名称即可
	 * @param key
	 * @return
	 */
	public String getPropertiesValue(String key) {
		StringBuilder name = new StringBuilder("${").append(key).append("}");
		return resolver.resolveStringValue(name.toString());
	}

}
