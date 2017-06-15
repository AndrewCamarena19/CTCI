/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildorder;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author Andy
 */
public class Graph {

    ConcurrentHashMap<String, GraphNode> map;

    /**
     * Graph Constructor creates Concurrent HashMap
     */
    public Graph() {
        map = new ConcurrentHashMap();
    }

    /**
     *
     * @param n Create a GraphNode with name n Place node into Concurrent
     * HashMap
     */
    public void addNode(String n) {
        GraphNode node = new GraphNode(n);
        map.put(n, node);
    }

    /**
     *
     * @param n Node to be removed from Concurrent HashMap Also decrements
     * dependents dependency count
     */
    public void removeNode(String n) {
        for (String x : map.get(n).DList) {
            map.get(x).size--;
        }
        map.remove(n);
    }

    /**
     *
     * @param root
     * @param dependent Adds dependent and dependency ("f", "a"), a is dependent
     * on f f has a dependent a
     */
    public void addDepend(String root, String dependent) {
        map.get(root).addDependent(dependent);
        map.get(dependent).addDependency(root);
    }

    /**
     *
     * @return a list of visited graphNodes Iterate through map while it is not
     * empty When an entry GraphNode Dependency list is == 0 Add to GraphNode
     * list and remove from map and dependents list Only visits when
     * dependencies are 0, can be processed
     */
    public ArrayList<GraphNode> order() {
        ArrayList<GraphNode> list = new ArrayList();
        while (!map.isEmpty()) {
            for (Entry<String, GraphNode> entry : map.entrySet()) {
                if (entry.getValue().size() == 0) {
                    list.add(entry.getValue());
                    removeNode(entry.getKey());
                }
            }
        }
        return list;
    }

    /**
     * Print function for the resultant list of nodes
     */
    public void print() {
        for (GraphNode x : this.order()) {
            System.out.println(x.node);
        }
    }

}
