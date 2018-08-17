/*****************************************************
 *  HISTORY
 *  FileName:TitlesPub.java
 *  Package:com.pojo
 *  Project:Demo
 *  Version:1.0
 *  Date:2018年8月12日 zlf创建文件
 **********修改记录*************
 * Date:          Author:
 *
 *******************************************************/
package com.pojo;

import java.util.Date;

/**
 * <p>
 * 
 * </p>	
 * @Copyright (C),zm
 * @author zm
 * @Date:2018年8月12日
 */
public class TitlesPub {
	private Integer titlesId;

    private String title;

    private String type;

    private String  pubName;

    public Integer getTitlesId() {
		return titlesId;
	}

	public void setTitlesId(Integer titlesId) {
		this.titlesId = titlesId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPubName() {
		return pubName;
	}

	public void setPubName(String pubName) {
		this.pubName = pubName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getAdvance() {
		return advance;
	}

	public void setAdvance(Integer advance) {
		this.advance = advance;
	}

	public Integer getYoralty() {
		return yoralty;
	}

	public void setYoralty(Integer yoralty) {
		this.yoralty = yoralty;
	}

	public Integer getYtdSales() {
		return ytdSales;
	}

	public void setYtdSales(Integer ytdSales) {
		this.ytdSales = ytdSales;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Date getPubdate() {
		return pubdate;
	}

	public void setPubdate(Date pubdate) {
		this.pubdate = pubdate;
	}

	private Double price;

    private Integer advance;

    private Integer yoralty;

    private Integer ytdSales;

    private String notes;

    private Date pubdate;
}
