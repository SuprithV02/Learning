
public class LinearSearch {

    //This works for both sorted and unsorted array.
    public static boolean linearSearchAlgorithm(int[] nums, int number) {
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            if (nums[i] == number) {
                return true;
            }
        }

        return false;
    }

    public static void main(String args[]) {
        
        int nums[] = { 1, 2, 3, 4, 5, 6 };

        int number = 2;

        boolean b = linearSearchAlgorithm(nums, number);

        System.out.println(b);
    }
}
