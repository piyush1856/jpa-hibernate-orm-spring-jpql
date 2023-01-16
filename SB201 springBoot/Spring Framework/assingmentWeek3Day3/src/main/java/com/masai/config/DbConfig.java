package com.masai.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan(basePackages = {"com.masai._4Question4"})
@PropertySources({
	@PropertySource("dbDetail.properties")
})
public class DbConfig {

}
