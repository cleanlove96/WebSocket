/*****************************************************
 *  HISTORY
 *  FileName:JobService.java
 *  Package:com.service
 *  Project:Demo
 *  Version:1.0
 *  Date:2018年8月12日 zlf创建文件
 **********修改记录*************
 * Date:          Author:
 *
 *******************************************************/
package com.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Jobs;

/**
 * <p>
 *job相关服务层接口
 * </p>	
 * @Copyright (C),zm
 * @author zm
 * @Date:2018年8月12日
 */
public interface JobService {
List<Jobs> queryJobs(HttpServletRequest request,HttpServletResponse response);
}
