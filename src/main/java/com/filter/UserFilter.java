/*****************************************************
 *  HISTORY
 *  FileName:UserFilter.java
 *  Package:filter
 *  Project:Demo
 *  Version:1.0
 *  Date:2018年8月11日 zlf创建文件
 **********修改记录*************
 * Date:          Author:
 *
 *******************************************************/
package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import com.mapper.UserMapper;
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
public class UserFilter implements Filter {
	private ApplicationContext context;// IOC容器
	private ServletResponse response;
	private HttpServletRequest req;
	private UserMapper um;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		this.response = response;
		req = (HttpServletRequest) request;
		String path = req.getServletPath();
		if (path.equals("/Login.jsp")) {
			chain.doFilter(request, response);
		} else {
			Integer userId =   (Integer) req.getSession().getAttribute("Account");
			if (userId != null) {
				User user = um.selectByPrimaryKey(userId);
				if (user != null) {
					chain.doFilter(request, response);// 放行
				} else {
					toLoginPage();
				}
			} else {
				toLoginPage();
			}
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// 在非IOC容器生成的对象中获取Spring的IOC容器。
		context = WebApplicationContextUtils.getWebApplicationContext(filterConfig.getServletContext());
		um = context.getBean(UserMapper.class);

	}

	/**
	 * 
	 * <p>
	 * 跳转至登录页面
	 * </p>
	 * 
	 * @author zm
	 * @Date 2018年8月11日
	 */
	private void toLoginPage() {
		HttpServletResponse res = (HttpServletResponse) response;
		try {
			res.sendRedirect(req.getContextPath() + "/Login.jsp");
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
