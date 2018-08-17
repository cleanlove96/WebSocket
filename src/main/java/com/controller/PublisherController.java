/*****************************************************
 *  HISTORY
 *  FileName:PublisherController.java
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

import com.model.Publisher;
import com.service.PublisherService;

/**
 * <p>
 * 出版社相关控制层
 * </p>	
 * @Copyright (C),zm
 * @author zm
 * @Date:2018年8月12日
 */
@Controller
@RequestMapping("/publisherController")
public class PublisherController {
	@Resource
	private  PublisherService ps;
	@RequestMapping("/queryAllPub.do")
	public String  queryAllPub(HttpServletRequest request,HttpServletResponse response) {
		List <Publisher> list=ps.queryAllPub(request, response);
		request.setAttribute("listPub", list);
		return "../view/pub/pub-list.jsp";
		
	}

}
