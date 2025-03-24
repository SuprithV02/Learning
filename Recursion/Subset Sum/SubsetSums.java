import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SubsetSums {

    public static void subSetRecursion(int index, int sum, int[] arr, ArrayList<Integer> answer, int N) {

        if (index == N) {
            answer.add(sum);
            return;
        }

        subSetRecursion(index + 1, sum, arr, answer, N);
        subSetRecursion(index + 1, sum + arr[index], arr, answer, N);

    }

    public static ArrayList<Integer> subsetSums(int[] arr) {

        int N = arr.length;

        ArrayList<Integer> answer = new ArrayList<>();
        subSetRecursion(0, 0, arr, answer, N);
        Collections.sort(answer);
        return answer;

    }

    public static void main(String args[]) {

        int[] arr = { 5, 2, 1 };

        ArrayList<Integer> answer = subsetSums(arr);

        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }

    }
}
