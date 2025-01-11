public class optimized {

    public void optimizedApproach(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;

            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        System.out.print("[");
        for (int a = 0; a < m + n; a++) {
            System.out.print(nums1[a] + ",");
        }
        System.out.print("]");
    }

    public static void main(String args[]) {
        optimized o = new optimized();

        int nums1[] = { 1, 2, 3, 0, 0, 0 };
        int nums2[] = { 2, 5, 6 };
        int m = 3;
        int n = 3;

        o.optimizedApproach(nums1, m, nums2, n);
    }
}
