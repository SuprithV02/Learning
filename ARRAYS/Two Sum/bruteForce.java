
public class bruteForce {

    public static int[] bruteForceApproach(int[] nums, int target) {

        int length = nums.length;
        int[] ans = new int[2];

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }

        return ans;
    }

    public static void main(String args[]) {

        int nums[] = { 3, 2, 4 };
        int target = 6;

        int[] answer = bruteForceApproach(nums, target);

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }

    }
}
