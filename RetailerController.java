package com.fruitsalesplatform.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class RetailerController extends BaseController{
	//跳转至列表
	@RequestMapping("/retailer/list.action")
	public String list() {
		return "/home.jsp";//转向首页
	}

}
