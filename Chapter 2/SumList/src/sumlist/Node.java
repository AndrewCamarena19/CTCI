/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumlist;

/**
 *
 * @author Andy
 */
public class Node {
    
    Node next = null;
    int data;
    
    public Node(int d)
    {
        data = d;
    }
    
    void append(int d)
    {
        Node end = new Node(d);
        Node n = this;
        
        while(n.next != null)
            n = n.next;
        
        n.next = end;
    }
    
    Node deleteNode(Node head, int d)
    {
        Node n = head;
        
        if(n.data == d)
            return head.next;
        
        while(n.next != null)
        {
            if(n.next.data == d)
            {
                System.out.println("Deleting: " + n.next.data);
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        System.out.println("Element not found");
        return head;
    }
    
    void print()
    {
        Node n = this;
        while(n != null)
        {
            System.out.println("Node: " + n.data);
            n = n.next;
        }
    }
}
