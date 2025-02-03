
public class bruteForce {

    public static int largestSubarray(int[] nums) {

        int n = nums.length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == 0) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }

        return max;
    }

    public static void main(String args[]) {

        int nums[] = { 1, 0, -4, 3, 1, 0 };

        int answer = largestSubarray(nums);

        System.out.println(answer);
    }
}
