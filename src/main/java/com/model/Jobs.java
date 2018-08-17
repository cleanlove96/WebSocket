package com.model;

public class Jobs {
    private Integer jobId;

    private String jobDesc;

    private Integer maxLvl;

    private Integer minLvl;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public Integer getMaxLvl() {
        return maxLvl;
    }

    public void setMaxLvl(Integer maxLvl) {
        this.maxLvl = maxLvl;
    }

    public Integer getMinLvl() {
        return minLvl;
    }

    public void setMinLvl(Integer minLvl) {
        this.minLvl = minLvl;
    }
}