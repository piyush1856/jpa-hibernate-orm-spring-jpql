package com.masai.injectingCollection;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		A a1 = ctx.getBean("aid",A.class);
//		a1.show();
		
		
		Collage collage = ctx.getBean("cl1",Collage.class);
		
		List<Student> students= collage.getStudents();
		
		System.out.println("Collage name is "+collage.getCollageName());
		System.out.println("-----------------------------");
		
		students.forEach(student -> {
			student.displayDetails();
			System.out.println("==================");
		});
		
		
	}

}
