package com.ai.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.gmall.bean.UserAddress;
import com.ai.gmall.service.OrderService;
import com.ai.gmall.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * 1：将服务提供者注册到注册中心（暴露服务）
 * 	1）导入dubbo依赖
 * 2：让服务消费者去注册中心订阅服务提供者的服务地址
 *
 */
@Service
public class OrderServiceImpl implements OrderService{
	
	@Reference(loadbalance="roundrobin",timeout=1000)
	UserService userService;
	
	@HystrixCommand(fallbackMethod="hello")
	@Override
	public List<UserAddress> initOrder(String userId) {
		System.out.println("用户ID："+userId);
		//1、查询用户的收获地址
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		if(addressList!=null) {
			for(UserAddress userAddress:addressList) {
				System.out.println(userAddress.getUserAddress());
			}
		}
		
		return addressList;
	}
	
	
	public List<UserAddress> hello(String userId) {
		
		return Arrays.asList(new UserAddress(10, "南京建邺", "666", "abc", "166", "0"));
	}
}
