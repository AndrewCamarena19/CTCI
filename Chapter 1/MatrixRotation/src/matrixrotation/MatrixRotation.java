/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixrotation;

import java.util.ArrayList;

/**
 *
 * @author Andy
 */
public class MatrixRotation {
    
    public static ArrayList<ArrayList<Integer>> rotate(ArrayList<ArrayList<Integer>> matrix)
    {
        //math rotation with single continuous array as matrix
        //(index * x + y) mod K = new Index
        //x = number of rows
        //y = x + 1
        //k = numOfElements + 1
        ArrayList<Integer> swap = new ArrayList();
        //90* Ri -> C(n-i)
        //rotate in multiples of 90*
        for(int i = 0; i < matrix.size(); i++)
        {
            swap = matrix.get(i);
        }
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
