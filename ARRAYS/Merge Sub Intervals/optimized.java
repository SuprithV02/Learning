import java.util.Arrays;

public class optimized {

    public static int[][] optimizedApproach(int[][] intervals) {

        int n = intervals.length;
        int[][] ans = new int[n][2];

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int index = 0;

        for (int i = 0; i < n; i++) {

            if (index == 0 || intervals[i][0] > ans[index - 1][1]) {
                ans[index][0] = intervals[i][0];
                ans[index][1] = intervals[i][1];
                index++;
            } else {
                ans[index - 1][1] = Math.max(ans[index - 1][1], intervals[i][1]);
            }

        }

        return Arrays.copyOf(ans, index);

    }

    public static void main(String args[]) {

        int[][] intervals = {
                { 1, 3 },
                { 2, 6 },
                { 8, 10 },
                { 15, 18 }
        };

        int[][] merged = optimizedApproach(intervals);

        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
