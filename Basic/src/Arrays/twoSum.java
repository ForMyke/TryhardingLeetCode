package Arrays;
import java.util.*;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {

        //Hash map
        Map<Integer, Integer> map = new HashMap<>();
        //For to check
        for(int i=0; i<nums.length;i++){
        // Number target -> "Estoy parado en el `4`. ¿Existe algún número que ya vi que, sumado a `4`, dé `6`?
            int needed = target - nums[i];

            // Does it exist?
            if(map.containsKey(needed)){

                //If exist return the index
                return new int[]{map.get(needed),i};
            }
                //If not save the value
            map.put(nums[i],i);
        }
        return new int[]{};
    }

}


