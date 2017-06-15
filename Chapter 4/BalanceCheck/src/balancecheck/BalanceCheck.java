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
public class BalanceCheck {
    
    public static int checkHeight(Node root)
    {
        //base case null root
        if(root == null) return -1;
        
        //check left subtree height
        //if left is min value return it and pass up
        int left = checkHeight(root.left);
        if(left == Integer.MIN_VALUE) return Integer.MIN_VALUE;
        
        //check right
        //if min val pass up
        int right = checkHeight(root.right);
        if(right == Integer.MIN_VALUE) return Integer.MIN_VALUE;
        
        //the difference should be 0 if balanced
        int diff = left - right;
        //if not 0 then not balanced
        if(Math.abs(diff) > 1) return Integer.MIN_VALUE;
        else return Math.max(left, right) + 1;
            
    }
    
    public static boolean isBalanced(Node root)
    {
        //helper function if min value returned difference > 1
        //unbalanced
        return checkHeight(root) != Integer.MIN_VALUE;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node root = new Node("a");
        root.left = new Node("b");
        root.right = new Node("c");
        root.left.addNode("d");
        
        if(isBalanced(root))
            System.out.println("is Balanced");
        else
            System.out.println("is not balanced");
    }
    
}
