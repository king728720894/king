package com.kexun.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.kexun.service.HqyService;

public class MyController implements Controller {
//1.springMVC的controller用去前后端交互,代替Struts的action
//2.如果是为了优化springmvc,此类控制器不要设置属性
	//3.此方法用于接收前段请求,同时也能响应数据,并能跳转到其它视图
	//携带数据有两种方式
	//(1)运用req/resp
	//(2)使用自己的模型与视图组件
	
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
	     //接收前段请求,获取数据
		String uname=req.getParameter("uname");
		//创建一个模型视图组件,用于回传数据并设置跳转
		ModelAndView mv=new ModelAndView();
		if(uname.equals("zs")) {
			mv.addObject("list",HqyService.getList());
			mv.setViewName("display.jsp");
		}else {
			mv.setViewName("info.html");
		}
		return mv;//默认转发到一个视图
	}

}
