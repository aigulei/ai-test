package com.ai;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) throws IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-dubbo-provider.xml");
		
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for(String beanDefinitionName:beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
		System.out.println("服务注册成功....");
		//为了能够正常接收请求，需要阻塞线程
		System.in.read();
	}
}
