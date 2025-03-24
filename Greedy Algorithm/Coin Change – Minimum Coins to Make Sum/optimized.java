import java.util.ArrayList;
import java.util.Arrays;

public class optimized {
    public static int optimizedApproach(int[] nums, int sum) {

        Arrays.sort(nums);

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            while (sum >= nums[i]) {
                sum -= nums[i];
                ans.add(nums[i]);
            }
        }

        if (sum == 0) {
            return ans.size();
        }

        return -1;
    }

    public static void main(String args[]) {

        int[] nums = { 4, 6, 2 };
        int sum = 5;

        int answer = optimizedApproach(nums, sum);

        System.out.println(answer);
    }
}
