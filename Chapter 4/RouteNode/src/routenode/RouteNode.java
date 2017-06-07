/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routenode;

/**
 *
 * @author Andy
 */
public class RouteNode {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tree check
        //Node n = new Node("1");
        //n.addNode("2");
        //n.addNode("3");
        //n.left.addNode("4");
        //n.postOrder(n);
        
        //GraphCheck
        GraphNode a = new GraphNode("Chicago");
        GraphNode b = new GraphNode("Houston");
        GraphNode c = new GraphNode("LA");
        GraphNode d = new GraphNode("Miami");
        GraphNode e = new GraphNode("Las Vegas");
        GraphNode i = new GraphNode("England");
        
        GraphNode aa = new GraphNode("Portland");
        GraphNode bb= new GraphNode("New York");
        GraphNode cc = new GraphNode("Long Beach");
        GraphNode dd = new GraphNode("Hawaii");
        GraphNode ee = new GraphNode("Mexico");
        GraphNode ii = new GraphNode("Germany");
        
        a.addNode(b, 100);
        a.addNode(c, 150);
        a.addNode(d, 75);
        a.addNode(e, 125);
        a.addNode(bb, 75);
        
        b.addNode(c, 75);
        b.addNode(d, 125);
        b.addNode(e, 75);
        
        c.addNode(d, 150);
        c.addNode(e, 50);
        c.addNode(aa, 125);
        c.addNode(cc, 25);
        c.addNode(dd, 100);
        c.addNode(ee, 100);
        
        d.addNode(e, 200);
        d.addNode(i, 1000);
        
        i.addNode(ii, 200);
        
        ee.BFS(ii);
        
        

    }

}
