package com.assemsoft.forge.model;


public class Task {

    /** ID */
    private String taskid;
    /** domain */
    private String domain;
    /** source */
    private String source;
    /** target service */
    private String target;
    /** task type */
    private TaskType type;
    /** is reply */
    private boolean isreply;
    /** input or output params */
    private Params params;
    /** data */
    private String data;

    /**
     * @return the target
     */
    public String getTarget() {
        return target;
    }

    /**
     * @param target the target to set
     */
    public void setTarget(String target) {
        this.target = target;
    }

    public String getTaskid() {
	return taskid;
    }

    public void setTaskid(String taskid) {
	this.taskid = taskid;
    }

    public String getData() {
	return data;
    }

    public void setData(String data) {
	this.data = data;
    }

    /**
     * @return the source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source the source to set
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return the type
     */
    public TaskType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(TaskType type) {
        this.type = type;
    }

    /**
     * @return the params
     */
    public Params getParams() {
        return params;
    }

    /**
     * @param params the params to set
     */
    public void setParams(Params params) {
        this.params = params;
    }

    /**
     * @return the isreply
     */
    public boolean isIsreply() {
        return isreply;
    }

    /**
     * @param isreply the isreply to set
     */
    public void setIsreply(boolean isreply) {
        this.isreply = isreply;
    }

    /**
     * @return the domain
     */
    public String getDomain() {
        return domain;
    }

    /**
     * @param domain the domain to set
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
}
