/**
 * 
 */
package com.assemsoft.forge.services;

import com.assemsoft.forge.model.Task;

/**
 * @author liuhy
 */
public interface IService {

    /***
     * service name
     * @return
     */
    public String getServiceName();
    
    /***
     * domain
     * @return
     */
    public String getDomain();

    public String getServiceDescription();

    public void init();
    
    public void destory();
   
    /***
     * a triger method
     * @param task
     * @return
     */
    public boolean onFire(Task task);

}
