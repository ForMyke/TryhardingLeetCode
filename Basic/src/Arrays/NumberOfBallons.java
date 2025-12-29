package Arrays;
import java.util.*;

public class NumberOfBallons {

    public int maxNumberOfBalloons(String text) {
        //Define a lit
        int res = text.length();
        Map<Character, Integer> numbers = new HashMap<>();
        Map<Character, Integer> ballon = new HashMap<>();
        //First Counter
        for(char c :text.toCharArray()){
            numbers.put(c,numbers.getOrDefault(c,0)+1);
        }
        for(char c: "balloon".toCharArray()){
            ballon.put(c,ballon.getOrDefault(c,0)+1);
        }


        //Algorithm heart

        for(char c : ballon.keySet()){
            res = Math.min(res, numbers.getOrDefault(c,0) / ballon.get(c));
        }
        return res;

    }


}




