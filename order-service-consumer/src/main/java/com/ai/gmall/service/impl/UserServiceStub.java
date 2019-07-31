package com.ai.gmall.service.impl;

import java.util.List;

import com.ai.gmall.bean.UserAddress;
import com.ai.gmall.service.UserService;

public class UserServiceStub implements UserService{
	private final UserService userService;
	
	/**
	 * 传入的是userService远程的代理对象
	 * @param userService
	 */
	public UserServiceStub(UserService userService) {
		this.userService = userService;
	}

	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("userServiceStub....");
		if(userId!=null && !userId.equals("")) {
			return userService.getUserAddressList(userId);
		}
		return null;
	}

}
