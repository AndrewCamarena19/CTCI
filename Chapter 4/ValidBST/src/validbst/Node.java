/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validbst;

/**
 *
 * @author Andy
 */
public class Node {
    
    int value;
    Node left;
    Node right;
    
    public Node(int n)
    {
        this.value = n;
        left = null;
        right = null;
    }
    
    public boolean addNode(int n)
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
            System.out.println("Node: " + node.value);
            inOrder(node.right);
        }
    }

    public void preOrder(Node node) {
        if (node != null) {
            System.out.println("Node: " + node.value);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.println("Node: " + node.value);
        }
    }
    
}
