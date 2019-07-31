package com.ai.gmall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ai.gmall.bean.UserAddress;
import com.ai.gmall.service.OrderService;
import com.ai.gmall.service.UserService;

/**
 * 1：将服务提供者注册到注册中心（暴露服务）
 * 	1）导入dubbo依赖
 * 2：让服务消费者去注册中心订阅服务提供者的服务地址
 *
 */
@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	UserService userService;
	
	public List<UserAddress> initOrder(String userId) {
		System.out.println("用户ID："+userId);
		//1、查询用户的收获地址
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		for(UserAddress userAddress:addressList) {
			System.out.println(userAddress.getUserAddress());
		}
		return addressList;
	}

}
