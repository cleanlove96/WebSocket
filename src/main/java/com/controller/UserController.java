/*****************************************************
 *  HISTORY
 *  FileName:UserController.java
 *  Package:com.controller
 *  Project:Demo
 *  Version:1.0
 *  Date:2018年8月7日 zlf创建文件
 **********修改记录*************
 * Date:          Author:
 *
 *******************************************************/
package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.User;
import com.service.UserService;

/**
 * <p>
 * 
 * </p>
 * 
 * @Copyright (C),zm
 * @author zm
 * @Date:2018年8月7日
 */
@Controller
@RequestMapping("userController")
public class UserController {
	@Resource
	private UserService us;

	@RequestMapping("/getUser.do")
	public String getAllUsers(HttpServletRequest request, HttpServletResponse response) {
		List<User> list = us.getAllUser();
		request.setAttribute("list", list);
		System.out.println("222222222");
		return "../view/user/admin-list.jsp";

	}
}
