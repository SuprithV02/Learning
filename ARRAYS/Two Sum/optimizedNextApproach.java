import java.util.Arrays;

public class optimizedNextApproach {

    public static int[] optimizedApproachPartTwo(int[] nums, int target) {

        Arrays.sort(nums);

        int low = 0;
        int high = nums.length - 1;
        int[] answer = new int[2];

        while (low < high) {
            int sum = nums[low] + nums[high];
            if (sum == target) {
                answer[0] = low + 1;
                answer[1] = high;
                break;
            } else if (sum > target) {
                high--;
            } else {
                low++;
            }
        }

        return answer;

    }

    public static void main(String args[]) {
        int[] nums = { 3, 2, 4 };
        int target = 6;

        int[] answer = optimizedApproachPartTwo(nums, target);

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
