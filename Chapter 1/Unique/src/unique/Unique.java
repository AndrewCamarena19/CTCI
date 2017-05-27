/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Andy
 */
public class Unique {
    
        public static boolean naybors(char[] str)
        {
            Arrays.sort(str);
            for(int i = 0; i < str.length -1; i++)
            {
                if(str[i] == str[i + 1])
                {
                    System.out.println("Non unique char");
                    return false;
                }
            }
            System.out.println("all good holmes");
            return true;
        }

	public static boolean UniqueInt(String str)
	{
		ArrayList<Boolean> characters = new ArrayList(Collections.nCopies(256, false));
		int character;
		for(int i = 0; i < str.length(); i++)
		{
			character = str.charAt(i);
			if(!characters.get(character))
                        {
                            System.out.println("non unique character");
                            return false;
                        }
			else
				characters.set(i, Boolean.TRUE);
		}
                System.out.println("All unique");
		return true;
	}


	public static boolean isUnique(String str)
	{
		HashSet<Character> map = new HashSet();
		for(int i = 0; i < str.length(); i++)
		{
			if(!map.add(str.charAt(i)))
                        {
                            System.out.println("Non unique character");
                            return false;
                        }
		}
                System.out.println("All unique Characters");
		return true;
	}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String unique = "**alkdsjfa;lkjs";
        char[] arr = unique.toCharArray();
        
        
        naybors(arr);
    }
    
}
