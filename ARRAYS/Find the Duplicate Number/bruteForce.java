class bruteForce {

    public int bruteForceApproach(int[] nums) {
        int len = nums.length;

        int number = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    continue;
                } else {
                    number = nums[i];
                    break;
                }

            }
        }
        return number;
    }

    public static void main(String args[]) {
        bruteForce b = new bruteForce();

        int nums[] = { 3, 3, 3, 3, 3 };

        int number = b.bruteForceApproach(nums);

        System.out.println(number);
    }
}