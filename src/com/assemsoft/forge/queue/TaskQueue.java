package com.assemsoft.forge.queue;

import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

import com.assemsoft.forge.model.Task;
import com.spring.configuration.ConfigLoader;

public class TaskQueue {

    /* data queen */
    private final ArrayBlockingQueue<Task> queen;
    
    /* construct a singleton instance */
    private static TaskQueue mq = null;
    private TaskQueue() {

	/* init queens */
	queen = new ArrayBlockingQueue<Task>(Integer.parseInt(ConfigLoader.getContextProperty("task.queen")));

    }

    public static synchronized TaskQueue getInstance() {
	if (mq == null) {
	    mq = new TaskQueue();
	}
	return mq;
    }

    public void add(Task task){
	queen.add(task);
    }
    
    public void addAll(Collection<? extends Task> c){
	queen.addAll(c);
    }
    
    public Task take() throws InterruptedException{
	return queen.take();
    }

}
