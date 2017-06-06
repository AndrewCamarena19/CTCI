/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopdetection;

/**
 *
 * @author Andy
 */
public class LoopDetection {

    public static Node Loop(Node head)
    {
        Node fast = head;
        Node slow = head;
        //traverse list until a loop is detected
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                break;
        }
        //if fast is null or next is null no loop exists
        if(fast == null || fast.next == null)
            return null;
        
        //reassign slow to start of list
        slow = head;
        //the fast node and slow node will be k away from loop start
        //k distance from collision
        //traverse at equal speed until nodes are the same
        while(slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        //return either node
        return fast;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Node n = new Node(1);
        n.append(2);
        n.append(3);
        n.append(4);
        n.append(5);
        n.append(6);
        n.append(7);
        //append last node.next to node 3 for loop
        n.append(n.next.next);
        
        System.out.println(Loop(n).data);
    }
    
}
