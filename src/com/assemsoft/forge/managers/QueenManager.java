/**
 * 
 */
package com.assemsoft.forge.managers;

import com.assemsoft.forge.core.ForgeMC;
import com.assemsoft.forge.model.Task;
import com.assemsoft.forge.queen.TaskQueen;

/**
 * @author liuhy
 */
public class QueenManager extends AbsManager {
    
    public QueenManager(String name, ForgeMC fmc, TaskQueen queen) {
	super(name, fmc, queen);
    }

    @Override
    public Task process(Task task) {
	//do something
	
	return task;
    }

}
