/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routenode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 *
 * @author Andy
 */
public class GraphNode {

    String node;
    HashMap<GraphNode, Integer> adj = null;
    boolean visited;

    public GraphNode(String n) {
        adj = new HashMap();
        node = n;
    }

    public void addNode(GraphNode n, int distance) {
        adj.put(n, distance);
        n.adj.put(this, distance);
    }

    //traversal from a root node
    public void BFS() {
        Queue<GraphNode> q = new LinkedList();
        this.visited = true;
        q.add(this);

        while (!q.isEmpty()) {
            GraphNode r = q.poll();
            System.out.println("Visited: " + r.node);
            for (Map.Entry<GraphNode, Integer> k : r.adj.entrySet()) {
                if (!k.getKey().visited) {
                    k.getKey().visited = true;
                    q.add(k.getKey());
                }
            }
        }
    }
    //search bfs
    public void BFS(GraphNode n) {
        Queue<GraphNode> q = new LinkedList();
        this.visited = true;
        q.add(this);
        boolean found = false;
        while (!q.isEmpty() && !found) {
            GraphNode r = q.poll();
            System.out.println("Visited: " + r.node);
            for (Map.Entry<GraphNode, Integer> k : r.adj.entrySet()) {
                if(n.equals(k.getKey()))
                {
                    System.out.println("A path exists to " + n.node);
                    found = true;
                    break;
                }
                if (!k.getKey().visited) {
                    k.getKey().visited = true;
                    q.add(k.getKey());
                }
            }
        }
        if(!found)
            System.out.println("No path exists to " + n.node );
    }

    //traversal from a root node
    public void DFS() {
        if (this != null) {
            System.out.println("Visited: " + this.node);
            this.visited = true;
            for (Map.Entry<GraphNode, Integer> k : this.adj.entrySet()) {
                if (!k.getKey().visited) {
                    k.getKey().DFS();
                }
            }
        }
    }
}
