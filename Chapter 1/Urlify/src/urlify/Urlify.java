/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urlify;

/**
 *
 * @author Andy
 */
public class Urlify {
    
    public static Character[] url(Character[] chars, int length)
    {
        int white = 0;
        for(int i = 0; i < length-1; i++)
        {
            if(chars[i].equals(' '))
                white++;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
