import java.util.Stack;

public class bruteForce {
    public static String reverseWords(String s) {

        String individualString = "";
        Stack<String> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                st.push(individualString);
                individualString = "";
            } else {
                individualString += s.charAt(i);
            }
        }

        String ans = "";

        while (st.size() != 1) {
            ans += st.peek() + " ";
            st.pop();
        }
        ans += st.peek();

        return ans;
    }

    public static void main(String args[]) {

        String s = "the sky is blue";

        String answer = reverseWords(s);

        System.out.println(answer);
    }
}
