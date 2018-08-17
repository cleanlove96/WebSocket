/*****************************************************
 *  HISTORY
 *  FileName:LoginDoService.java
 *  Package:com.service
 *  Project:Demo
 *  Version:1.0
 *  Date:2018年8月11日 zlf创建文件
 **********修改记录*************
 * Date:          Author:
 *
 *******************************************************/
package com.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.User;

/**
 * <p>
 * 
 * </p>
 * 
 * @Copyright (C),zm
 * @author zm
 * @Date:2018年8月11日
 */
public interface LoginDoService {
	String doLogin(HttpServletRequest request, HttpServletResponse response);
	void  showWelcome(HttpServletRequest request,HttpServletResponse response);
	void showIndex(HttpServletRequest request,HttpServletResponse response);
}
