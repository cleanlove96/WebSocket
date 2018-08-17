/*****************************************************
 *  HISTORY
 *  FileName:LoginDoController.java
 *  Package:com.controller
 *  Project:Demo
 *  Version:1.0
 *  Date:2018年8月11日 zlf创建文件
 **********修改记录*************
 * Date:          Author:
 *
 *******************************************************/
package com.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.LoginDoService;

/**
 * <p>
 * 
 * </p>
 * 
 * @Copyright (C),zm
 * @author zm
 * @Date:2018年8月11日
 */
@Controller
@RequestMapping("/loginDoController")
public class LoginDoController {
	@Resource
	private LoginDoService ls;

	/***
	 * 
	 * <p>
	 * Success登陆成功 ErrorPassword密码错误 ErrorUserName用户名错误
	 * </p>
	 * 
	 * @author zm
	 * @Date 2018年8月11日
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/doLogin.ajax")
	public @ResponseBody String dolgin(HttpServletRequest request, HttpServletResponse response) {
		return ls.doLogin(request, response);

	}

	@RequestMapping("/index.do")
	public String doindex(HttpServletRequest request,HttpServletResponse response) {
		ls.showIndex(request, response);
		return "../index.jsp";
	}
	@RequestMapping("/showWelcome.do")
	public String showWelcomePage(HttpServletRequest request,HttpServletResponse response) {
		 ls.showWelcome(request, response);
		return "../welcome.jsp";
		
	}
}
