/**
 * 
 */
package com.assemsoft.forge.util;

import java.util.UUID;

import com.assemsoft.forge.model.Task;

/**
 * @author liuhy
 */
public class TaskFactory {

    public static Task obtainTask(Task task, String data){
	Task t = new Task();
	t.setTaskid(UUID.randomUUID().toString());
	t.setSource(task.getTarget());
	t.setTarget(task.getSource());
	t.setData(data);
	return t;
    }
    
}
