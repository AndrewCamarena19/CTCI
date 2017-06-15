/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildorder;

import java.util.ArrayList;

/**
 *
 * @author Andy
 */
public class GraphNode {

   
    String node;
    ArrayList<String> DList;
    ArrayList<String> DepList;
    int size;

    /**
     *
     * @param name
     * Initialize:
     * Node name
     * Dependency List
     * Dependents list
     * Size of Dependency list
     */
    public GraphNode(String name) {
        node = name;
        DList = new ArrayList();
        DepList = new ArrayList();
        size = 0;
    }

    /**
     *
     * @param depend
     * Add a Dependent
     */
    public void addDependent(String depend) {
        DList.add(depend);
    }

    /**
     *
     * @param depend
     * Add a Dependency and increment size
     */
    public void addDependency(String depend) {
        DepList.add(depend);
        size++;
    }

    /**
     *
     * @return size of Dependency list 
     */
    public int size() {
        return size;
    }
}
