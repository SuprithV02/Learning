import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class knap {
    int val, wt;

    knap(int val, int wt) {
        this.val = val;
        this.wt = wt;
    }
}

class knapsackComparator implements Comparator<knap> {

    @Override
    public int compare(knap k1, knap k2) {

        double r1 = (double) k1.val / k1.wt;
        double r2 = (double) k2.val / k2.wt;
        return Double.compare(r2, r1);
    }
}

public class optimized {

    public static double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {

        int n = val.size();

        knap[] newArray = new knap[n];

        for (int i = 0; i < n; i++) {
            newArray[i] = new knap(val.get(i), wt.get(i));
        }

        Arrays.sort(newArray, new knapsackComparator());

        double totalWt = 0.0, totalVal = 0.0;

        for (int i = 0; i < n; i++) {
            if (totalWt + newArray[i].wt <= capacity) {
                totalWt += newArray[i].wt;
                totalVal += newArray[i].val;
            } else {
                double remain = capacity - totalWt;
                totalVal += ((double) newArray[i].val / newArray[i].wt) * remain;
                break;
            }
        }

        return totalVal;

    }
}
