import java.util.ArrayList;
import java.util.List;

public class optimized {

    public static void optimizedApproach(int index, int target, List<Integer> l, List<List<Integer>> answer,
            int[] candidates) {

        if (target == 0) {
            answer.add(new ArrayList<>(l));
            return;
        }

        if (index >= candidates.length || target < 0)
            return;

        l.add(candidates[index]);
        optimizedApproach(index, target - candidates[index], l, answer, candidates);

        l.remove(l.size() - 1);

        optimizedApproach(index + 1, target, l, answer, candidates);

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> l = new ArrayList<>();

        optimizedApproach(0, target, l, answer, candidates);

        return answer;

    }

    public static void main(String args[]) {

        int[] nums = { 2, 3, 6, 7 };

        List<List<Integer>> answer = combinationSum(nums, 7);

        System.out.println(answer);

    }
}
