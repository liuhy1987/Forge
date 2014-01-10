package com.assemsoft.forge.core;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import com.assemsoft.forge.managers.QueenManager;
import com.assemsoft.forge.queen.TaskQueen;
import com.assemsoft.forge.services.IService;
import com.assemsoft.forge.util.RegisterService;
import com.assemsoft.forge.util.SpringUtil;

public class ForgeMC {
    
    private ConcurrentHashMap<String, IService> reg = new ConcurrentHashMap<String, IService>();
    
    public void init(){
	
	register();
	
	QueenManager dqm = new QueenManager("queen manager", this, TaskQueen.getInstance());
	dqm.start();
    }
    
    private void register() {
	RegisterService rs = SpringUtil.getInstance().getObject("registerservices", RegisterService.class);
	List<IService> services = rs.getServices();
	for(IService ser : services){
	    reg.put(ser.getServiceName(), ser);
	}
    }
    
    public void registerService(IService service){
	reg.put(service.getServiceName(), service);
    }
    
    public void removeService(String servicename){
	IService service = reg.get(servicename);
	service.destory();
	reg.remove(servicename);
    }

    public IService getServiceByName(String name){
	return reg.get(name);
    }
    
}
