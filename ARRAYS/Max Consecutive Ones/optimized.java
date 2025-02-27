
public class optimized {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int len = nums.length;

        int max = 0, count = 0;

        for (int i = 0; i < len; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }

            if (count > max) {
                max = count;
            }
        }

        return max;
    }

    public static void main(String args[]) {

        int nums[] = { 1, 1, 0, 1, 1, 1 };

        int answer = findMaxConsecutiveOnes(nums);

        System.out.println(answer);
    }
}
