/*****************************************************
 *  HISTORY
 *  FileName:UserNameServiceImp.java
 *  Package:com.service.impl
 *  Project:Demo
 *  Version:1.0
 *  Date:2018年8月8日 zlf创建文件
 **********修改记录*************
 * Date:          Author:
 *
 *******************************************************/
package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.UserMapper;
import com.pojo.UserRoleName;
import com.service.UserNameService;

/**
 * <p>
 * 
 * </p>	
 * @Copyright (C),zm
 * @author zm
 * @Date:2018年8月8日
 */
@Service
public class UserNameServiceImp implements UserNameService {
	@Resource
	private  UserMapper um;

	@Override
	public List<UserRoleName> getAllUserName() {
		
		return um.getAllUserName();
	}

}
