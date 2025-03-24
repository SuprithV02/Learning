import java.util.Arrays;

public class optimized {

        public static int optimizedApproach(int[] g, int[] s) {

            int answer = 0;

            if (s.length == 0)
                return 0;

            Arrays.sort(g);
            Arrays.sort(s);

            int i = 0, j = 0;

            while (i < g.length && j < s.length) {
                if (g[i] <= s[j]) {
                    answer++;
                    i++;
                }
                j++;
            }
            return answer;
        }

    public static void main(String args[]) {

        int[] g = { 1, 2 };
        int[] s = { 1, 2, 3 };

        int answer = optimizedApproach(g, s);

        System.out.println(answer);

    }
}
