
public class bruteForce {

    public static int findPlatform(int arr[], int dep[]) {

        int n = arr.length;
        int answer = 1;

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {

                if ((arr[i] >= arr[j] && arr[i] <= dep[j]) || (arr[i] <= arr[j] && dep[i] >= arr[j])) {
                    count++;
                }
            }

            answer = Math.max(count, answer);

        }

        return answer;
    }

    public static void main(String args[]) {

        int start[] = { 900, 940, 950, 1100, 1500, 1800 };
        int end[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int answer = findPlatform(start, end);

        System.out.println(answer);
    }
}
