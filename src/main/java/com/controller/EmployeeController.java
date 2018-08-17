/*****************************************************
 *  HISTORY
 *  FileName:Employee.java
 *  Package:com.controller
 *  Project:Demo
 *  Version:1.0
 *  Date:2018年8月12日 zlf创建文件
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

import com.pojo.EmployeeInfo;
import com.service.EmployeeService;

/**
 * <p>
 * 
 * </p>
 * 
 * @Copyright (C),zm
 * @author zm
 * @Date:2018年8月12日
 */
@Controller
@RequestMapping("/employeeController")
public class EmployeeController {
	@Resource
	private EmployeeService es;

	@RequestMapping("/queryAllEmp.do")
	public String queryAllEmp(HttpServletRequest request, HttpServletResponse response) {
		List<EmployeeInfo> list = es.queryEmp(request, response);
		request.setAttribute("emplist", list);
		return "../view/emp/employee-list.jsp";

	}
}
