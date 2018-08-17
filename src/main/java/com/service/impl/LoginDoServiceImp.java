/*****************************************************
 *  HISTORY
 *  FileName:LoginDoServiceImp.java
 *  Package:com.service.impl
 *  Project:Demo
 *  Version:1.0
 *  Date:2018年8月11日 zlf创建文件
 **********修改记录*************
 * Date:          Author:
 *
 *******************************************************/
package com.service.impl;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.mapper.UserMapper;
import com.model.User;
import com.service.LoginDoService;

/**
 * <p>
 * 
 * </p>	
 * @Copyright (C),zm
 * @author zm
 * @Date:2018年8月11日
 * 
 */
@Service
public class LoginDoServiceImp implements LoginDoService {
	@Resource
	private  UserMapper um;
	SimpleDateFormat sdf=new SimpleDateFormat("YYYY年MM月dd日hh时mm分ss秒");
/**
 * 登陆功能
 */
	@Override
	public String doLogin(HttpServletRequest request, HttpServletResponse response) {
		String username=request.getParameter("username");
		User u=new User();
		u.setUserName(username);		
		User user=um.selectByUserName(u);
		if(user!=null) {
			String password=request.getParameter("password");
			System.out.println("密码：----"+password);
			if(user.getPassword().equals(password)) {
				request.getSession().setAttribute("Account", user.getId());
				Date date=new Date();
				request.getSession().setAttribute("dateTime", date);
				return "Success";
			}else {
				return "ErrorPassword";
			}
		}else {
			return "ErrorUserName";
		}
	
		
	}
@Override
public void showWelcome(HttpServletRequest request, HttpServletResponse response) {
	int   accountId= (int) request.getSession().getAttribute("Account");
	User user=um.selectByPrimaryKey(accountId);
	request.setAttribute("UserName", user.getUserName());
	Date date=(Date) request.getSession().getAttribute("dateTime");
	request.setAttribute("dateTime", sdf.format(date));
	request.setAttribute("loginAdd", request.getRemoteAddr());
	try {
		InetAddress inet = InetAddress.getLocalHost();
		request.setAttribute("ServerName", inet.getHostName());
	} catch (UnknownHostException e) {
		// TODO 自动生成的 catch 块
		request.setAttribute("ServerName", "获取失败");
	}
	request.setAttribute("SessionTimeOut", request.getSession().getMaxInactiveInterval());
	
}
@Override
public void showIndex(HttpServletRequest request, HttpServletResponse response) {
	int   userId=(int) request.getSession().getAttribute("Account");
	User user=um.selectByPrimaryKey(userId);
	request.setAttribute("userName", user.getUserName());
	
}


}
