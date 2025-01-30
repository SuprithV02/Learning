import java.util.HashSet;
import java.util.Set;

public class optimized {

    public static int longestConsecutiveOptimized(int[] nums) {

        int n = nums.length;
        if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            st.add(nums[i]);
        }

        for (int it : st) {

            // here it should be the first element
            if (!st.contains(it - 1)) {

                int count = 1;
                int x = it;
                while (st.contains(x + 1)) {
                    x = x + 1;
                    count += 1;
                }
                longest = Math.max(count, longest);
            }
        }

        return longest;
    }

    public static void main(String args[]) {
        int nums[] = { 100, 200, 1, 2, 3, 4 };

        int answer = longestConsecutiveOptimized(nums);

        System.out.println(answer);
    }
}
