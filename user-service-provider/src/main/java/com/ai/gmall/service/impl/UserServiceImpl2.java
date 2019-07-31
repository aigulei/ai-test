package com.ai.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import com.ai.gmall.bean.UserAddress;
import com.ai.gmall.service.UserService;

public class UserServiceImpl2 implements UserService{

	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("UserServiceImpl ...v2...");
		UserAddress address1 = new UserAddress(1, "江苏南京", "666", "sky", "13813813813", "0");
		UserAddress address2 = new UserAddress(2, "北京东城", "888", "sky", "13813813813", "1");
	
		return Arrays.asList(address1,address2);
	}

}
