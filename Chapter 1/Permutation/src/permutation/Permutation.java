/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutation;

import java.util.HashSet;

/**
 *
 * @author Andy
 */
public class Permutation {
    
    public static boolean permute(String str, String str2)
    {
        //without repetition
        str = str.toLowerCase();
        str2 = str2.toLowerCase();
        if(str.length() != str2.length())
            return false;
        
        HashSet set = new HashSet();
        HashSet set2 = new HashSet();
        for(Character x : str.toCharArray())
            set.add(x);
        for(Character x : str2.toCharArray())
            set2.add(x);
        return set.equals(set2);
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "this is a permutation:;";
        String str2 = "Permutationisthisa   :;";
        
        System.out.println(permute(str, str2));
    }
    
}
