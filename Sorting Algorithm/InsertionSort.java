public class InsertionSort {

    public static void swap(int[] arr, int a) {
        int temp = arr[a - 1];
        arr[a - 1] = arr[a];
        arr[a] = temp;
    }

    public static void InsertionSortAlgorithm(int[] nums) {

        int length = nums.length;

        int j;
        for (int i = 0; i < length; i++) {
            j = i;
            while (j > 0 && nums[j - 1] > nums[j]) {
                swap(nums, j);
                j--;
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String args[]) {

        int nums[] = { 7, 6, 5, 4, 3, 2, 1 };

        InsertionSortAlgorithm(nums);
    }
}
