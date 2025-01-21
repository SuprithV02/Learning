class optimized {

    public void optimizedApproach(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int a = 0; a < matrix.length; a++) {
            int start = 0, end = matrix.length - 1;

            while (start < end) {
                int temp = matrix[a][start];
                matrix[a][start] = matrix[a][end];
                matrix[a][end] = temp;
                start++;
                end--;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        optimized o = new optimized();

        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        o.optimizedApproach(nums);

    }
}