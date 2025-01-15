
public class bruteForce {

    public static long countInversions(int[] nums, int n) {

        long index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j]) {
                    index = index + 1;
                }
            }
        }

        return index;
    }

    public static void main(String args[]) {

        int nums[] = { 2, 5, 1, 3, 4 };

        int length = nums.length;

        long ans = countInversions(nums, length);

        System.out.println(ans);

    }
}


// Use this for the optimized approach


// mergeSort(arr, 0, 4)
// ├── mergeSort(arr, 0, 2)
// │   ├── mergeSort(arr, 0, 1)
// │   │   ├── mergeSort(arr, 0, 0) → returns 0  
// │   │   ├── mergeSort(arr, 1, 1) → returns 0
// │   │   └── merge(arr, 0, 0, 1) → counts 1 inversion
// │   ├── mergeSort(arr, 2, 2) → returns 0
// │   └── merge(arr, 0, 1, 2) → counts 4 inversions
// ├── mergeSort(arr, 3, 4)
// │   ├── mergeSort(arr, 3, 3) → returns 0
// │   ├── mergeSort(arr, 4, 4) → returns 0
// │   └── merge(arr, 3, 3, 4) → counts 1 inversion
// └── merge(arr, 0, 2, 4) → counts 6 inversions
