import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class moreOptimized {

    public static void moreOptimized(int index, int target, List<List<Integer>> answer, List<Integer> l,
            int[] candidates) {

        if (target == 0) {
            answer.add(new ArrayList<>(l));
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            if (candidates[i] > target) {
                break;
            }

            l.add(candidates[i]);
            moreOptimized(i + 1, target - candidates[i], answer, l, candidates);

            l.remove(l.size() - 1);
        }

    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> answer = new ArrayList<>();

        Arrays.sort(candidates);

        moreOptimized(0, target, answer, new ArrayList<>(), candidates);

        return answer;

    }

    public static void main(String args[]) {
        int[] array = { 10, 1, 2, 7, 6, 1, 5 };

        List<List<Integer>> answer = combinationSum2(array, 8);

        System.out.println(answer);
    }
}
