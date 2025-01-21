
class optimized {

    public int optimizedApproach(int[] nums) {
        // int l = 0;
        int r = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        while (r < nums.length) {
            // while (sum < 0) {
            // sum -= nums[l];
            // l++;
            // }

            // We can use the above while and this if condition, whichever suits u
            // better...but the above while runs the code in 0ms and below in 1ms
            if (sum < 0) {
                sum = 0;
            }

            sum += nums[r];
            max = Math.max(max, sum);
            r++;
        }
        return max;
    }

    public static void main(String args[]) {
        optimized o = new optimized();

        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int number = o.optimizedApproach(nums);

        System.out.println(number);
    }
}
