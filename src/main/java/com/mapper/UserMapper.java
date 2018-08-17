package com.mapper;

import java.util.List;
import java.util.Map;

import com.model.User;
import com.pojo.UserRoleName;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	/**
	 * <p>
	 * 
	 * </p>
	 * @author zm
	 * @Date 2018年8月7日
	 */
	List<User> queryAllUser();

	/**
	 * <p>
	 * 
	 * </p>
	 * @author zm
	 * @Date 2018年8月8日
	 * @return
	 */
	List<UserRoleName> getAllUserName();

	/**
	 * <p>
	 * 
	 * </p>
	 * @author zm
	 * @Date 2018年8月11日
	 */
	void queryOne();

	/**
	 * <p>
	 * 
	 * </p>
	 * @author zm
	 * @Date 2018年8月11日
	 * @param username
	 * @return
	 */
	User selectByUserName(User U);
}