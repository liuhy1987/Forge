/**
 * 
 */
package com.assemsoft.forge.model;


/**
 * @author liuhy
 */
public enum TaskType {
    
    DATA(0, "data type"),
    COMMAND(1, "command type"),
    COMMUNICATION(2, "communication type");
    
    /**
     * 获取描述
     * @return String
     */
    public String toString() {
        return description;
    }

    /**
     * 字符串转枚举值
     * @param value String
     * @return Flow
     */
    public static TaskType from_value(int code) {
	TaskType[] values = values();
        for (TaskType item : values) {
            if (item.code==code) {
                return item;
            }
        }
        return null;
    }
    
    private TaskType(int code, String description) {
	this.code = code;
        this.description = description;
    }
    
    private int code;
    private String description;

}
