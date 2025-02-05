import java.util.HashMap;

public class optimized {

    public static int optimizedApproach(String s) {

        HashMap<Character, Integer> m = new HashMap<>();

        int start = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (m.containsKey(ch)) {

                start = m.get(ch) + 1;

            }

            m.put(ch, i);
            max = Math.max(max, i - start + 1);
        }

        return max;
    }

    public static void main(String args[]) {

        String str = "dvdf";

        int answer = optimizedApproach(str);

        System.out.println(answer);
    }
}
