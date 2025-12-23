package Arrays;

public class Bool {
    public static void main(String[] args) {


    }
        public boolean hasDuplicate(int[] nums) {

            boolean appears = false;
            int n = nums.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i+1; j < n; j++) {
                    if (nums[i] == nums[j]) {
                        appears = true;
                    }
                }

            }

            return appears;
        }

    }

