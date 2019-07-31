package com.ai.gmall;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
		ioc.start();
		String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
		for(String s:beanDefinitionNames) {
			System.out.println(s);
		}
		System.out.println("启动完成....");
		System.in.read();
	}
}
