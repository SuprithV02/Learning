
class optimized {

    public void optimizedApproach(int[][] matrix) {
        int col0 = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;

                    if (j == 0) {
                        col0 = 0;
                    } else {
                        matrix[0][j] = 0;
                    }
                }

                //we are not using the below code because, why to handle the first column separetely when we can combine in a single if
                // if (matrix[i][0] == 0) {
                // col0 = 0;
                // }

                // if (matrix[i][j] == 0) {
                // matrix[i][0] = 0;
                // matrix[0][j] = 0;
                // }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        if (matrix[0][0] == 0) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }

        if (col0 == 0) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][0] = 0;
            }
        }
    }

    public static void main(String args[]) {
        optimized obj = new optimized();

        int arr[][] = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

        obj.optimizedApproach(arr);

        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[0].length; b++) {
                System.out.print(arr[a][b]);
            }
            System.out.println();
        }

    }
}
