/*****************************************************
 *  HISTORY
 *  FileName:EmployeeServiceImp.java
 *  Package:com.service.impl
 *  Project:Demo
 *  Version:1.0
 *  Date:2018年8月12日 zlf创建文件
 **********修改记录*************
 * Date:          Author:
 *
 *******************************************************/
package com.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.mapper.EmployeeMapper;
import com.model.Employee;
import com.pojo.EmployeeInfo;
import com.service.EmployeeService;

/**
 * <p>
 * 职员相关增删改查
 * </p>	
 * @Copyright (C),zm
 * @author zm
 * @Date:2018年8月12日
 */
@Service
public class EmployeeServiceImp implements EmployeeService {
	@Resource
	private  EmployeeMapper em;

	@Override
	public List<EmployeeInfo> queryEmp(HttpServletRequest request,HttpServletResponse response) {
	
		return em.queryAllEmp();
	}

}
