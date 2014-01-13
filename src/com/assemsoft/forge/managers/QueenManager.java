/**
 * 
 */
package com.assemsoft.forge.managers;

import com.assemsoft.forge.core.ServiceFactory;
import com.assemsoft.forge.model.Task;
import com.assemsoft.forge.queue.TaskQueue;

/**
 * @author liuhy
 */
public class QueenManager extends AbsManager {
    
    public QueenManager(String name, ServiceFactory fmc, TaskQueue queen) {
	super(name, fmc, queen);
    }

    @Override
    public Task process(Task task) {
	//do something
	
	return task;
    }

}
