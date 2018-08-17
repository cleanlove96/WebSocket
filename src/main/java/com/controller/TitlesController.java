/*****************************************************
 *  HISTORY
 *  FileName:TitlesController.java
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

import com.pojo.TitlesPub;
import com.service.TitlesService;

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
@RequestMapping("/titlesController")
public class TitlesController {
	@Resource
	private  TitlesService ts;
	@RequestMapping("/queryAllTitles.do")
	public String queryAllTitles(HttpServletRequest request, HttpServletResponse response) {
		List <TitlesPub> list=ts.queryAllTitles(request, response);
		request.setAttribute("titleList", list);
		return "../view/titles/title-list.jsp";

	}
}
