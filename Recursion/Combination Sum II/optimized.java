import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class optimized {

    public static void optimizedApproach(int index, int target, List<Integer> l, int[] candidates,
            Set<List<Integer>> answer) {

        if (target == 0) {
            answer.add(new ArrayList<>(l));
            return;
        }

        if (index >= candidates.length || target < 0) {
            return;
        }

        l.add(candidates[index]);
        optimizedApproach(index + 1, target - candidates[index], l, candidates, answer);

        l.remove(l.size() - 1);

        optimizedApproach(index + 1, target, l, candidates, answer);

    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Set<List<Integer>> answer = new HashSet<>();
        List<Integer> l = new ArrayList<>();

        Arrays.sort(candidates);

        optimizedApproach(0, target, l, candidates, answer);

        return new ArrayList<>(answer);

    }

    public static void main(String args[]) {

        int[] array = { 10, 1, 2, 7, 6, 1, 5 };

        List<List<Integer>> answer = combinationSum2(array, 8);

        System.out.println(answer);
    }
}



//Time limit was exceeded due to the fact of using hashset, which takes a lot of time to check duplicates.
//So we can use the loop to check for each value as the value cannot be repeated.