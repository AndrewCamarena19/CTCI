/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validbst;

import java.util.ArrayList;

/**
 *
 * @author Andy
 */
public class ValidBST {

    public static void isValid(Node node, ArrayList<Integer> list) {
        if (node != null) {
            isValid(node.left, list);
            list.add(node.value);
            isValid(node.right, list);
        }
    }

    public static boolean check(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> set = new ArrayList();
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(1);
        root.right.right = new Node(20);
        isValid(root, set);
        System.out.println(check(set));
    }

}
