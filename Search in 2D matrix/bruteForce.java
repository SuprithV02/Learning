
public class bruteForce {

    public static boolean searchIn2DMatrix(int[][] nums, int number) {
        int rowLength = nums.length;
        int colLength = nums[0].length;

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (nums[i][j] == number) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String args[]) {

        int nums[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int number = 11;

        boolean b = searchIn2DMatrix(nums, number);

        System.out.println(b);

    }
}
