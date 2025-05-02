
public class optimized {
    public static String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");

        String answer = "";
        for (int i = str.length - 1; i > 0; i--) {
            answer += str[i] + " ";
        }
        answer += str[0];

        return answer;

    }

    public static void main(String args[]) {

        String answer = reverseWords("a good   example");

        System.out.println(answer);
    }
}
