package com.fruitsalesplatform.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.fruitsalesplatform.entity.User;
import com.fruitsalesplatform.service.TestService;


@Controller
@RequestMapping(value="/TestController",produces="text/html;charset=UTF-8")
public class TestController {
	@Autowired
	private TestService testService;
	
	
	@RequestMapping(value="/findUser.action")
	private String findUser(User user,Model model) {
		System.out.println("TestController.findUser get!");
		if(user.getName()==null)
			user.setName("");
		List<User> userList=testService.findUserByName(user);
		model.addAttribute("userList",userList);
		return "/test/test.jsp";
	}

}
