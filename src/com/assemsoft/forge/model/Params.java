/**
 * 
 */
package com.assemsoft.forge.model;

import java.util.Date;

/**
 * @author liuhy
 */
public class Params {
    
    private Date starttime;
    private String condition;
    private String remark;
    
    public Date getStarttime() {
	return starttime;
    }

    public void setStarttime(Date starttime) {
	this.starttime = starttime;
    }

    public String getCondition() {
	return condition;
    }

    public void setCondition(String condition) {
	this.condition = condition;
    }

    /**
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
}
