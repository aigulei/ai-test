package com.ai;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.dubbo.service.IUserService;
import com.alibaba.dubbo.config.annotation.Reference;

//RunWith是junit4才有的，3没有
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-dubbo-consumer.xml")
public class SpringDubboConsumerTest {
	
	//@Autowired
	@Reference
	private IUserService userService;
	
	@Test
	public void testName() throws Exception {
		System.out.println(userService.getUserById(1L));
	}
	
}
