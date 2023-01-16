package com.masai.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Component(value = "shubh")
@Scope("singleton")
public class HelloShubhendu {

    @Value("Shubhendu")
    String name;

    @Autowired
    @Qualifier("wer")
    private HelloWorld helloWorld;

    @Autowired
    @Qualifier("cities")
    private List<String> cities;

    public List<String> getCities() {
        return cities;
    }

    public void printContent() {
        System.out.println("Inside Shubhendu class");
        helloWorld.print();
    }


    @PostConstruct
    public void welcome() {
        System.out.println("Welcome to my world!");
    }

    @PreDestroy
    public void byebye() {
        System.out.println("Bye Bye");
    }

    public String getName() {
        return name;
    }
}
