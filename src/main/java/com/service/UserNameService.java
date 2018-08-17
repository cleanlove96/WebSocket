/*****************************************************
 *  HISTORY
 *  FileName:UserNameService.java
 *  Package:com.service
 *  Project:Demo
 *  Version:1.0
 *  Date:2018年8月8日 zlf创建文件
 **********修改记录*************
 * Date:          Author:
 *
 *******************************************************/
package com.service;

import java.util.List;

import javax.annotation.Resource;

import com.pojo.UserRoleName;

/**
 * <p>
 * 
 * </p>
 * 
 * @Copyright (C),zm
 * @author zm
 * @Date:2018年8月8日
 */
public interface UserNameService {
	List<UserRoleName> getAllUserName();

}
