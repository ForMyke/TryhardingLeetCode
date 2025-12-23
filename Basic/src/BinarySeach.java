public class BinarySeach {
    // Function to calls the solution
    public static void main(String[] args) {
    int [] nummbers = {1,3,5,6,8,12,4};
    System.out.println(    binarySearch(nummbers,6));
    }

    //Solution

    private static int binarySearch(int[] numbers, int numbertoFind) {
        // Pointers
        int low = 0;
        int high = numbers.length - 1;
        // Loop
        while (low <= high) {

            //Middle Number
            int middle = (low + high) / 2;
            int middleNumber = numbers[middle];
            //Conditions
            if (middleNumber == numbertoFind) {
                return middle;
            }
            if (numbertoFind < middleNumber) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }


}