package com.masai.dummyLayerApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		PresentationBean pb = ctx.getBean("pb",PresentationBean.class);
		pb.present();
		
		
	
		
		
	}

}
