import java.util.ArrayList;

public class optimized {

    private static int merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low; // starting index of left half of arr
        int right = mid + 1; // starting index of right half of arr

        // Modification 1: cnt variable to count the pairs:
        int cnt = 0;

        // storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                cnt += (mid - left + 1); // Modification 2
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

        return cnt; // Modification 3
    }

    public static int mergeSort(int[] arr, int low, int high) {
        if (low >= high)
            return 0; // Base case: Single element or empty array

        int cnt = 0;
        int mid = (low + high) / 2;

        // Recursive calls to split the array
        cnt += mergeSort(arr, low, mid); // Left half
        cnt += mergeSort(arr, mid + 1, high); // Right half

        // Merge the two halves and count inversions
        cnt += merge(arr, low, mid, high);
        return cnt;
    }

    public static int optimizedApproach(int[] nums) {

        int n = nums.length;

        return mergeSort(nums, 0, n - 1);
    }

    public static void main(String args[]) {
        int[] nums = { 2, 5, 1, 3, 4 };

        int answer = optimizedApproach(nums);

        System.out.println(answer);
    }
}
