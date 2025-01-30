import java.util.Arrays;

public class bruteForce {

    public static int longestConsecutive(int[] nums) {

        int n = nums.length;

        if (n == 0)
            return 0;
            
        Arrays.sort(nums);
        int minElement = Integer.MIN_VALUE;
        int count = 0;
        int longest = 1;

        // 1,2,3,4,100,200

        for (int i = 0; i < n; i++) {
            if (nums[i] - 1 == minElement) {
                count += 1;
                minElement = nums[i];
            } else if (nums[i] != minElement) {
                count = 1;
                minElement = nums[i];
            }

            longest = Math.max(longest, count);
        }

        return longest;

    }

    public static void main(String args[]) {

        int nums[] = { 100, 200, 1, 2, 3, 4 };

        int answer = longestConsecutive(nums);

        System.out.println(answer);
    }
}
