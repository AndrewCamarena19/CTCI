/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intersectionlist;

/**
 *
 * @author Andy
 */
public class Node {

    Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }
    
    //get the kth node of a list
    Node kth(int k) {
        Node curr = this;
        while (k > 0 && curr != null) {
            curr = curr.next;
            k--;
        }
        return curr;
    }

    void append(int d) {
        Node end = new Node(d);
        Node n = this;

        while (n.next != null) {
            n = n.next;
        }

        n.next = end;
    }
    //append a node and its list
    void append(Node n) {
        this.tail().next = n;
    }

    Node deleteNode(Node head, int d) {
        Node n = head;

        if (n.data == d) {
            return head.next;
        }

        while (n.next != null) {
            if (n.next.data == d) {
                System.out.println("Deleting: " + n.next.data);
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        System.out.println("Element not found");
        return head;
    }

    void print() {
        Node n = this;
        System.out.print("Node list: " + n.data);
        n = n.next;
        while (n != null) {
            System.out.print("," + n.data);
            n = n.next;
        }
        System.out.println();
    }
    //get size of list
    int size() {
        Node n = this;
        int result = 0;
        while (n != null) {
            n = n.next;
            result++;
        }
        return result;
    }
    //get last node
    Node tail() {
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        return n;
    }
}
