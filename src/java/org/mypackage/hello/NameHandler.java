/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.mypackage.hello;

/**
 *
 * @author Aiman
 */
public class NameHandler {
private String name;
private String father;
public NameHandler (){
    name = null;
    father = "Mansor";
    
}

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
