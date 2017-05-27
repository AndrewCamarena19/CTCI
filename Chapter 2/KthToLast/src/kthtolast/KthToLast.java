/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kthtolast;

/**
 *
 * @author Andy
 */
public class KthToLast {

    public static void Kth(Node head, int d) {
        Node n = head;
        int size = 0;
        while (n != null) {
            size++;
            n = n.next;
        }
        if (d > size || d <= 0) {
            System.out.println("Enter a valid Kth number");
        } else {
            n = head;
            for (int i = 0; i < size - d; i++) {
                n = n.next;
            }

            System.out.println(n.data);
        }
    }
    
    public static void RaceKth(Node head, int d)
    {
        
        Node n = head;
        Node b = head;
        
        for(int i = 0; i < d; i++)
            n = n.next;
        
        while(n != null)
        {
            n = n.next;
            b = b.next;
        }
        
        System.out.println(d + " from the last element is " + b.data);
    }
    
    public static void main(String[] args)
    {
        Node n = new Node(4);
        n.append(5);
        n.append(6);
        n.append(7);
        n.append(8);
        n.append(9);
        n.append(10);
        
        //n.print();
       // n.deleteNode(n, 9);
        //n.print();
        KthToLast.RaceKth(n, 3);
    }

}
