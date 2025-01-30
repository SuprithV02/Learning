import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class better {

    public static List<List<Integer>> fourSumBetter(int[] nums, int target) {

        int n = nums.length;

        Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Set<Integer> seen = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                    int number = target - (nums[i] + nums[j] + nums[k]);
                    if (seen.contains(number)) {
                        List<Integer> li = Arrays.asList(nums[i], nums[j], nums[k], number);
                        li.sort(null);
                        st.add(li);
                    }
                    seen.add(nums[k]);
                }
            }
        }

        List<List<Integer>> answer = new ArrayList<>(st);

        return answer;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 0, -1, 0, -2, 2 };

        List<List<Integer>> answer = fourSumBetter(nums, 0);

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
