/**
 * 
 */
package com.assemsoft.forge.services;

import java.util.concurrent.ArrayBlockingQueue;

import com.assemsoft.forge.queue.Task;
import com.assemsoft.forge.queue.TaskQueue;
import com.spring.configuration.ConfigLoader;

/**
 * @author liuhy
 */
public abstract class AbsService implements IService,Runnable {

    private boolean isrunning = true;
    private ArrayBlockingQueue<Task> currenttask = new ArrayBlockingQueue<Task>(Integer.valueOf(ConfigLoader.getContextProperty("task.processsize")));
    
    public AbsService(){
	new Thread(this).start();
    }
    
    public void destory() {
	isrunning = false;
    }

    public boolean onFire(Task task) {
	return currenttask.add(task);
    }
    
    public void run() {
	while(isrunning){
	    try {
		Task task = currenttask.take();
		process(task, this);
	    } catch (InterruptedException ex) {
		ex.printStackTrace();
	    }
	}
	/** put all unprocessed task to taskqueen */
	TaskQueue.getInstance().addAll(currenttask);
    }
    
    public void sendTask(Task task){
	TaskQueue.getInstance().add(task);
    }
    
    public abstract boolean process(Task task, AbsService service);
}
