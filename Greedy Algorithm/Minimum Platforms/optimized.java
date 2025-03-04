import java.util.Arrays;

public class optimized {

    public static int findPlatform(int arr[], int dep[]) {

        int n = arr.length;

        Arrays.sort(arr);
        Arrays.sort(dep);

        int platform = 0, count = 0;
        int i = 0, j = 0;

        while (i < n && j < n) {

            if (arr[i] <= dep[j]) {
                platform++;
                i++;
            }

            else if (arr[i] > dep[j]) {
                platform--;
                j++;
            }

            if (platform > count) {
                count = platform;
            }
        }

        return count;

    }

    public static void main(String args[]) {
        int start[] = { 1000, 935, 1100 };
        int end[] = { 1200, 1240, 1130 };
        int answer = findPlatform(start, end);

        System.out.println(answer);
    }
}
