package com.ai.dubbo.service.impl;

import com.ai.dubbo.domain.User;
import com.ai.dubbo.service.IUserService;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements IUserService {

	@Override
	public User getUserById(Long id) {
		return new User(id,"zhangsan");
	}

}
