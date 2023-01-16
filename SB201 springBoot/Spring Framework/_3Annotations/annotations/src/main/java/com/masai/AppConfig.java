package com.masai;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration   //replacement of XML file
@ComponentScan(basePackages = "com.masai")
public class AppConfig {

}
