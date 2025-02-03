import java.util.HashMap;

public class optimized {

    public static int LongestSubarrayOptimized(int[] nums) {

        int n = nums.length;

        HashMap<Integer, Integer> h = new HashMap<>();
        int sum = 0, max = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum == 0) {
                max = i + 1;
            }
            else if (h.containsKey(sum)) {
                max = Math.max(max, i - h.get(sum));
            } else {
                h.put(sum, i);
            }
        }

        return max;
    }

    public static void main(String args[]) {
        int nums[] = { 2, 10, 4 };

        int answer = LongestSubarrayOptimized(nums);

        System.out.println(answer);
    }
}
