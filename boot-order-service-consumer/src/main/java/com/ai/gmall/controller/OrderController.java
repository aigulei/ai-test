package com.ai.gmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ai.gmall.bean.UserAddress;
import com.ai.gmall.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	OrderService orderService;
	
	@RequestMapping("/initOrder")
	public @ResponseBody List<UserAddress> initOrder(@RequestParam("uid")String userId) {
		return orderService.initOrder(userId);
	}
}
