package ArraysProblem;

public class RotateMatrix {

    static int[][] rotateBF(int[][] matrix) {
        int n = matrix.length;
        int rotated[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - i - 1] = matrix[i][j];
            }
        }
        return rotated;
    }


    /*
    Better Approach

    1) Transpose means col to row
    2) then just reverse every row

        Basically diagonals are not changing

        Swapped values
        [0][1] = [1][0]
        [0]2[2] = [2][0]
        [0][3] = [3][0]
        ... so on

        So transervsing is like this
        0 -> (1 to 3 ) i -> (i+1 n-1)
        1 -> (2 to 3)

      */
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transposing the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = n - 1;
            while (start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }

}
