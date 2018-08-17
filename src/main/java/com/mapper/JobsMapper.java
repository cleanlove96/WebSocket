package com.mapper;

import java.util.List;

import com.model.Jobs;

public interface JobsMapper {
    int deleteByPrimaryKey(Integer jobId);

    int insert(Jobs record);

    int insertSelective(Jobs record);

    Jobs selectByPrimaryKey(Integer jobId);

    int updateByPrimaryKeySelective(Jobs record);

    int updateByPrimaryKey(Jobs record);

	/**
	 * <p>
	 * 
	 * </p>
	 * @author zm
	 * @Date 2018年8月12日
	 */
	List <Jobs> queryAllJobs();
}