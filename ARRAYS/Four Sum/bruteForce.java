import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class bruteForce {

    public static List<List<Integer>> fourSumBrute(int[] nums, int target) {

        int n = nums.length;

        Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        int sum = nums[i] + nums[j] + nums[k] + nums[l];
                        if (sum == target) {
                            List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                            list.sort(null);
                            st.add(list);
                        }
                    }
                }
            }
        }

        List<List<Integer>> answer = new ArrayList<>(st);

        return answer;
    }

    public static void main(String args[]) {

        int nums[] = { 1, 0, -1, 0, -2, 2 };

        List<List<Integer>> answer = fourSumBrute(nums, 0);

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
