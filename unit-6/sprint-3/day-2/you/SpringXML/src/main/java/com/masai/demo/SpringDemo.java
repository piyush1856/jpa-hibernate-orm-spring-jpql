package com.masai.demo;

import com.masai.demo.autowired.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class SpringDemo {

    public static void main(String[] args) {

        //does not exist
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        //instantiation phase
        //initialisation phase

      /*  ClassPathXmlApplicationContext ctxt = (ClassPathXmlApplicationContext)context;
        Scanner sc = new Scanner(System.in);

        //service
        Employee emp = context.getBean("employee", Employee.class);
        emp.setEid(sc.nextInt());
        emp.setEname(sc.next());*/

/*
        System.out.println(emp.getEname());
        System.out.println(emp.getDepartment().getDeptName());

        //destruction phase
        ctxt.close();*/



        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");

        System.out.println(obj1 == obj);

       /* HelloShubhendu helloShubhendu = (HelloShubhendu) context.getBean("helloShubhendu");

        System.out.println("Message is : " + helloShubhendu.getHello().getMessage());
        System.out.println("Name is : " + helloShubhendu.getName());*/
    }
}
