/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deletemiddle;

/**
 *
 * @author Andy
 */
public class DeleteMiddle {
    
    public static void deleteMids(Node n)
    {
        Node next = n.next;
        n.data = next.data;
        n.next = next.next;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Node n = new Node(1);
       n.append(2);
       n.append(3);
       n.append(4);
       n.append(5);
       
       deleteMids(n.next.next);
       n.print();
    }
    
}
