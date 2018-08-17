package com.mapper;

import java.util.List;

import com.model.Employee;
import com.pojo.EmployeeInfo;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer empId);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer empId);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

	/**
	 * <p>
	 * 
	 * </p>
	 * @author zm
	 * @Date 2018年8月12日
	 * @return
	 */
	List<EmployeeInfo> queryAllEmp();
}