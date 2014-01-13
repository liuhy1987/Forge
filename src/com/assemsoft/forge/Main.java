/**
 * 
 */
package com.assemsoft.forge;

import java.util.UUID;

import com.assemsoft.forge.core.ForgeMC;
import com.assemsoft.forge.model.Task;
import com.assemsoft.forge.model.TaskType;
import com.assemsoft.forge.queue.TaskQueue;
import com.assemsoft.forge.util.SpringUtil;

/**
 * @author liuhy
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
	ForgeMC mc = SpringUtil.getInstance().getObject("forgemc", ForgeMC.class);
	mc.init();
	System.out.println("init finished。。。");
	Task t = new Task();
	t.setTaskid(UUID.randomUUID().toString());
	t.setSource("Sender");
	t.setTarget("DbService");
	t.setType(TaskType.DATA);
	TaskQueue.getInstance().add(t);
    }

}
