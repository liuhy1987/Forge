package com.assemsoft.forge.core;

import com.assemsoft.forge.managers.QueenManager;
import com.assemsoft.forge.queen.TaskQueen;

public class ForgeMC {

    public void init() {

	QueenManager dqm = new QueenManager("queen manager", ServiceFactory.getInstance(), TaskQueen.getInstance());
	dqm.start();
    }

}
