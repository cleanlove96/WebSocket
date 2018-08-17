package com.mapper;

import java.util.List;

import com.model.Publisher;

public interface PublisherMapper {
    int deleteByPrimaryKey(Integer pubId);

    int insert(Publisher record);

    int insertSelective(Publisher record);

    Publisher selectByPrimaryKey(Integer pubId);

    int updateByPrimaryKeySelective(Publisher record);

    int updateByPrimaryKey(Publisher record);

	/**
	 * <p>
	 * 
	 * </p>
	 * @author zm
	 * @Date 2018年8月12日
	 * @return
	 */
	List<Publisher> queryAllPub();
}