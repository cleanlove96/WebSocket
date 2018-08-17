/*****************************************************
 *  HISTORY
 *  FileName:EmployeeInfo.java
 *  Package:com.pojo
 *  Project:Demo
 *  Version:1.0
 *  Date:2018年8月12日 zlf创建文件
 **********修改记录*************
 * Date:          Author:
 *
 *******************************************************/
package com.pojo;

/**
 * <p>
 * 职员信息，所在出版社，职位信息
 * </p>
 * 
 * @Copyright (C),zm
 * @author zm
 * @Date:2018年8月12日
 */
public class EmployeeInfo {
	private int empId;
	private String fname;
	private int minit;
	private String lname;
	private double jobLvl;
	private String hireDate;
	private String jobDesc;
	private String pubName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getMinit() {
		return minit;
	}
	public void setMinit(int minit) {
		this.minit = minit;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public double getJobLvl() {
		return jobLvl;
	}
	public void setJobLvl(double jobLvl) {
		this.jobLvl = jobLvl;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobDesc() {
		return jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	public String getPubName() {
		return pubName;
	}
	public void setPubName(String pubName) {
		this.pubName = pubName;
	}
	
}
