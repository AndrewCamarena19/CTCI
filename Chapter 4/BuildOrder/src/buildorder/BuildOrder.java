/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildorder;

import java.util.PriorityQueue;


/**
 *
 * @author Andy
 */
public class BuildOrder {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Graph graph = new Graph();
        graph.addNode("a");
        graph.addNode("b");
        graph.addNode("c");
        graph.addNode("d");
        graph.addNode("e");
        graph.addNode("f");
        
        graph.addDepend("a", "d");
        graph.addDepend("f", "b");
        graph.addDepend("b", "d");
        graph.addDepend("f", "a");
        graph.addDepend("d", "c");
        
        graph.print();

    }
    
}
