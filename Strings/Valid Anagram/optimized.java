
public class optimized {
    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            freq[ch - 'a']--;
            if (freq[ch - 'a'] < 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String args[]) {

        String s = "anagram";
        String t = "nagaram";

        Boolean answer = isAnagram(s, t);

        System.out.println(answer);

    }
}
