import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class optimized {

    public static List<List<Integer>> threeSumOptimized(int[] nums) {

        int n = nums.length;

        int a, b;
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {

            if (i != 0 && nums[i] == nums[i - 1])
                continue; // remove duplicates

            a = i + 1;
            b = n - 1;

            while (a < b) {

                int sum = nums[i] + nums[a] + nums[b];
                if (sum == 0) {
                    List<Integer> list = Arrays.asList(nums[i], nums[a], nums[b]);
                    answer.add(list);

                    a++;
                    b--;
                    while (a < b && nums[a] == nums[a - 1])
                        a++;
                    while (a < b && nums[b] == nums[b + 1])
                        b--;
                } else if (sum < 0) {
                    a++;
                } else {
                    b--;
                }
            }

        }

        return answer;
    }

    public static void main(String args[]) {

        int nums[] = { -1, 0, 1, 2, -1, -4 };

        List<List<Integer>> answer = threeSumOptimized(nums);

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
