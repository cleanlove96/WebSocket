/*****************************************************
 *  HISTORY
 *  FileName:TitlesServiceImp.java
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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.TitlesMapper;
import com.pojo.TitlesPub;
import com.service.TitlesService;

/**
 * <p>
 * 书籍信息服务层
 * </p>
 * 
 * @Copyright (C),zm
 * @author zm
 * @Date:2018年8月12日
 */
@Service
public class TitlesServiceImp implements TitlesService {
	@Autowired
	private TitlesMapper tm;

	@Override
	public List<TitlesPub> queryAllTitles(HttpServletRequest request, HttpServletResponse response) {
         
		return tm.queryAllTitles();
	}

}
