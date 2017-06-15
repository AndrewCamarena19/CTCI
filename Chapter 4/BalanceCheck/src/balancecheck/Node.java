/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancecheck;

/**
 *
 * @author Andy
 */
public class Node {
    
    String name;
    Node left;
    Node right;
    
    public Node(String n)
    {
        this.name = n;
        left = null;
        right = null;
    }
    
    public boolean addNode(String n)
    {
        Node k  = new Node(n);
        if(this.left == null)
        {
            this.left = k;
            return true;
        }
        else if(this.right == null)
        {
            this.right = k;
            return true;
        }
        else
        {
            System.out.println("Node has two children");
            return false;
        }
    }
    
        //traversals of trees
    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.println("Node: " + node.name);
            inOrder(node.right);
        }
    }

    public void preOrder(Node node) {
        if (node != null) {
            System.out.println("Node: " + node.name);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.println("Node: " + node.name);
        }
    }
    
}
