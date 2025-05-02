class optimized {
    public static int myAtoi(String s) {

        s = s.trim();

        if (s.isEmpty()) {
            return 0;
        }

        boolean negative = false;

        int i = 0;

        if (s.charAt(0) == '-') {
            negative = true;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        int result = 0;
        int minDiv = Integer.MAX_VALUE / 10;

        while (i < s.length() && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            if (result > minDiv || (result == minDiv && digit > 7)) {
                return (negative) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return negative ? -result : result;

    }

    public static void main(String args[]) {

        String s = "1337c0d3";

        int answer = myAtoi(s);

        System.out.println(answer);
    }
}