public class SelectionSort {

    public static void swap(int[] arr, int a) {

        int small = Integer.MAX_VALUE;
        int index = 0;

        for (int j = a; j < arr.length; j++) {
            if (arr[j] < small) {
                small = arr[j];
                index = j;
            }
        }

        int temp = arr[a];
        arr[a] = small;
        arr[index] = temp;
    }

    public static void SelectionSortAlgorithm(int[] nums) {

        int length = nums.length;

        for (int i = 0; i < length - 1; i++) {
            swap(nums, i);
        }

        for (int i = 0; i < length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String args[]) {

        int nums[] = { 13, 46, 24, 52, 20, 9 };

        SelectionSortAlgorithm(nums);
    }
}
