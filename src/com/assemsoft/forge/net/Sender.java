/**
 * 
 */
package com.assemsoft.forge.net;

import com.assemsoft.forge.model.Task;
import com.assemsoft.forge.services.AbsService;

/**
 * @author liuhy
 */
public class Sender extends AbsService {

    /* (non-Javadoc)
     * @see com.assemsoft.forge.services.AbsService#process(com.assemsoft.forge.model.Task)
     */
    @Override
    public boolean process(Task task, AbsService service) {
	System.out.println(task.getData());
	return true;
    }

    /* (non-Javadoc)
     * @see com.assemsoft.forge.services.IService#getDomain()
     */
    @Override
    public String getDomain() {
	return "Sender";
    }

    /* (non-Javadoc)
     * @see com.assemsoft.forge.services.IService#getServiceDescription()
     */
    @Override
    public String getDescription() {
	return "Sender";
    }

    /* (non-Javadoc)
     * @see com.assemsoft.forge.services.IService#getServiceName()
     */
    @Override
    public String getName() {
	return "Sender";
    }

    /* (non-Javadoc)
     * @see com.assemsoft.forge.services.IService#init()
     */
    @Override
    public void init() {
	
    }

}
