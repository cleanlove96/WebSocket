/*****************************************************
 *  HISTORY
 *  FileName:PublisherServiceImp.java
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

import com.mapper.PublisherMapper;
import com.model.Publisher;
import com.service.PublisherService;

/**
 * <p>
 * 出版社相关服务层
 * </p>	
 * @Copyright (C),zm
 * @author zm
 * @Date:2018年8月12日
 */
@Service
public class PublisherServiceImp implements PublisherService {
	@Resource
	private  PublisherMapper pm;

	@Override
	public List<Publisher> queryAllPub(HttpServletRequest request, HttpServletResponse response) {
		
		return pm.queryAllPub();
	}

	

}
