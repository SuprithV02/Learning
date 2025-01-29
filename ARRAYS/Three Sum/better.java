import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class better {

    public static List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;

        Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> hash = new HashSet<>();
            for (int j = i + 1; j < n; j++) {

                int third = -(nums[i] + nums[j]);
                if (hash.contains(third)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    temp.sort(null);
                    st.add(temp);
                }

                hash.add(nums[j]);
            }
        }

        List<List<Integer>> answer = new ArrayList<>(st);

        return answer;
    }

    public static void main(String args[]) {

        int nums[] = { -1, 0, 1, 2, -1, -4 };

        List<List<Integer>> answer = threeSum(nums);

        for (List<Integer> it : answer) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("]");
        }
        System.out.println();

    }
}
