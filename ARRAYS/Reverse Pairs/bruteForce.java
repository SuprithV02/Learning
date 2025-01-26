
public class bruteForce {

    public static int bruteForceApproach(long[] nums) {
        int length = nums.length;
        int ans = 0;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] > 2 * nums[j]) {
                    ans++;
                }
            }
        }

        return ans;
    }

    public static void main(String args[]) {

        long[] num = { 1, 3, 2, 3, 1 };

        int answer = bruteForceApproach(num);

        System.out.println(answer);
    }
}
