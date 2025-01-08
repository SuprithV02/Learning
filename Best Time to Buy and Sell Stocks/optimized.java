
class optimized {

    public int optimizedApproach(int[] prices) {

        int profit = 0, buy = 0, diff = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[buy]) {
                buy = i;
                continue;
            }
            diff = prices[i] - prices[buy];
            if (diff > profit) {
                profit = diff;

            }

        }

        return profit;
    }

    public static void main(String args[]) {
        optimized o = new optimized();

        int[] nums = { 9, 2, 1, 9, 0, 6, 7 };

        int profit = o.optimizedApproach(nums);

        System.out.println(profit);
    }
}
