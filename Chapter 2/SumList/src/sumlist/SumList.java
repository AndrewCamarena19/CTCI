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
public class SumList {

    /**
     * @param first
     * @param args the command line arguments
     * @param second
     * @return
     */
    //for reverse order sum
    //create node method to add to front instead of appending to tail
    //same code
    public static Node BackSumList(Node first, Node second) {
        Node f = first;
        Node s = second;
        Node result = new Node((f.data + s.data) % 10);
        int carry = 0;
        carry = (f.data + s.data) / 10;
        f = f.next;
        s = s.next;
        while (s != null && f != null) {
            result.append((f.data + s.data + carry) % 10);
            carry = (f.data + s.data + carry) / 10;
            f = f.next;
            s = s.next;
        }
        if (s != null) {
            result.append((carry + s.data) % 10);
            if (carry > 0) {
                result.append(carry);
            }
        }
        else if (f != null) {
            result.append((carry + f.data) % 10);
            if (carry > 0) {
                result.append(carry);
            }
        }
        if(carry > 0)
            result.append(carry);
        return result;

    }

    public static void main(String[] args) {
        //first number 346
        Node first = new Node(6);
        first.append(4);
        first.append(3);

        //second number 872
        Node second = new Node(2);
        second.append(7);
        second.append(8);
        
        BackSumList(first, second).print();
    }

}
