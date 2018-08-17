/*****************************************************
 *  HISTORY
 *  FileName:JobServiceImp.java
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

import com.mapper.JobsMapper;
import com.model.Jobs;
import com.service.JobService;

/**
 * <p>
 * 所有职位相关的服务层
 * </p>	
 * @Copyright (C),zm
 * @author zm
 * @Date:2018年8月12日
 */
@Service
public class JobServiceImp implements JobService {
	@Resource 
	private  JobsMapper jm;

	@Override
	public List<Jobs> queryJobs(HttpServletRequest request, HttpServletResponse response) {
		
		return jm.queryAllJobs();
	}

}
