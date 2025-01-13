import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bruteForce {

    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        int len = A.size();
        int slow = A.get(0);
        int fast = A.get(0);

        ArrayList<Integer> result = new ArrayList<>();

        // Step 1: Find the meeting point in the cycle
        do {
            slow = A.get(slow - 1);
            fast = A.get(A.get(fast - 1) - 1);
        } while (slow != fast);

        // Step 2: Find the entry point of the cycle
        fast = A.get(0);
        while (slow != fast) {
            slow = A.get(slow - 1);
            fast = A.get(fast - 1);
        }

        // `slow` is now the repeated number
        int repeated = slow;

        // Step 3: Calculate the missing number
        long totalSum = (long) len * (len + 1) / 2;
        long sum = 0;

        for (int num : A) {
            sum += num;
        }

        int missing = (int) (totalSum - (sum - repeated));

        // Add to result list
        result.add(repeated);
        result.add(missing);

        return result;
    }

    public static void main(String args[]) {

        List<Integer> nums = Arrays.asList(3, 1, 2, 5, 3);

        ArrayList<Integer> ans = repeatedNumber(nums);

        Integer[] resultArray = ans.toArray(new Integer[0]);
        System.out.println("Result Array: " + Arrays.toString(resultArray));

    }
}
