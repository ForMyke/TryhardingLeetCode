package Arrays;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public boolean isAnagram(String s, String t) {
        //First case
        if  (s.length() != t.length()) {
            return false;
        }
        //Second case
        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {
            //Collect the all characteres
            //Put catch the result
            //s.charAt(i) The actual character
            //countS.getOrDefault(s.charAt(i), 0) verify the character repetition and add 1
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }

        return countS.equals(countT);
    }


}
