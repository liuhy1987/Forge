/**
 * 
 */
package com.assemsoft.forge.model;

/**
 * @author liuhy
 *
 */
public class NE {
    
    private String id;
    private String nodeid;
    private String userlabel;
    private String netype;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNodeid() {
        return nodeid;
    }
    public void setNodeid(String nodeid) {
        this.nodeid = nodeid;
    }
    public String getUserlabel() {
        return userlabel;
    }
    public void setUserlabel(String userlabel) {
        this.userlabel = userlabel;
    }
    public String getNetype() {
        return netype;
    }
    public void setNetype(String netype) {
        this.netype = netype;
    }
    
    public String toString(){
	return "id="+id+",userlabel="+userlabel+",netype="+netype;
    }
    
}
