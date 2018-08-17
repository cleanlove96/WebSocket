/*****************************************************
 *  HISTORY
 *  FileName:UserNameController.java
 *  Package:com.controller
 *  Project:Demo
 *  Version:1.0
 *  Date:2018年8月8日 zlf创建文件
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

import com.pojo.UserRoleName;
import com.service.UserNameService;



/**
 * <p>
 * 
 * </p>	
 * @Copyright (C),zm
 * @author zm
 * @Date:2018年8月8日
 */
@Controller
@RequestMapping("userNameController")
public class UserNameController {
	@Resource
	private UserNameService uns;
	@RequestMapping("/getUserRole.do")
	public String getUserRoleName(HttpServletRequest request, HttpServletResponse response) {
	List<UserRoleName> list = uns.getAllUserName();
	request.setAttribute("list", list);
	System.out.println("222222222");
	return "../view/user/userRole-list.jsp" ;
	}
}
