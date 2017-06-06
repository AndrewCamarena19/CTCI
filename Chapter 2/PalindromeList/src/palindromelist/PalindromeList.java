/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromelist;

import java.util.Stack;

/**
 *
 * @author Andy
 */
public class PalindromeList {

    /**
     * @param args the command line arguments
     */
    
    public static boolean isPalindrome(Node head)
    {
        Node fast = head;
        Node slow = head;
        
        Stack<Integer> stack = new Stack<>();
        
        while(fast != null && fast.next != null)
        {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if(fast != null)
            slow = slow.next;
        
        while(slow != null)
        {
            int top = stack.pop();
            if(top != slow.data)
                return false;
            slow = slow.next;
        }
        
        return true;
    }
    public static void main(String[] args) {
        Node head = new Node(3);
        head.append(2);
        head.append(1);
        head.append(2);
        head.append(3);
        
        System.out.println(isPalindrome(head));
    }
    
}
