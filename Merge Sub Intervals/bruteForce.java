import java.util.Arrays;

class bruteForce {

    public int[][] bruteForceApproach(int[][] intervals) {

        int n = intervals.length;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[][] ans = new int[n][2];   //extra space 
        int index = 0;
        for (int i = 0; i < n; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (index > 0 && end <= ans[index - 1][1]) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (end >= intervals[j][0]) {
                    end = Math.max(intervals[j][1], end);
                } else {
                    break;
                }
            }

            ans[index][0] = start;
            ans[index][1] = end;
            index++;
        }

        int[][] result = new int[index][2];
        for (int i = 0; i < index; i++) {
            result[i][0] = ans[i][0];
            result[i][1] = ans[i][1];
        }

        return result;

    }

    public static void main(String args[]) {
        bruteForce b = new bruteForce();

        int nums[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

        int[][] merged = b.bruteForceApproach(nums);
        
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }
}