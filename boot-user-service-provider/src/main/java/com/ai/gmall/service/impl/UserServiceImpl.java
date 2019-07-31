package com.ai.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ai.gmall.bean.UserAddress;
import com.ai.gmall.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service //暴露服务
@Component
public class UserServiceImpl implements UserService{
	
	@HystrixCommand
	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("UserService...........3");
		UserAddress address1 = new UserAddress(1, "江苏南京", "666", "sky", "13813813813", "0");
		UserAddress address2 = new UserAddress(2, "北京东城", "888", "sky", "13813813813", "1");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		if(Math.random()>0.5) {
			throw new RuntimeException();
		}
		return Arrays.asList(address1,address2);
	}

}
