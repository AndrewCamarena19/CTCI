/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcomp;

/**
 *
 * @author Andy
 */
public class StringComp {
    
    public static String Comp(String str)
    {
        StringBuilder comp = new StringBuilder();
        int count;
        for(int i = 0; i < str.length(); i++)
        {
            int start = i;
            count = 0;
            while(i < str.length() && str.charAt(start) == str.charAt(i))
            {
                count++;
                i++;
            }
            comp.append(str.charAt(start)).append(count);
            i--;
        }
        if(comp.length() > str.length())
            return str;
        
        return comp.toString();
            
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String c = "aaabbbcccaaa";
        System.out.println(Comp(c));
    }
    
}
