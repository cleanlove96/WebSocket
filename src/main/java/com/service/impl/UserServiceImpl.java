/*****************************************************
 *  HISTORY
 *  FileName:UserServiceImpl.java
 *  Package:com.service.impl
 *  Project:Demo
 *  Version:1.0
 *  Date:2018年8月7日 zlf创建文件
 **********修改记录*************
 * Date:          Author:
 *
 *******************************************************/
package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.UserMapper;
import com.model.User;
import com.service.UserService;

/**
 * <p>
 * 
 * </p>	
 * @Copyright (C),zm
 * @author zm
 * @Date:2018年8月7日
 */
@Service
public class UserServiceImpl implements UserService{
	@Resource
	private  UserMapper um;

	@Override
	public List<User> getAllUser() {
	      
		return um.queryAllUser();
	}

}
