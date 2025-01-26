public class optimized {

    public int optimizedApproach(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        return mergeSortAndCount(nums, 0, nums.length - 1);
    }

    private int mergeSortAndCount(int[] arr, int left, int right) {
        if (left >= right) {
            return 0;
        }

        int mid = left + (right - left) / 2;
        int count = 0;

        count += mergeSortAndCount(arr, left, mid);
        count += mergeSortAndCount(arr, mid + 1, right);
        count += mergeAndCount(arr, left, mid, right);

        return count;
    }

    private int mergeAndCount(int[] arr, int left, int mid, int right) {
        int count = 0;
        int j = mid + 1;

        // Counting reverse pairs
        for (int i = left; i <= mid; i++) {
            while (j <= right && arr[i] > 2 * (long) arr[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }

        // Merging the two halves
        int[] temp = new int[right - left + 1];
        int i = left, k = 0;
        j = mid + 1;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left; i <= right; i++) {
            arr[i] = temp[i - left];
        }

        return count;
    }

    public static void main(String args[]) {

    }
}
