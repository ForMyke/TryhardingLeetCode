package Arrays;
import java.util.*;
public class GAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
       //Map
        Map<String, List<String>> one = new HashMap<>();
        //Loop to list
        for (String s : strs){
            //Convert the Str to array´cause we cannot modify str in java
            char [] oneArray = s.toCharArray();
            //Order the array to use that as a key
            Arrays.sort(oneArray);
            //Use that key in the map
            String keySort = new String(oneArray);
            //Add if not exist
            one.putIfAbsent(keySort, new ArrayList<>());
            //If exist add
            one.get(keySort).add(s);
        }
        //Return the list
        return new ArrayList<>(one.values());
        }
    }

