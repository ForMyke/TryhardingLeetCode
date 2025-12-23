import java.util.Arrays;

public class SeachInsertPosition {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(getConcatenation(arr));


         int [] one = getConcatenation(arr);

         //Resultado final

        System.out.println(Arrays.toString(one));


    }

    public static  int [] getConcatenation(int[] nums) {
        int n = nums.length;
        // Array con el doble de espacio
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }
}
