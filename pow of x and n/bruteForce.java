
public class bruteForce {

    public static double pow(double x, int n) {

        double answer = 1.0;

        for (int i = 1; i <= n; i++) {
            answer *= x;
        }

        return answer;
    }

    public static double bruteForceApproach(double x, int n) {

        double ans;
        if (n < 0) {
            ans = 1 / pow(x, -n);
        } else {
            ans = pow(x, n);
        }

        return ans;
    }

    public static void main(String args[]) {

        double x = 2.00000;
        int n = -2;

        double answer = bruteForceApproach(x, n);

        System.out.println(answer);
    }
}
