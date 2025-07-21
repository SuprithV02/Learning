import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Job {
    int id, deadline, profit;

    Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

class jobComparator implements Comparator<Job> {

    @Override
    public int compare(Job j1, Job j2) {
        return Integer.compare(j2.profit, j1.profit);
    }
}

public class optimized {

    public static ArrayList<Integer> JobSequencing(int[] id, int[] deadline, int[] profit) {

        int n = id.length;

        Job arr[] = new Job[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Job(id[i], deadline[i], profit[i]);
        }

        Arrays.sort(arr, new jobComparator());

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].deadline > max)
                max = arr[i].deadline;
        }

        int hash[] = new int[max + 1];

        for (int i = 0; i < hash.length; i++) {
            hash[i] = -1;
        }

        int count = 0, countProfit = 0;

        for (int i = 0; i < n; i++) {
            for (int j = arr[i].deadline; j > 0; j--) { //This is basically checking if there is a space before the deadline. if so we can add the id to that
                if (hash[j] == -1) {
                    hash[j] = arr[i].id;
                    count++;
                    countProfit += arr[i].profit;
                    break;
                }
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        result.add(count);
        result.add(countProfit);

        return result;

    }

    public static void main(String args[]) {

        int[] id = { 1, 2, 3, 4 };
        int[] deadline = { 4, 1, 1, 1 };
        int[] profit = { 20, 1, 40, 30 };

        ArrayList<Integer> answer = JobSequencing(id, deadline, profit);

        for (int a : answer) {
            System.out.println(a);
        }

    }
}
