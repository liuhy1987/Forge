/**
 * 
 */
package com.assemsoft.forge.managers;

import com.assemsoft.forge.core.ServiceFactory;
import com.assemsoft.forge.queue.Task;
import com.assemsoft.forge.queue.TaskQueue;
import com.assemsoft.forge.services.IService;

/**
 * @author liuhy
 */
public abstract class AbsManager extends Thread {
    
    private ServiceFactory fmc = null;
    private TaskQueue queen;
    private boolean isrunning = true;

    public AbsManager(String name, ServiceFactory fmc, TaskQueue queen){
	super(name);
	this.fmc = fmc;
	this.queen = queen;
    }
    
    @Override
    public void run(){
	
	while(isrunning){
	    try {
		Task task = queen.take();
		// process task data
		task = process(task);
		// find the register sercvice
		IService service = fmc.getServiceByName(task.getTarget());
		// triger service
		service.onFire(task);
		
	    } catch (InterruptedException ex) {
		ex.printStackTrace();
	    }
	}
	
    }
    
    public abstract Task process(Task task);
    
    public void shutdown(){
	isrunning = false;
    }
    
}
