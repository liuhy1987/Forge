/**
 * 
 */
package com.assemsoft.forge.util;

import java.util.List;

import com.assemsoft.forge.services.IService;

/**
 * @author liuhy
 */
public class RegisterService {
    private List<IService> services;

    /**
     * @return the services
     */
    public List<IService> getServices() {
        return services;
    }

    /**
     * @param services the services to set
     */
    public void setServices(List<IService> services) {
        this.services = services;
    }
    
}
