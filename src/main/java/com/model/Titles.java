package com.model;

import java.util.Date;

public class Titles {
    private Integer titlesId;

    private String title;

    private String type;

    private Integer pubId;

    private Double price;

    private Integer advance;

    private Integer yoralty;

    private Integer ytdSales;

    private String notes;

    private Date pubdate;

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

    public Integer getPubId() {
        return pubId;
    }

    public void setPubId(Integer pubId) {
        this.pubId = pubId;
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
}