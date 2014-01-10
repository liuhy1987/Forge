package com.assemsoft.forge.queen;

import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

import com.assemsoft.forge.model.Task;
import com.spring.configuration.ConfigLoader;

public class TaskQueen {

    /* data queen */
    private final ArrayBlockingQueue<Task> queen;
    
    /* construct a singleton instance */
    private static TaskQueen mq = null;
    private TaskQueen() {

	/* init queens */
	queen = new ArrayBlockingQueue<Task>(Integer.parseInt(ConfigLoader.getContextProperty("task.queen")));

    }

    public static synchronized TaskQueen getInstance() {
	if (mq == null) {
	    mq = new TaskQueen();
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
