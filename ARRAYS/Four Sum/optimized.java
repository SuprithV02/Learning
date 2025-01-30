import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class optimized {

    public static List<List<Integer>> fourSumOptimized(int[] nums, int target) {
        int n = nums.length;

        List<List<Integer>> answer = new ArrayList<>();

        int a, b;
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                a = j + 1;
                b = n - 1;

                while (a < b) {
                    long sum = (long) nums[i] + nums[j] + nums[a] + nums[b];
                    if (sum == target) {
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[a], nums[b]);
                        answer.add(list);

                        a++;
                        b--;

                        while (a < b && nums[a] == nums[a - 1])
                            a++;
                        while (a < b && nums[b] == nums[b + 1])
                            b--;
                    } else if (sum < target) {
                        a++;
                    } else {
                        b--;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        int nums[] = { 1000000000, 1000000000, 1000000000, 1000000000 };

        List<List<Integer>> answer = fourSumOptimized(nums, -294967296);

        for (List<Integer> it : answer) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i);
            }
            System.out.print("]");
        }
        System.out.println();
    }
}
