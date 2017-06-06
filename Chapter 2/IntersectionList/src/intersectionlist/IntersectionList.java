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
public class IntersectionList {

    public static Node findInter(Node head1, Node head2) {

        //if either is null no intersection
        if (head1 == null || head2 == null) {
            return null;
        }
        //if tails are not equal no intersection with single tail
        if (head1.tail() != head2.tail()) {
            return null;
        }

        Node shorter;
        Node longer;
        //assign short and longer lists
        shorter = head1.size() < head2.size() ? head1 : head2;
        longer = head1.size() < head2.size() ? head2 : head1;
        //assign longer to point where each list are equal size
        longer = (longer.kth(Math.abs(longer.size() - shorter.size())));
        //while the list nodes are not the same node traverse
        while (shorter != longer) {
            shorter = shorter.next;
            longer = longer.next;
        }
        //when reference of nodes are equal return either one
        //intersection found
        return shorter;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // node list 2,3,4,5,6
        Node n = new Node(2);
        n.append(3);
        n.append(4);
        n.append(5);
        n.append(6);
        //node list 7,8 + n.next
        //7,8,3,4,5,6
        Node k = new Node(0);
        k.append(1);
        k.append(n.next);
        //print both lists
        n.print();
        k.print();
        //print out intersection node data
        System.out.println(findInter(k, n).data);

    }

}
