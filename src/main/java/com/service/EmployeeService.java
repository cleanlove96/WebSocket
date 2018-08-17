/*****************************************************
 *  HISTORY
 *  FileName:EmployeeService.java
 *  Package:com.service
 *  Project:Demo
 *  Version:1.0
 *  Date:2018年8月12日 zlf创建文件
 **********修改记录*************
 * Date:          Author:
 *
 *******************************************************/
package com.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Employee;
import com.pojo.EmployeeInfo;

/**
 * <p>
 * 
 * </p>
 * 
 * @Copyright (C),zm
 * @author zm
 * @Date:2018年8月12日
 */
public interface EmployeeService {
	/**
	 * 
	 * <p>
	 * 查询所的职员信息
	 * </p>
	 * @author zm
	 * @Date 2018年8月12日
	 * @return
	 */
	List<EmployeeInfo> queryEmp(HttpServletRequest request,HttpServletResponse response);
}
