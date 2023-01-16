package com.masai.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component(value = "wer")
public class HelloWorld {

    public void print() {
        System.out.println("Hey there!");
    }
}
