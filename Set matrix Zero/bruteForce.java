
class bruteForce {

    public void bruteForceApproach(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    for (int x = 0; x < matrix.length; x++) {
                        if (matrix[x][j] != 0)
                            matrix[x][j] = -1;
                    }
                    for (int y = 0; y < matrix[0].length; y++) {
                        if (matrix[i][y] != 0)
                            matrix[i][y] = -1;
                    }
                }
            }
        }

        for (int a = 0; a < matrix.length; a++) {
            for (int b = 0; b < matrix[0].length; b++) {
                if (matrix[a][b] == -1) {
                    matrix[a][b] = 0;
                }
            }
        }
    }

    public static void main(String args[]) {
        bruteForce obj = new bruteForce();

        int arr[][] = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

        obj.bruteForceApproach(arr);

        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[0].length; b++) {
                System.out.print(arr[a][b]);
            }
            System.out.println();
        }

    }
}
