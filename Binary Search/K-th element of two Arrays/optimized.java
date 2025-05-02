
public class optimized {

    public static int kthElement(int a[], int b[], int k) {
        int n1 = a.length;
        int n2 = b.length;

        int left = 0;
        int right = 0;
        int count = 0;

        while (left < n1 || right < n2) {
            if (a[left] < b[right]) {
                count++;
                if (count == k) {
                    return a[left];
                }
                left++;
            } else {
                count++;
                if (count == k) {
                    return b[right];
                }
                right++;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int a[] = { 100, 112, 256, 349, 770 };
        int b[] = { 72, 86, 113, 119, 265, 445, 892 };

        int answer = kthElement(a, b, 7);

        System.out.println(answer);
    }
}
