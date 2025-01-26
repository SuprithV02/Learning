public class optimizedButRecursive {

    public static int dynamicProgramming(int i, int j, int m, int n, int[][] dp) {
        if (i == (m - 1) && j == (n - 1))
            return 1;
        if (i >= m || j >= n)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];
        else
            return dp[i][j] = dynamicProgramming(i + 1, j, m, n, dp) + dynamicProgramming(i, j + 1, m, n, dp);
    }

    public static void main(String args[]) {

        int m = 5, n = 4;
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        
        int answer = dynamicProgramming(0, 0, m, n, dp);

        System.out.println(answer);
    }
}
