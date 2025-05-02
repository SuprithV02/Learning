
public class nthRootNumber {

    public static int NthRoot(int n, int m) {
        int last = m, first = 1;

        while (first <= last) {
            int mid = (first + last) / 2;
            int ans = 1;
            for (int i = 0; i < n; i++) {

                ans = ans * mid;
            }
            if (ans == m)
                return mid;
            else if (m < ans)
                last = mid - 1;
            else
                first = mid + 1;
        }

        return -1;

    }

    public static void main(String args[]) {
        int n = 3, m = 27;

        int answer = NthRoot(n, m);

        System.out.println(answer);
    }
}
