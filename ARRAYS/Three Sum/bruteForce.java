import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class bruteForce {

    public static List<List<Integer>> bruteForceApproach(int[] nums, int target) {

        int n = nums.length;
        Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; j < n; j++) {
                    if (nums[i] + nums[j] + nums[k] == target) {
                        List<Integer> li = Arrays.asList(nums[i], nums[j], nums[k]);
                        li.sort(null);
                        st.add(li);
                    }
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>(st);

        return ans;

    }

    public static void main(String args[]) {

        int nums[] = { -1, 0, 1, 2, -1, -4 };

        List<List<Integer>> answer = bruteForceApproach(nums, 0);

        for (List<Integer> it : answer) {
            System.out.print("[]");
            for (Integer i : it) {
                System.out.print(i);
            }
            System.out.print("]");
        }
        System.out.println();
    }
}