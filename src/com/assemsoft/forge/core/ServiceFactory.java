/**
 * 
 */
package com.assemsoft.forge.core;

import java.util.concurrent.ConcurrentHashMap;

import com.assemsoft.forge.services.IService;
import com.assemsoft.forge.util.SpringUtil;


/**
 * @author liuhy
 */
public class ServiceFactory {

    private ConcurrentHashMap<String, IService> reg = new ConcurrentHashMap<String, IService>();
    
    public static ServiceFactory getInstance(){
	return SpringUtil.getInstance().getObject("servicefactory", ServiceFactory.class);
    }
    
    public void registerService(IService service){
	reg.put(service.getName(), service);
    }
    
    public void removeService(String servicename){
	IService service = reg.get(servicename);
	service.destory();
	reg.remove(servicename);
    }

    public IService getServiceByName(String name){
	return reg.get(name);
    }

    /**
     * @param reg the reg to set
     */
    public void setReg(ConcurrentHashMap<String, IService> reg) {
        this.reg = reg;
    }
    
}
