/**
 * 
 */
package com.assemsoft.forge.services;

import com.assemsoft.forge.queue.Task;

/**
 * @author liuhy
 */
public interface IService {

    /***
     * service name
     * @return
     */
    public String getName();
    
    /***
     * domain
     * @return
     */
    public String getDomain();

    public String getDescription();

    public void init();
    
    public void destory();
   
    /***
     * a triger method
     * @param task
     * @return
     */
    public boolean onFire(Task task);

}
