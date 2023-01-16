package com.masai.demo;

import com.masai.demo.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        /*HelloShubhendu obj = ctx.getBean("shubh", HelloShubhendu.class);
        obj.printContent();
        System.out.println(obj.getCities());
        System.out.println(obj.getName());*/

        DbConnector dbConnector = ctx.getBean("dbConnector", DbConnector.class);
        dbConnector.printAll();
    }
}
