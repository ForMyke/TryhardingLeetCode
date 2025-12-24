package Arrays;
import java.util.*;
public class Prefix {
    public String longestCommonPrefix (String[] strs) {
        //Initialize the code in the prefix 0
        String prefix = strs[0] ;
        //Loop all the string
        for (int i = 1; i < strs.length; i++) {
            //Size to prefix
            int j =0;
            //Take the smallest string
            while( j< Math.min(strs[i].length(),prefix.length())){
                if(strs[i].charAt(j)!=prefix.charAt(j)){
                    break;
                }
                j++;
            }
            //Add the position
            prefix = prefix.substring(0,j);
        }
        return prefix;
    }
}
