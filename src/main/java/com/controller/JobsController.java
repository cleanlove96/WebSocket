/*****************************************************
 *  HISTORY
 *  FileName:JobsController.java
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

import com.model.Jobs;
import com.service.JobService;

/**
 * <p>
 * 职位相关查询
 * </p>
 * 
 * @Copyright (C),zm
 * @author zm
 * @Date:2018年8月12日
 */
@Controller
@RequestMapping("/JobsController")
public class JobsController {
	@Resource
	private JobService js;

	@RequestMapping("/queryAllJobs.do")
	public String queryAllJobs(HttpServletRequest request, HttpServletResponse response) {
		List<Jobs> list = js.queryJobs(request, response);
		request.setAttribute("jobList", list);
		return "../view/job/job-list.jsp";

	}
}
