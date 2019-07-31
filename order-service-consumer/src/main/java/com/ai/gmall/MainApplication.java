package com.ai.gmall;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ai.gmall.service.OrderService;

public class MainApplication {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("consumer.xml");
		
		OrderService orderService = ctx.getBean(OrderService.class);
		orderService.initOrder("1");
		
		System.in.read();
	}
}
