package com.mapper;

import java.util.List;

import com.model.Titles;
import com.pojo.TitlesPub;

public interface TitlesMapper {
    int deleteByPrimaryKey(Integer titlesId);

    int insert(Titles record);

    int insertSelective(Titles record);

    Titles selectByPrimaryKey(Integer titlesId);

    int updateByPrimaryKeySelective(Titles record);

    int updateByPrimaryKey(Titles record);

	/**
	 * <p>
	 * 
	 * </p>
	 * @author zm
	 * @Date 2018年8月12日
	 * @return
	 */
	List<TitlesPub> queryAllTitles();
}