package com.hnust.testajax.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestAjaxController {
	@RequestMapping("/demo1.do")
	@ResponseBody//将User对象信息转化为JSON字符串信息
	public List<User> execute(){
		List<User> lu=new ArrayList<User>();
		User user1 = new User();
		user1.setId(1);
		user1.setName("tom");
		user1.setTelephone("15200340738");
		user1.setEmail("tom@gmail.com");
		User user2 = new User();
		user2.setId(2);
		user2.setName("rose");
		user2.setTelephone("15200340739");
		user2.setEmail("rose@gmail.com");
		lu.add(user1);
		lu.add(user2);
		return lu;
	}
}
