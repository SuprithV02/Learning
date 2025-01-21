
public class BubbleSort {

    public static void swap(int[] arr, int a) {
        int temp = arr[a];
        arr[a] = arr[a + 1];
        arr[a + 1] = temp;
    }

    public static void BubbleSortAlgorithm(int[] nums) {
        int length = nums.length;

        for (int i = length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j);
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String args[]) {
        int[] nums = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        BubbleSortAlgorithm(nums);
    }
}
