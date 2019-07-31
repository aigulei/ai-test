package com.ai.gmall.service;

import java.util.List;

import com.ai.gmall.bean.UserAddress;

public interface OrderService {
	
	public List<UserAddress> initOrder(String userId);
}
