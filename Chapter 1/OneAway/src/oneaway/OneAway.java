/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oneaway;

import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author Andy
 */
public class OneAway {

    public static boolean isAway(String str, String str2)
    {
        Set<Character> set1 = new HashSet();
        Set<Character> set2 = new HashSet();
        str = str.toLowerCase();
        str2 = str2.toLowerCase();
        
        for(Character x : str.toCharArray())
            if(!x.equals(' '))
                set1.add(x);
        for(Character x : str2.toCharArray())
            if(!x.equals(' '))
                set2.add(x);
        if(Math.abs(set1.size() - set2.size()) > 1)
            return false;
        int diff = 0;
        for(Character x : set1)
        {
            if(!set2.contains(x))
                diff++;
        }
        return diff <= 1;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "Pales";
        String str2 = "Pales";
        
        System.out.println(isAway(str, str2));
    }
    
}
