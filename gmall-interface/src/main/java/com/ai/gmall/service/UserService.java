package com.ai.gmall.service;

import java.util.List;

import com.ai.gmall.bean.UserAddress;

public interface UserService {
	public List<UserAddress> getUserAddressList(String userId);
}
