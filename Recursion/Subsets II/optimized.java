import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class optimized {

    public static void optimizedApproach(int index, List<List<Integer>> answer, int n, int[] nums, List<Integer> curr) {

        if (index == n) {
            answer.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[index]);

        optimizedApproach(index + 1, answer, n, nums, curr);

        curr.remove(curr.size() - 1);

        while (index + 1 < n && nums[index] == nums[index + 1]) {
            index++;
        }

        optimizedApproach(index + 1, answer, n, nums, curr);

    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        Arrays.sort(nums);

        optimizedApproach(0, answer, nums.length, nums, curr);

        return answer;

    }

    public static void main(String args[]) {

        int[] array = { 1, 2, 2 };

        List<List<Integer>> result = subsetsWithDup(array);

        System.out.println(result);

    }
}
