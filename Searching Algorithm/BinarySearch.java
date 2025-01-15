import java.util.Arrays;

public class BinarySearch {

    public static boolean BinarySearchAlgorithm(int[] nums, int number) {
        int length = nums.length;

        int low = 0;
        int high = length - 1;

        Arrays.sort(nums);

        while (low <= high) {
            int mid = (low + high) / 2;

            if (number == nums[mid]) {
                return true;
            } else if (number < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }

    public static void main(String args[]) {

        int nums[] = { 7, 2, 4, 8, 3, 0, 1, 6 };
        int number = 7;

        boolean b = BinarySearchAlgorithm(nums, number);

        System.out.println(b);
    }
}
