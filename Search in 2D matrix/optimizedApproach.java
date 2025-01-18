
public class optimizedApproach {

    public static boolean searchIn2DMatrixOptimized(int[][] matrix, int target) {

        int colLength = matrix[0].length;
        int low = 0;
        int high = matrix.length * matrix[0].length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int element = matrix[mid / colLength][mid % colLength];
            if (element == target) {
                return true;
            } else if (element < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

            mid = (low + high) / 2;

        }

        return false;
    }

    public static void main(String args[]) {

        int nums[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int number = 13;

        boolean b = searchIn2DMatrixOptimized(nums, number);

        System.out.println(b);
    }
}
