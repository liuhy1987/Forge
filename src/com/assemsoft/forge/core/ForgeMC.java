package com.assemsoft.forge.core;

import com.assemsoft.forge.managers.QueueManager;
import com.assemsoft.forge.queue.TaskQueue;

public class ForgeMC {

    public void init() {

	QueueManager dqm = new QueueManager("queen manager", ServiceFactory.getInstance(), TaskQueue.getInstance());
	dqm.start();
    }

}
