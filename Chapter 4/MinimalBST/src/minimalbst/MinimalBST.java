/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimalbst;

import java.util.ArrayList;

/**
 *
 * @author Andy
 */
public class MinimalBST {
    
    public static Node BuildTree(ArrayList<Integer> array)
    {
        //initial tree root with array/2 index
        return Helper(array, 0, array.size()-1);
    }
    
    //recurse like binary search altering sublist index
    public static Node Helper(ArrayList<Integer> array, int left, int right)
    {
        //base case 
        if(right < left)
            return null;
        
        //mid of sublist is a root
        int mid = (left + right) / 2;
        Node root = new Node(array.get(mid));
        //left and right nodes will be mids of new sublists
        root.left = Helper(array, left, mid - 1);
        root.right = Helper(array, mid + 1, right);
        
        //return the root node
        return root;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList();
        for(int i = 0; i < 25; i++)
            list.add(i);
        
        Node tree = BuildTree(list);
        tree.preOrder(tree, 0);
    }
    
}
