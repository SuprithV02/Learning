
class optimized {

    public int optimizedApproach(int[] prices) {

        int profit = 0, buy = 0, diff = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[buy]) { //This is like finding the minimum value, so that we can buy at that price
                buy = i;
                continue; //This moves to the next loop, not including all the conditions
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
