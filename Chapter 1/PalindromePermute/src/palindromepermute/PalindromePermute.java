/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromepermute;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author Andy
 */
public class PalindromePermute {

    public static boolean isPermute(String str) {
        HashMap<Character, Integer> map = new HashMap();
        str = str.toLowerCase();
        for (Character x : str.toCharArray()) {
            if (!x.equals(' ')) {
                if (map.containsKey(x)) {
                    map.replace(x, map.get(x) + 1);
                } else {
                    map.put(x, 1);
                }
            }
        }
        int odds = 0;
        for (Integer x : map.values()) {
            if (x % 2 == 1) {
                odds++;
            }
            if(odds > 1)
                return false;
        }
        return true;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String perm = "ttaaabbbb";
        System.out.println(isPermute(perm));
    }

}
