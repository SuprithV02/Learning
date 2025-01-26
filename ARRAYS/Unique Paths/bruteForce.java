
class bruteForce {

    public static int bruteForceApproach(int i, int j, int n, int m) {
        if (i == n - 1 || j == m - 1)
            return 1;
        if (i >= n || j >= m)
            return 0;
        else
            return bruteForceApproach(i + 1, j, n, m) + bruteForceApproach(i, j + 1, n, m);

    }

    public static void main(String args[]) {

        int n = 5, m = 4;

        int answer = bruteForceApproach(0, 0, n, m);

        System.out.println(answer);

    }
}