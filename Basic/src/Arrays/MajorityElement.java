package Arrays;
import java.util.*;

public class MajorityElement {

    public int majorityElement(int[] nums) {

        Map<Integer, Integer> elements = new HashMap <>();
        int res = 0, maxCount = 0;
        for (int n : nums) {
            elements.put(n, elements.getOrDefault(n, 0) + 1);
            if (elements.get(n) > maxCount) {
                res = n;
                maxCount = elements.get(n);
            }
        }
        return res;



    }
}
