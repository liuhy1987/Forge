/**
 * 
 */
package com.assemsoft.forge.database;

import com.assemsoft.forge.database.instances.IDataBase;
import com.assemsoft.forge.model.Task;
import com.assemsoft.forge.model.TaskType;
import com.assemsoft.forge.services.AbsService;
import com.assemsoft.forge.util.SpringUtil;
import com.assemsoft.forge.util.TaskFactory;

/**
 * @author liuhy
 */
public class DbService extends AbsService{

    @Override
    public String getDomain() {
	return "DbService";
    }

    @Override
    public String getDescription() {
	return "DbService H2";
    }

    @Override
    public String getName() {
	return "DbService";
    }

    @Override
    public void init() {
	
    }

    @Override
    public boolean process(Task task) {
	
	boolean ret = true;
	
	if(task.getType()==TaskType.DATA){
	    ret = doDataProcess(task);
	}else if(task.getType()==TaskType.COMMAND){
	    ret = doCommandProcess(task);
	}else if(task.getType()==TaskType.COMMUNICATION){
	    ret = doCommunicationProcess(task);
	}
	
	return ret;
    }

    private boolean doCommunicationProcess(Task task) {
	return true;
    }

    private boolean doCommandProcess(Task task) {
	return true;
    }

    private boolean doDataProcess(Task task) {
	IDataBase db = SpringUtil.getInstance().getObject("dbimpl", IDataBase.class);
	sendTask(TaskFactory.obtainTask(task, db.getAllManagedElements().toString()));
	return true;
    }

}
