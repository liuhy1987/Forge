/**
 * 
 */
package com.assemsoft.forge.queue;

import java.util.UUID;


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
