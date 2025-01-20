
public class optimizedApproach {

    public static double optimizedApproachSolution(double x, int n) {
        double ans = 1.0;
        long nn = n;

        if (nn < 0)
            nn = -1 * nn;

        while (nn > 0) {
            if (nn % 2 == 1) {
                ans = ans * x;
                nn = nn - 1;
            } else {
                x = x * x;
                nn = nn / 2;
            }
        }

        if (n < 0)
            ans = 1.0 / ans;

        return ans;
    }

    public static void main(String args[]) {

        double x = 2.00000;
        int n = 10;

        double answer = optimizedApproachSolution(x, n);

        System.out.println(answer);
    }
}
