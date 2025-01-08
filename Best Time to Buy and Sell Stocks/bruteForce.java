
class bruteForce {
    
    public int bruteForceApproach(int[] nums) {
        
        int profit = 0, max = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                profit = nums[j] - nums[i];

                if (profit > max) {
                    max = profit;
                }
            }
        }
        
        return max;
    }
     public static void main(String args[]) {
         bruteForce b = new bruteForce();

         int[] nums = { 7, 1, 5, 3, 6, 4 };

         int profit = b.bruteForceApproach(nums);

         System.out.println(profit);
    }
}
