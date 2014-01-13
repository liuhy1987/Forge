package com.assemsoft.forge.core;

import com.assemsoft.forge.managers.QueenManager;
import com.assemsoft.forge.queue.TaskQueue;

public class ForgeMC {

    public void init() {

	QueenManager dqm = new QueenManager("queen manager", ServiceFactory.getInstance(), TaskQueue.getInstance());
	dqm.start();
    }

}
