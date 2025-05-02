import java.util.ArrayList;
import java.util.List;

class optimized {

    public static boolean isPalindrome(String s, int i, int j) {

        while (i <= j) {
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        }

        return true;
    }

    public static void optimizedPartition(int index, String s, List<List<String>> res, List<String> palin) {

        if (index == s.length()) {
            res.add(new ArrayList<>(palin));
            return;
        }

        for (int i = index; i < s.length(); ++i) {
            if (isPalindrome(s, index, i)) {
                palin.add(s.substring(index, i + 1));
                optimizedPartition(i + 1, s, res, palin);
                palin.remove(palin.size() - 1);
            }
        }
    }

    public static List<List<String>> partition(String s) {

        List<List<String>> res = new ArrayList<>();
        List<String> palin = new ArrayList<>();

        optimizedPartition(0, s, res, palin);

        return res;
    }

    public static void main(String args[]) {

    }
}